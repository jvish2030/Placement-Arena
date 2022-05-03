         /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.placement.struts2.actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
import com.placement.service.Emailer;
import com.placement.service.UserService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

/**
 *
 * @author jatin
 */
@Namespace("/")
@ResultPath("/Login_Module")
@Action(value = "signup", results = {
    @Result(name = SUCCESS, location = "sign-in.jsp")
    , @Result(name = "input", location = "sign-up.jsp")
    , @Result(name = "email-exists", location = "sign-in.jsp")
    , @Result(name = "failure", location = "failure.jsp")

})
public class SignupAction extends ActionSupport {

    private String pagename;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public String getPagename() {
        return pagename;
    }

    public void setPagename(String pagename) {
        this.pagename = pagename;
    }

    public String getFirstname() {
        return firstname;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "FirstName is a required field")
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "LastName is a required field")
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Email is a required field")
    @EmailValidator(type = ValidatorType.FIELD, message = "Please input valid email!")
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Password is a required field")
    @StringLengthFieldValidator(type = ValidatorType.FIELD, maxLength = "12", minLength = "5", message = "Password must be of length between 5 and 12")
    public void setPassword(String signupPassword) {
        this.password = signupPassword;
    }

    @Override
    public String execute() throws Exception {
        String result;
        int id;
        UserService userService = new UserService();

        if (pagename != null) {
            if (pagename.equals("signup")) {
                result = userService.save(firstname, lastname, email, password);
                System.out.println(result);
                switch (result) {
                    case "SignupSuccess":
                        addActionMessage("You have Successfully Registered!");
                        id = userService.getUniqueId(getEmail());
                        String status = Emailer.sendEmailTo(getFirstname(), getEmail(), getPassword(), id);
                        if (status.equals("success")) {
                            addActionMessage("login credentials send to your " + getEmail());
                        }
                        return SUCCESS;
                    case "SignupFailure-EmailExists":
                        addActionMessage("Email already exists.");
                        return "email-exists";
                    default:
                        return "failure";
                }
            }
        }
        return "success";
    }
}

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
@Action(value = "signin", results = {
    @Result(name = SUCCESS, type = "redirectAction", params = {"namespace", "/", "actionName", "Placement-Arena"})
    , @Result(name = "input", location = "sign-in.jsp")
    , @Result(name = "failure", location = "sign-in.jsp")
    , @Result(name = "admin-page", type = "redirectAction", params = {"namespace", "/", "actionName", "admin-page", "pageName","admin"})

})
public class LoginAction extends ActionSupport {

    private String pageName;
    private String email;
    private String password;
    private String uniqueId;

    public String getUniqueId() {
        return uniqueId;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Unique Id is a required field")
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getEmail() {
        return email;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Email is a required field")
    @EmailValidator(type = ValidatorType.FIELD, fieldName = "emailaddress", message = "You must enter a value for email.")
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Password is a required field")
    @StringLengthFieldValidator(type = ValidatorType.FIELD, maxLength = "12", minLength = "5", message = "Password must be of length between 5 and 12")
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {
        String result;
        UserService userService = new UserService();

        if (pageName != null) {
            if (pageName.equals("login")) {
                result = userService.findByLogin(email, password , uniqueId);
                System.out.println("result :"+result);
                if (result.equals("LoginFailure")) {
                    addActionError("Invalid credentials. Please try again.");
                    return "failure";
                } else {
                    result = userService.findIfAdmin(email);
                    System.out.println("res2  "+result);
                    if (result.equalsIgnoreCase("admin")) {
                        return "admin-page";
                    }
                    return "success";
                }
            }
        }
        return "success";
    }
}

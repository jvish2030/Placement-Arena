/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts2.home.actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
import com.placement.service.UserService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

/**
 *
 * @author jatin
 */
@Namespace("/")
@ResultPath("/Home_Module")
@ParentPackage(value = "myPackage")
@InterceptorRef("jsonValidationWorkflowStack")
@Validations(requiredStrings = {
    @RequiredStringValidator(fieldName = "name", type = ValidatorType.FIELD, message = " Please enter your name")
    , @RequiredStringValidator(fieldName = "phone", type = ValidatorType.FIELD, message = "Enter your phone number")
    , @RequiredStringValidator(fieldName = "subject", type = ValidatorType.FIELD, message = "Please Enter subject")
    , @RequiredStringValidator(fieldName = "email", type = ValidatorType.FIELD, message = "Please Enter Email")
    , @RequiredStringValidator(fieldName = "department", type = ValidatorType.FIELD, message = "Department is required")

}
)
public class MakeAppointmentAction extends ActionSupport {

    private String pagename;
    private String name;
    private String email;
    private String phone;
    private String subject;
    private String message;
    private String department;

    public String getPagename() {
        return pagename;
    }

    public void setPagename(String pagename) {
        this.pagename = pagename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDepartment() {
        return department;
    }

    @RequiredFieldValidator(fieldName = "department", type = ValidatorType.FIELD, message = "Please Enter Department")
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    @EmailValidator(type = ValidatorType.SIMPLE, fieldName = "email", message = "You must enter a valid email.")
    public void setEmail(String email) {
        this.email = email;
    }

    @Action(value = "appointment", results = {
        @Result(name = SUCCESS, location = "Success/appSuccess.jsp")
        ,@Result(name = INPUT, location = "home.jsp")}
    )

    @Override
    public String execute() throws Exception {
        String result;
        UserService userService = new UserService();
        if (pagename != null) {
            if (pagename.equals("appointment")) {
                result = userService.saveappointment(name, email, department, subject, message, phone);
                switch (result) {
                    case "appointementSuccess":
                        setName("");
                        setEmail("");
                        setDepartment("");
                        setMessage("");
                        setPhone("");
                        setSubject("");
                        addActionMessage("You have Successfully Requested for the Appointement");
                        return SUCCESS;
                    case "appointementFailure":
                        addActionMessage("You failed to set appointment");
                        return "failed to set";
                    default:
                        return "failure";
                }
            }
        }
        return "success";
    }
}

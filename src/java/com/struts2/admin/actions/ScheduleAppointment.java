/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts2.admin.actions;

import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.FieldExpressionValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
import com.placement.service.AdminService;
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
@ResultPath("/Admin_Module")
@ParentPackage(value = "myPackage")
@InterceptorRef("jsonValidationWorkflowStack")
@Validations(fieldExpressions = {
    @FieldExpressionValidator(fieldName = "date_time", expression = "!date_time.trim().isEmpty()", message = " Please select date & time."),}
)
public class ScheduleAppointment extends ActionSupport {

    private String date_time;
    private String modalid;
    private String uname;
    private String email;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getModalid() {
        return modalid;
    }

    public void setModalid(String modalid) {
        this.modalid = modalid;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    @Action(value = "scheduleApp", results = {
        @Result(name = SUCCESS, location = "component/actionMessage.jsp")
        ,
    @Result(name = INPUT, location = "component/actionMessage.jsp")
    }
    )

    @Override
    public String execute() throws Exception {
        String status = new AdminService().sendAppointmentEmail(uname, email, date_time);
        if (status.equals(SUCCESS)) {
            addActionMessage("Appointment is schedule on " + date_time + "!");
        } else {
            addActionError("error scheduling appointment, try again!!");
        }
        return (status.equals(SUCCESS)) ? SUCCESS : ERROR;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts2.home.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

/**
 *
 * @author jatin
 */
@Namespace("/")
@ResultPath("/Home_Module")
public class HomeSwitchAction {

    @Action(value = "DiplomaStudReg", results = {
        @Result(name = "success", location = "DiplomaStudentRegister.jsp")})
    public String registerDiploma() throws Exception {
        return "success";
    }

    @Action(value = "StudReg", results = {
        @Result(name = "success", location = "StudentRegister.jsp")})
    public String register12th() throws Exception {
        return "success";
    }

    @Action(value = "register", results = {
        @Result(name = "success", location = "registerPanel.jsp")})
    public String register() throws Exception {
        return "success";
    }

    @Action(value = "placedStudent", results = {
        @Result(name = "success", location = "placedStudent.jsp")})
    public String placedStudent() throws Exception {
        return "success";
    }

    @Action(value = "recuriters", results = {
        @Result(name = "success", location = "recuriters.jsp")})
    public String recuriters() throws Exception {
        return "success";
    }

    @Action(value = "persistent", results = {
        @Result(name = "success", location = "persistent.jsp")})
    public String persistent() throws Exception {
        return "success";
    }

}

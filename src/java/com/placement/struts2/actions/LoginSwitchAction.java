/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.placement.struts2.actions;

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
public class LoginSwitchAction {

    @Action(value = "", results = {
        @Result(name = "success", location = "sign-in.jsp")})
    public String run() throws Exception {
        return "success";
    }

    @Action(value = "signup-page", results = {
        @Result(name = "success", location = "sign-up.jsp")})
    public String signupPage() throws Exception {
        return "success";
    }

    @Action(value = "signin-page", results = {
        @Result(name = "success", location = "sign-in.jsp")})
    public String signinPage() throws Exception {
        return "success";
    }

}

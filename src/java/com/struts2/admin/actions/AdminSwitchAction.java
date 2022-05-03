/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts2.admin.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

/**
 *
 * @author jatin
 */
@Namespace("/")
@ResultPath("/Admin_Module")
public class AdminSwitchAction {
     @Action(value = "table", results = {
        @Result(name = "success", location = "studentTable.jsp")})
    public String table() throws Exception {
        return "success";
    }
}

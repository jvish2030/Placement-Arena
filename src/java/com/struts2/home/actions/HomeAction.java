/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts2.home.actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.placement.service.AdminService;
import com.placement.service.UserService;
import com.placement.util.MethodsUtil;
import java.sql.ResultSet;
import org.apache.struts2.convention.annotation.Action;
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
public class HomeAction extends ActionSupport {

    private final UserService userService;
    private ResultSet resultset;
    private String cseValue;
    private String eeValue;
    private String etcValue;
    private String mechValue;

    public HomeAction() {
        userService = new UserService();
    }

    public String getCseValue() {
        return cseValue;
    }

    public void setCseValue(String cseValue) {
        this.cseValue = cseValue;
    }

    public String getEeValue() {
        return eeValue;
    }

    public void setEeValue(String eeValue) {
        this.eeValue = eeValue;
    }

    public String getEtcValue() {
        return etcValue;
    }

    public void setEtcValue(String etcValue) {
        this.etcValue = etcValue;
    }

    public String getMechValue() {
        return mechValue;
    }

    public void setMechValue(String mechValue) {
        this.mechValue = mechValue;
    }

    @Action(value = "Placement-Arena", results = {
        @Result(name = SUCCESS, location = "home.jsp")
    })
    public String FetchUserPanelInfo() throws Exception {
        resultset = userService.getAllPlRatio();
        if (resultset != null) {
            if (resultset.next()) {
                setCseValue(resultset.getString(1));
                setEeValue(resultset.getString(2));
                setEtcValue(resultset.getString(3));
                setMechValue(resultset.getString(4));
            }
        }

        return "success";
    }

}

/*
 *  To change this license header, choose License Headeresultset in Project Properties.
 *  To change this template file, choose Tools | Templates
 *  and open the template in the editor.
 */
package com.struts2.admin.actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;

import com.placement.model.Appointment;
import com.placement.service.AdminService;
import com.placement.util.MethodsUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
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
@ResultPath("/Admin_Module")
@ParentPackage(value = "myPackage")

public class AdminAction extends ActionSupport {

    private AdminService adminService;

    public AdminAction() {
        adminService = new AdminService();
    }

    private String pageName;
    private List<Appointment> dataList;
    private Appointment appointment;
    private ResultSet resultset;
    private Integer id;
    private String cseValue;
    private String eeValue;
    private String etcValue;
    private String mechValue;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Appointment> getDataList() {
        return dataList;
    }

    public void setDataList(List<Appointment> dataList) {
        this.dataList = dataList;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    @Action(value = "admin-page", results = {
        @Result(name = SUCCESS, location = "dashboard.jsp")
    })
    public String FetchAdminPanelInfo() throws Exception {
        adminService = new AdminService();
        if (pageName != null) {
            if (pageName.equals("admin")) {
                setDataList(MethodsUtil.getNewAppointmentList());
                resultset = adminService.getAllPlRatio();
                if (resultset != null) {
                    if (resultset.next()) {
                        setCseValue(resultset.getString(1));
                        setEeValue(resultset.getString(2));
                        setEtcValue(resultset.getString(3));
                        setMechValue(resultset.getString(4));
                    }
                }
            }
        }
        return "success";
    }

    @Action(value = "deleteApp", results = {
        @Result(name = SUCCESS, location = "component/AppointmentList.jsp")
    })
    public String delete() throws SQLException {
        String status = new AdminService().deleteAppointment(this.id);
        if (status.equals("deleted")) {
            addActionMessage("Appointment deleted successfully!");
            setDataList(MethodsUtil.getNewAppointmentList());
            return "success";

        } else {
            return "error";
        }
    }

    @Action(value = "cseslider", results = {
        @Result(name = "success", type = "json")
    })
    public String cseSlider() throws SQLException {
        System.out.println("admin");
        adminService = new AdminService();
        String status = adminService.setCsePlRatio(cseValue);
        return (status.equals(SUCCESS)) ? SUCCESS : ERROR;
    }

    @Action(value = "eeslider", results = {
        @Result(name = "success", type = "json")
    })
    public String eeSlider() throws SQLException {
        adminService = new AdminService();
        String status = adminService.setEePlRatio(eeValue);
        return (status.equals(SUCCESS)) ? SUCCESS : ERROR;
    }

    @Action(value = "etcslider", results = {
        @Result(name = "success", type = "json")
    })
    public String etcSlider() throws SQLException {
        adminService = new AdminService();
        String status = adminService.setEtcPlRatio(etcValue);
        return (status.equals(SUCCESS)) ? SUCCESS : ERROR;
    }

    @Action(value = "mechslider", results = {
        @Result(name = "success", type = "json")
    })
    public String mechSlider() throws SQLException {
        adminService = new AdminService();
        String status = adminService.setMechPlRatio(mechValue);
        return (status.equals(SUCCESS)) ? SUCCESS : ERROR;
    }
}

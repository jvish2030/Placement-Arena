/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.placement.service;

import com.placement.dao.AdminRepository;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jatin
 */
public class AdminService {

    private final AdminRepository dao;
    private ResultSet rs;

    public AdminService() {
        dao = new AdminRepository();
    }

    public ResultSet getAppointmentInfo() throws SQLException {
        rs = dao.getSudentAppointment();
        return (rs.wasNull()) ? rs : null;

    }

    public String deleteAppointment(Integer id) {
        boolean status = dao.deleteStudentAppointment(id);
        return status ? "deleted" : "error";
    }

    public String sendAppointmentEmail(String uname, String email, String date_time) {
        boolean status = new Emailer().sendAppointmentEmail(uname, email, date_time);
        return status ? "success" : "error";

    }

    public String setCsePlRatio(String cseValue) {
        boolean status = dao.saveCsePlRatio(cseValue);
        return status ? "success" : "error";

    }

    public String setEePlRatio(String eeValue) {
        boolean status = dao.saveEePlRatio(eeValue);
        return status ? "success" : "error";
    }

    public String setEtcPlRatio(String etcValue) {
        boolean status = dao.saveEtcPlRatio(etcValue);
        return status ? "success" : "error";
    }

    public String setMechPlRatio(String mechValue) {
        boolean status = dao.saveMechPlRatio(mechValue);
        return status ? "success" : "error";
    }

    public ResultSet getAllPlRatio() throws SQLException {
        rs = dao.getAllPlRatioFromDb();
        return (rs!=null) ? rs : null;

    }

    public ResultSet getStudentInfo() throws SQLException {
        rs = dao.getStudentInfoFromDb();
        return (rs!=null) ? rs : null;
    }
}

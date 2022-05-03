/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.placement.util;

import com.placement.model.Appointment;
import com.placement.service.AdminService;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jatin
 */
public class MethodsUtil {

    public static List<Appointment> getNewAppointmentList() throws SQLException {
        Appointment appointment;
        ResultSet resultset;
        List list = new ArrayList<>();
        resultset =new AdminService().getAppointmentInfo();
        
        if (resultset != null) {
            while (resultset.next()) {
                appointment = new Appointment();

                appointment.setAppId(resultset.getString("appId"));
                appointment.setUname(resultset.getString("uname"));
                appointment.setEmail(resultset.getString("email"));
                appointment.setDepart(resultset.getString("depart"));
                appointment.setSubject(resultset.getString("subject"));
                appointment.setMessage(resultset.getString("message"));
                appointment.setPhone(resultset.getString("phone"));
                appointment.setDate(resultset.getDate("appdate"));

                list.add(appointment);
            }
        }
        return list;
    }

    public static List<Appointment> getStudentsList() throws SQLException {
        Appointment appointment;
        ResultSet resultset;
        List list = new ArrayList<>();
        resultset =new AdminService().getAppointmentInfo();
        
        if (resultset != null) {
            while (resultset.next()) {
                appointment = new Appointment();
                appointment.setAppId(resultset.getString("appId"));
                appointment.setUname(resultset.getString("uname"));
                appointment.setEmail(resultset.getString("email"));
                appointment.setDepart(resultset.getString("depart"));
                appointment.setSubject(resultset.getString("subject"));
                appointment.setMessage(resultset.getString("message"));
                appointment.setPhone(resultset.getString("phone"));
                appointment.setDate(resultset.getDate("appdate"));
                list.add(appointment);
            }
        }
        return list;
    }
    
    
    public static Float studentAggregate(float totalMarks, float totalMarksObtain) {
        float res = (totalMarksObtain / totalMarks) * 100;
        return Float.parseFloat(String.format("%.2f", res));
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.placement.dao;

import com.placement.util.DbUtil;
import static com.placement.util.DbUtil.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jatin
 */
public class AdminRepository {

    private final Connection dbConnection;

    public AdminRepository() {
        dbConnection = DbUtil.getConnection();
    }

    public ResultSet getSudentAppointment() {
        try {
            ResultSet rs;
            String sql = "SELECT * FROM APPOINTEMENT ORDER BY APPDATE DESC";
            PreparedStatement ps = dbConnection.prepareStatement(sql);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(AdminRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean deleteStudentAppointment(Integer id) {
        int i = 0;
        try {

            String sql = "DELETE FROM APPOINTEMENT WHERE APPID = ?";
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setString(1, id.toString());
            i = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AdminRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i > 0;
    }

    public boolean saveCsePlRatio(String cseValue) {
        System.out.println("dao");
        int value = 0;
        if (dbConnection != null) {
            try {
                PreparedStatement prepStatement = dbConnection.prepareStatement("UPDATE PLRATIO SET CSE = ? WHERE ID = 999");
                prepStatement.setString(1, cseValue);
                value = prepStatement.executeUpdate();
            } catch (SQLException e) {
            }
        }
        return value > 0;
    }

    public boolean saveEePlRatio(String eeValue) {
        int value = 0;
        if (dbConnection != null) {
            try {
                PreparedStatement prepStatement = dbConnection.prepareStatement("UPDATE PLRATIO SET EE = ? WHERE ID = 999");
                prepStatement.setString(1, eeValue);
                value = prepStatement.executeUpdate();
            } catch (SQLException e) {
            }
        }
        return value > 0;
    }

    public boolean saveEtcPlRatio(String etcValue) {
        int value = 0;
        if (dbConnection != null) {
            try {
                PreparedStatement prepStatement = dbConnection.prepareStatement("UPDATE PLRATIO SET ETC = ? WHERE ID = 999");
                prepStatement.setString(1, etcValue);
                value = prepStatement.executeUpdate();
            } catch (SQLException e) {
            }
        }
        return value > 0;
    }

    public boolean saveMechPlRatio(String mechValue) {
        int value = 0;
        if (dbConnection != null) {
            try {
                PreparedStatement prepStatement = dbConnection.prepareStatement("UPDATE PLRATIO SET MECH = ? WHERE ID = 999");
                prepStatement.setString(1, mechValue);
                value = prepStatement.executeUpdate();
            } catch (SQLException e) {
            }
        }
        return value > 0;
    }

    public ResultSet getAllPlRatioFromDb() {
        try {
            ResultSet rs;
            String sql = "SELECT * FROM PLRATIO";
            PreparedStatement ps = dbConnection.prepareStatement(sql);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(AdminRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ResultSet getStudentInfoFromDb() {
        try {
            ResultSet rs;
            String sql = "SELECT * FROM STUDENT";
            PreparedStatement ps = dbConnection.prepareStatement(sql);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(AdminRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}

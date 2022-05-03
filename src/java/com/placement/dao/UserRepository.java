/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.placement.dao;

import com.placement.util.DbUtil;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jatin
 */
public class UserRepository {

    private final Connection dbConnection;

    //user service costructor instantiating dbConnection obj
    public UserRepository() {
        dbConnection = DbUtil.getConnection();
    }

    public boolean save(String firstName, String lastName, String email, String password) {
        int value = 0;
        if (dbConnection != null) {
            try {
                PreparedStatement prepStatement = dbConnection
                        .prepareStatement("insert into users(firstname, lastname, email , password ) values (?, ?, ?, ?)");
                prepStatement.setString(1, firstName);
                prepStatement.setString(2, lastName);
                prepStatement.setString(3, email);
                prepStatement.setString(4, password);
                value = prepStatement.executeUpdate();
            } catch (SQLException e) {
            }
        }
        return value > 0;
    }

    public boolean findByEmail(String email) {
        if (dbConnection != null) {
            try {
                PreparedStatement prepStatement = dbConnection
                        .prepareStatement("select count(*) from users where email = ?");
                prepStatement.setString(1, email);

                ResultSet result = prepStatement.executeQuery();
                if (result != null) {
                    while (result.next()) {
                        if (result.getInt(1) == 1) {
                            return true;
                        }
                    }
                }
            } catch (SQLException e) {
            }
        }
        return false;
    }

    public boolean findByLogin(String email, String password, String uniqueId) {
        if (dbConnection != null) {
            try {
                PreparedStatement prepStatement = dbConnection
                        .prepareStatement("select userid, password from users where email = ?");
                prepStatement.setString(1, email);

                ResultSet result = prepStatement.executeQuery();
                if (result.next()) {
                    if (result.getString(1).equals(uniqueId) && result.getString(2).equals(password)) {
                        return true;
                    }
                }
            } catch (SQLException e) {
            }
        }
        return false;
    }

    public boolean findIfAdmin(String email) {
        if (dbConnection != null) {
            try {
                PreparedStatement prepStatement = dbConnection
                        .prepareStatement("select role from users where email = ?");
                prepStatement.setString(1, email);

                ResultSet result = prepStatement.executeQuery();
                if (result.next()) {
                    if (result.getString(1).equalsIgnoreCase("admin")) {
                        return true;
                    }
                }
            } catch (SQLException e) {
            }
        }
        return false;
    }

    public int getUserId(String email) {
        int userid = 0;
        if (dbConnection != null) {
            try {
                PreparedStatement prepStatement = dbConnection
                        .prepareStatement("select userid from users where email = ?");
                prepStatement.setString(1, email);

                ResultSet result = prepStatement.executeQuery();

                if (result.next()) {
                    userid = result.getInt(1);
                }

            } catch (SQLException e) {
            }
        }
        return userid;
    }

    public boolean saveappointment(String uname, String email, String depart, String subject, String message, String phone) {
        int value = 0;
        if (dbConnection != null) {
            try {
                PreparedStatement prepStatement = dbConnection
                        .prepareStatement("insert into appointement(uname, email, depart ,subject, message ,phone ) values (?, ?, ?, ?,?,?)");
                prepStatement.setString(1, uname);
                prepStatement.setString(2, email);
                prepStatement.setString(3, depart);
                prepStatement.setString(4, subject);
                prepStatement.setString(5, message);
                prepStatement.setString(6, phone);
                value = prepStatement.executeUpdate();
            } catch (SQLException e) {
            }
        }
        return value > 0;
    }

    public boolean saveStudentInfoToDb(String rollNumber, String firstName, String middleName, String lastName, String fullName, String personalContactNumber, String parentContactNumber, String email, Integer admissionyear, String enrollmentNumber, Date dateOfBirth, String department, File[] file, String[] fileContentType, String[] fileFileName, String localAddress, String permanentAddress, Integer sscPassingYear, String sscBoard, Float sscPercentage, Integer hscPassingYear, String hscBoard, Float hscPercentage, Integer firstSemMarksObtain, Integer firstSemTotalMarks, Float firstSemPercentage, Integer secondSemMarksObtain, Integer secondSemTotalMarks, Float secondSemPercentage, Integer thirdSemMarksObtain, Integer thirdSemTotalMarks, Float thirdSemPercentage, Integer fourthSemMarksObtain, Integer fourthSemTotalMarks, Float fourthSemPercentage, Integer fifthSemMarksObtain, Integer fifthSemTotalMarks, Float fifthSemPercentage, Integer sixthSemMarksObtain, Integer sixthSemTotalMarks, Float sixthSemPercentage, Float aggregateUpto6th, Integer firstSemActiveBacklog, Integer firstSemBacklogHistory, Integer secondSemActiveBacklog, Integer secondSemBacklogHistory, Integer thirdSemActiveBacklog, Integer thirdSemBacklogHistory, Integer fourthSemActiveBacklog, Integer fourthSemBacklogHistory, Integer fifthSemActiveBacklog, Integer fifthSemBacklogHistory, Integer sixthSemActiveBacklog, Integer sixthSemBacklogHistory, Integer totalCurrentBacklog, Integer totalHistoryBacklog, String passport, String cv, Integer batch) {
        long t = dateOfBirth.getTime();
        java.sql.Date sqlDate = new java.sql.Date(t);
        String q = "insert into student(rollNumber, firstName, middleName, lastName, fullName, personalContactNumber, parentContactNumber, email, admissionyear, enrollmentNumber, dateOfBirth, department, localAddress, permanentAddress, sscPassingYear, sscBoard, sscPercentage, hscPassingYear, hscBoard, hscPercentage, firstSemMarksObtain, firstSemTotalMarks, firstSemPercentage, secondSemMarksObtain, secondSemTotalMarks, secondSemPercentage, thirdSemMarksObtain, thirdSemTotalMarks, thirdSemPercentage, fourthSemMarksObtain, fourthSemTotalMarks, fourthSemPercentage, fifthSemMarksObtain, fifthSemTotalMarks, fifthSemPercentage, sixthSemMarksObtain, sixthSemTotalMarks, sixthSemPercentage, aggregateUpto6th, firstSemActiveBacklog, firstSemBacklogHistory, secondSemActiveBacklog, secondSemBacklogHistory, thirdSemActiveBacklog, thirdSemBacklogHistory, fourthSemActiveBacklog, fourthSemBacklogHistory, fifthSemActiveBacklog, fifthSemBacklogHistory, sixthSemActiveBacklog, sixthSemBacklogHistory, totalCurrentBacklog, totalHistoryBacklog, passport, cv, batch)Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        int value = 0;
        if (dbConnection != null) {
            try {
                PreparedStatement prepStatement = dbConnection.prepareStatement(q);
                prepStatement.setString(1, rollNumber);
                prepStatement.setString(2, firstName);
                prepStatement.setString(3, middleName);
                prepStatement.setString(4, lastName);
                prepStatement.setString(5, fullName);
                prepStatement.setString(6, personalContactNumber);
                prepStatement.setString(7, parentContactNumber);
                prepStatement.setString(8, email);
                prepStatement.setInt(9, admissionyear);
                prepStatement.setString(10, enrollmentNumber);
                prepStatement.setDate(11, sqlDate);
                prepStatement.setString(12, department);
                prepStatement.setString(13, localAddress);
                prepStatement.setString(14, permanentAddress);
                prepStatement.setInt(15, sscPassingYear);
                prepStatement.setString(16, sscBoard);
                prepStatement.setFloat(17, sscPercentage);
                prepStatement.setInt(18, hscPassingYear);
                prepStatement.setString(19, hscBoard);
                prepStatement.setFloat(20, hscPercentage);
                prepStatement.setInt(21, firstSemMarksObtain);
                prepStatement.setInt(22, firstSemTotalMarks);
                prepStatement.setFloat(23, firstSemPercentage);
                prepStatement.setInt(24, secondSemMarksObtain);
                prepStatement.setInt(25, secondSemTotalMarks);
                prepStatement.setFloat(26, secondSemPercentage);
                prepStatement.setInt(27, thirdSemMarksObtain);
                prepStatement.setInt(28, thirdSemTotalMarks);
                prepStatement.setFloat(29, thirdSemPercentage);
                prepStatement.setInt(30, fourthSemMarksObtain);
                prepStatement.setInt(31, fourthSemTotalMarks);
                prepStatement.setFloat(32, fourthSemPercentage);
                prepStatement.setInt(33, fifthSemMarksObtain);
                prepStatement.setInt(34, fifthSemTotalMarks);
                prepStatement.setFloat(35, fifthSemPercentage);
                prepStatement.setInt(36, sixthSemMarksObtain);
                prepStatement.setInt(37, sixthSemTotalMarks);
                prepStatement.setFloat(38, sixthSemPercentage);
                prepStatement.setFloat(39, aggregateUpto6th);
                prepStatement.setInt(40, firstSemActiveBacklog);
                prepStatement.setInt(41, firstSemBacklogHistory);
                prepStatement.setInt(42, secondSemActiveBacklog);
                prepStatement.setInt(43, secondSemBacklogHistory);
                prepStatement.setInt(44, thirdSemActiveBacklog);
                prepStatement.setInt(45, thirdSemBacklogHistory);
                prepStatement.setInt(46, fourthSemActiveBacklog);
                prepStatement.setInt(47, fourthSemBacklogHistory);
                prepStatement.setInt(48, fifthSemActiveBacklog);
                prepStatement.setInt(49, fifthSemBacklogHistory);
                prepStatement.setInt(50, sixthSemActiveBacklog);
                prepStatement.setInt(51, sixthSemBacklogHistory);
                prepStatement.setInt(52, totalCurrentBacklog);
                prepStatement.setInt(53, totalHistoryBacklog);
                prepStatement.setString(54, passport);
                prepStatement.setString(55, cv);
                prepStatement.setInt(56, batch);
                value = prepStatement.executeUpdate();
            } catch (SQLException e) {
            }
        }
        return value > 0;
    }

    public boolean saveDiplomaStudentInfoToDb(String rollNumber, String firstName, String middleName, String lastName, String fullName, String personalContactNumber, String parentContactNumber, String email, Integer admissionyear, String enrollmentNumber, Date dateOfBirth, String department, File[] file, String[] fileContentType, String[] fileFileName, String localAddress, String permanentAddress, Integer sscPassingYear, String sscBoard, Float sscPercentage, Integer thirdSemMarksObtain, Integer thirdSemTotalMarks, Float thirdSemPercentage, Integer fourthSemMarksObtain, Integer fourthSemTotalMarks, Float fourthSemPercentage, Integer fifthSemMarksObtain, Integer fifthSemTotalMarks, Float fifthSemPercentage, Integer sixthSemMarksObtain, Integer sixthSemTotalMarks, Float sixthSemPercentage, Float aggregateUpto6th, Integer thirdSemActiveBacklog, Integer thirdSemBacklogHistory, Integer fourthSemActiveBacklog, Integer fourthSemBacklogHistory, Integer fifthSemActiveBacklog, Integer fifthSemBacklogHistory, Integer sixthSemActiveBacklog, Integer sixthSemBacklogHistory, Integer totalCurrentBacklog, Integer totalHistoryBacklog, String passport, String cv, Integer batch) {
        long t = dateOfBirth.getTime();
        java.sql.Date sqlDate = new java.sql.Date(t);
        String q = "insert into student(rollNumber, firstName, middleName, lastName, fullName, personalContactNumber, parentContactNumber, email, admissionyear, enrollmentNumber, dateOfBirth, department, localAddress, permanentAddress, sscPassingYear, sscBoard, sscPercentage, thirdSemMarksObtain, thirdSemTotalMarks, thirdSemPercentage, fourthSemMarksObtain, fourthSemTotalMarks, fourthSemPercentage, fifthSemMarksObtain, fifthSemTotalMarks, fifthSemPercentage, sixthSemMarksObtain, sixthSemTotalMarks, sixthSemPercentage, aggregateUpto6th, thirdSemActiveBacklog, thirdSemBacklogHistory, fourthSemActiveBacklog, fourthSemBacklogHistory, fifthSemActiveBacklog, fifthSemBacklogHistory, sixthSemActiveBacklog, sixthSemBacklogHistory, totalCurrentBacklog, totalHistoryBacklog, passport, cv, batch)Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        int value = 0;
        if (dbConnection != null) {
            try {
                PreparedStatement prepStatement = dbConnection.prepareStatement(q);
                prepStatement.setString(1, rollNumber);
                prepStatement.setString(2, firstName);
                prepStatement.setString(3, middleName);
                prepStatement.setString(4, lastName);
                prepStatement.setString(5, fullName);
                prepStatement.setString(6, personalContactNumber);
                prepStatement.setString(7, parentContactNumber);
                prepStatement.setString(8, email);
                prepStatement.setInt(9, admissionyear);
                prepStatement.setString(10, enrollmentNumber);
                prepStatement.setDate(11, sqlDate);
                prepStatement.setString(12, department);
                prepStatement.setString(13, localAddress);
                prepStatement.setString(14, permanentAddress);
                prepStatement.setInt(15, sscPassingYear);
                prepStatement.setString(16, sscBoard);
                prepStatement.setFloat(17, sscPercentage);
                prepStatement.setInt(18, thirdSemMarksObtain);
                prepStatement.setInt(19, thirdSemTotalMarks);
                prepStatement.setFloat(20, thirdSemPercentage);
                prepStatement.setInt(21, fourthSemMarksObtain);
                prepStatement.setInt(22, fourthSemTotalMarks);
                prepStatement.setFloat(23, fourthSemPercentage);
                prepStatement.setInt(24, fifthSemMarksObtain);
                prepStatement.setInt(25, fifthSemTotalMarks);
                prepStatement.setFloat(26, fifthSemPercentage);
                prepStatement.setInt(27, sixthSemMarksObtain);
                prepStatement.setInt(28, sixthSemTotalMarks);
                prepStatement.setFloat(29, sixthSemPercentage);
                prepStatement.setFloat(30, aggregateUpto6th);
                prepStatement.setInt(31, thirdSemActiveBacklog);
                prepStatement.setInt(32, thirdSemBacklogHistory);
                prepStatement.setInt(33, fourthSemActiveBacklog);
                prepStatement.setInt(34, fourthSemBacklogHistory);
                prepStatement.setInt(35, fifthSemActiveBacklog);
                prepStatement.setInt(36, fifthSemBacklogHistory);
                prepStatement.setInt(37, sixthSemActiveBacklog);
                prepStatement.setInt(38, sixthSemBacklogHistory);
                prepStatement.setInt(39, totalCurrentBacklog);
                prepStatement.setInt(40, totalHistoryBacklog);
                prepStatement.setString(41, passport);
                prepStatement.setString(42, cv);
                prepStatement.setInt(43, batch);
                value = prepStatement.executeUpdate();
            } catch (SQLException e) {
            }
        }
        return value > 0;
    }
}

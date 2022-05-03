/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.placement.service;

import com.placement.dao.UserRepository;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author jatin
 */
public class UserService {

    private final UserRepository userRepository;
    private ResultSet rs;
    private boolean status;

    public UserService() {
        userRepository = new UserRepository();
    }

    public String save(String firstName, String lastName, String email, String password) {
        if (userRepository != null) {
            if (userRepository.findByEmail(email)) { //calling findByEmail method to check weather email exist or not
                return "SignupFailure-EmailExists";
            }
            status = userRepository.save(firstName, lastName, email, password);
            return (status) ? "SignupSuccess" : "databseFailure";
        } else {
            return "SignupFailure";
        }
    }

    public String findByLogin(String email, String password, String uniqueId) {
        String result = "LoginFailure";
        if (userRepository != null) {
            status = userRepository.findByLogin(email, password, uniqueId);
            if (status) {
                result = "LoginSuccess";
            }
        }
        return result;
    }

    public String findIfAdmin(String email) {
        String result = "user";
        if (userRepository != null) {
            status = userRepository.findIfAdmin(email);
            if (status) {
                result = "admin";
            }
        }
        return result;
    }

    public int getUniqueId(String email) {
        int userid = 0;
        if (userRepository != null) {
            userid = userRepository.getUserId(email);
        }
        return userid;
    }

    public String saveappointment(String uname, String email, String department, String subject, String message, String phone) {
        if (userRepository != null) {

            status = userRepository.saveappointment(uname, email, department, subject, message, phone);
            return (status) ? "appointementSuccess" : "databseFailure";
        } else {
            return "appointementFailure";
        }
    }

    public ResultSet getAllPlRatio() throws SQLException {
        rs = new AdminService().getAllPlRatio();
        return (rs!=null) ? rs : null;

    }

    public String saveStudentInfo(String rollNumber, String firstName, String middleName, String lastName, String fullName, String personalContactNumber, String parentContactNumber, String email, Integer admissionyear, String enrollmentNumber, Date dateOfBirth, String department, File[] file, String[] fileContentType, String[] fileFileName, String localAddress, String permanentAddress, Integer sscPassingYear, String sscBoard, Float sscPercentage, Integer hscPassingYear, String hscBoard, Float hscPercentage, Integer firstSemMarksObtain, Integer firstSemTotalMarks, Float firstSemPercentage, Integer secondSemMarksObtain, Integer secondSemTotalMarks, Float secondSemPercentage, Integer thirdSemMarksObtain, Integer thirdSemTotalMarks, Float thirdSemPercentage, Integer fourthSemMarksObtain, Integer fourthSemTotalMarks, Float fourthSemPercentage, Integer fifthSemMarksObtain, Integer fifthSemTotalMarks, Float fifthSemPercentage, Integer sixthSemMarksObtain, Integer sixthSemTotalMarks, Float sixthSemPercentage, Float aggregateUpto6th, Integer firstSemActiveBacklog, Integer firstSemBacklogHistory, Integer secondSemActiveBacklog, Integer secondSemBacklogHistory, Integer thirdSemActiveBacklog, Integer thirdSemBacklogHistory, Integer fourthSemActiveBacklog, Integer fourthSemBacklogHistory, Integer fifthSemActiveBacklog, Integer fifthSemBacklogHistory, Integer sixthSemActiveBacklog, Integer sixthSemBacklogHistory, Integer totalCurrentBacklog, Integer totalHistoryBacklog, String passport, String cv, Integer batch) {
        status = userRepository.saveStudentInfoToDb(rollNumber, firstName, middleName, lastName, fullName, personalContactNumber, parentContactNumber, email, admissionyear, enrollmentNumber, dateOfBirth, department, file, fileContentType, fileFileName, localAddress, permanentAddress, sscPassingYear, sscBoard, sscPercentage, hscPassingYear, hscBoard, hscPercentage, firstSemMarksObtain, firstSemTotalMarks, firstSemPercentage, secondSemMarksObtain, secondSemTotalMarks, secondSemPercentage, thirdSemMarksObtain, thirdSemTotalMarks, thirdSemPercentage, fourthSemMarksObtain, fourthSemTotalMarks, fourthSemPercentage, fifthSemMarksObtain, fifthSemTotalMarks, fifthSemPercentage, sixthSemMarksObtain, sixthSemTotalMarks, sixthSemPercentage, aggregateUpto6th, firstSemActiveBacklog, firstSemBacklogHistory, secondSemActiveBacklog, secondSemBacklogHistory, thirdSemActiveBacklog, thirdSemBacklogHistory, fourthSemActiveBacklog, fourthSemBacklogHistory, fifthSemActiveBacklog, fifthSemBacklogHistory, sixthSemActiveBacklog, sixthSemBacklogHistory, totalCurrentBacklog, totalHistoryBacklog, passport, cv, batch);
        return (status) ? "success" : "databseFailure";
    }

    public String saveDiplomaStudentInfo(String rollNumber, String firstName, String middleName, String lastName, String fullName, String personalContactNumber, String parentContactNumber, String email, Integer admissionyear, String enrollmentNumber, Date dateOfBirth, String department, File[] file, String[] fileContentType, String[] fileFileName, String localAddress, String permanentAddress, Integer sscPassingYear, String sscBoard, Float sscPercentage, Integer thirdSemMarksObtain, Integer thirdSemTotalMarks, Float thirdSemPercentage, Integer fourthSemMarksObtain, Integer fourthSemTotalMarks, Float fourthSemPercentage, Integer fifthSemMarksObtain, Integer fifthSemTotalMarks, Float fifthSemPercentage, Integer sixthSemMarksObtain, Integer sixthSemTotalMarks, Float sixthSemPercentage, Float aggregateUpto6th, Integer thirdSemActiveBacklog, Integer thirdSemBacklogHistory, Integer fourthSemActiveBacklog, Integer fourthSemBacklogHistory, Integer fifthSemActiveBacklog, Integer fifthSemBacklogHistory, Integer sixthSemActiveBacklog, Integer sixthSemBacklogHistory, Integer totalCurrentBacklog, Integer totalHistoryBacklog, String passport, String cv,Integer batch) {
        status = userRepository.saveDiplomaStudentInfoToDb(rollNumber, firstName, middleName, lastName, fullName, personalContactNumber, parentContactNumber, email, admissionyear, enrollmentNumber, dateOfBirth, department, file, fileContentType, fileFileName, localAddress, permanentAddress, sscPassingYear, sscBoard, sscPercentage, thirdSemMarksObtain, thirdSemTotalMarks, thirdSemPercentage, fourthSemMarksObtain, fourthSemTotalMarks, fourthSemPercentage, fifthSemMarksObtain, fifthSemTotalMarks, fifthSemPercentage, sixthSemMarksObtain, sixthSemTotalMarks, sixthSemPercentage, aggregateUpto6th, thirdSemActiveBacklog, thirdSemBacklogHistory, fourthSemActiveBacklog, fourthSemBacklogHistory, fifthSemActiveBacklog, fifthSemBacklogHistory, sixthSemActiveBacklog, sixthSemBacklogHistory, totalCurrentBacklog, totalHistoryBacklog, passport, cv, batch);
        return (status) ? "success" : "databseFailure";
    }
}

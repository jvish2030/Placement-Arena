/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.placement.struts2.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.DoubleRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RegexFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
import com.placement.service.UserService;
import com.placement.util.FilesUtil;
import com.placement.util.MethodsUtil;
import java.io.File;
import java.util.Date;
import javax.servlet.ServletContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.util.ServletContextAware;

/**
 *
 * @author jatin
 */
@Namespace("/")
@ResultPath("/Home_Module")
@ParentPackage(value = "myPackage")
@InterceptorRef("jsonValidationWorkflowStack")
@Validations(requiredStrings = {
    @RequiredStringValidator(fieldName = "rollNumber", type = ValidatorType.FIELD, message = "Roll no. is required")
    , @RequiredStringValidator(fieldName = "firstName", type = ValidatorType.FIELD, message = "First name is required")
    , @RequiredStringValidator(fieldName = "middleName", type = ValidatorType.FIELD, message = "Middle Name is required")
    , @RequiredStringValidator(fieldName = "lastName", type = ValidatorType.FIELD, message = "Last name is required")
    , @RequiredStringValidator(fieldName = "email", type = ValidatorType.FIELD, message = "Email is required")
    , @RequiredStringValidator(fieldName = "personalContactNumber", type = ValidatorType.FIELD, message = "Phone no. is required")
    , @RequiredStringValidator(fieldName = "parentContactNumber", type = ValidatorType.FIELD, message = "Contact no. is required")
    , @RequiredStringValidator(fieldName = "enrollmentNumber", type = ValidatorType.FIELD, message = "Enrollment no. is required")
    , @RequiredStringValidator(fieldName = "department", type = ValidatorType.FIELD, message = "Department is required")
    , @RequiredStringValidator(fieldName = "localAddress", type = ValidatorType.FIELD, message = "Local address is required")
    , @RequiredStringValidator(fieldName = "permanentAddress", type = ValidatorType.FIELD, message = "Permanent address is required")
    , @RequiredStringValidator(fieldName = "sscBoard", type = ValidatorType.FIELD, message = "Please select Board")
    , @RequiredStringValidator(fieldName = "hscBoard", type = ValidatorType.FIELD, message = "Please select Board ")},
        requiredFields = {
            @RequiredFieldValidator(fieldName = "dateOfBirth", type = ValidatorType.FIELD, message = "DOB is required")
            , @RequiredFieldValidator(fieldName = "sscPassingYear", type = ValidatorType.FIELD, message = "Passing Year is required")
            , @RequiredFieldValidator(fieldName = "admissionyear", type = ValidatorType.FIELD, message = "Admission year is required")
            , @RequiredFieldValidator(fieldName = "hscPassingYear", type = ValidatorType.FIELD, message = "Passing Year is required")
            , @RequiredFieldValidator(fieldName = "firstSemMarksObtain", type = ValidatorType.FIELD, message = "Please enter obtained marks")
            , @RequiredFieldValidator(fieldName = "secondSemMarksObtain", type = ValidatorType.FIELD, message = "Please enter obtained marks")
            , @RequiredFieldValidator(fieldName = "thirdSemMarksObtain", type = ValidatorType.FIELD, message = "Please enter obtained marks")
            , @RequiredFieldValidator(fieldName = "fourthSemMarksObtain", type = ValidatorType.FIELD, message = "Please enter obtained marks")
            , @RequiredFieldValidator(fieldName = "sscPercentage", type = ValidatorType.FIELD, message = "Percentage is required")
            , @RequiredFieldValidator(fieldName = "hscPercentage", type = ValidatorType.FIELD, message = "Percentage is required")
            , @RequiredFieldValidator(fieldName = "firstSemTotalMarks", type = ValidatorType.FIELD, message = "Please enter total marks")
            , @RequiredFieldValidator(fieldName = "firstSemPercentage", type = ValidatorType.FIELD, message = "Percentage is required")
            , @RequiredFieldValidator(fieldName = "secondSemTotalMarks", type = ValidatorType.FIELD, message = "Please enter total marks")
            , @RequiredFieldValidator(fieldName = "secondSemPercentage", type = ValidatorType.FIELD, message = "Percentage is required")
            , @RequiredFieldValidator(fieldName = "thirdSemTotalMarks", type = ValidatorType.FIELD, message = "Please enter total marks")
            , @RequiredFieldValidator(fieldName = "thirdSemPercentage", type = ValidatorType.FIELD, message = "Percentage is required")
            , @RequiredFieldValidator(fieldName = "fourthSemTotalMarks", type = ValidatorType.FIELD, message = "Please enter total marks")
            , @RequiredFieldValidator(fieldName = "fourthSemPercentage", type = ValidatorType.FIELD, message = "Percentage is required")
            , @RequiredFieldValidator(fieldName = "fifthSemMarksObtain", type = ValidatorType.FIELD, message = "Please enter obtained marks")
            , @RequiredFieldValidator(fieldName = "fifthSemTotalMarks", type = ValidatorType.FIELD, message = "Please enter total marks")
            , @RequiredFieldValidator(fieldName = "fifthSemPercentage", type = ValidatorType.FIELD, message = "Percentage is required")
            , @RequiredFieldValidator(fieldName = "sixthSemMarksObtain", type = ValidatorType.FIELD, message = "Please enter obtained marks")
            , @RequiredFieldValidator(fieldName = "sixthSemTotalMarks", type = ValidatorType.FIELD, message = "Please enter total marks")
            , @RequiredFieldValidator(fieldName = "sixthSemPercentage", type = ValidatorType.FIELD, message = "Percentage is required")
            , @RequiredFieldValidator(fieldName = "firstSemActiveBacklog", type = ValidatorType.FIELD, message = "Please select Active Backlog")
            , @RequiredFieldValidator(fieldName = "firstSemBacklogHistory", type = ValidatorType.FIELD, message = "Please select Backlog History ")
            , @RequiredFieldValidator(fieldName = "secondSemActiveBacklog", type = ValidatorType.FIELD, message = "Please select Active Backlog")
            , @RequiredFieldValidator(fieldName = "secondSemBacklogHistory", type = ValidatorType.FIELD, message = "Please select Backlog History ")
            , @RequiredFieldValidator(fieldName = "thirdSemActiveBacklog", type = ValidatorType.FIELD, message = "Please select Active Backlog")
            , @RequiredFieldValidator(fieldName = "thirdSemBacklogHistory", type = ValidatorType.FIELD, message = "Please select Backlog History ")
            , @RequiredFieldValidator(fieldName = "fourthSemActiveBacklog", type = ValidatorType.FIELD, message = "Please select Active Backlog")
            , @RequiredFieldValidator(fieldName = "fourthSemBacklogHistory", type = ValidatorType.FIELD, message = "Please select Backlog History ")
            , @RequiredFieldValidator(fieldName = "fifthSemActiveBacklog", type = ValidatorType.FIELD, message = "Please select Active Backlog")
            , @RequiredFieldValidator(fieldName = "fifthSemBacklogHistory", type = ValidatorType.FIELD, message = "Please select Backlog History ")
            , @RequiredFieldValidator(fieldName = "sixthSemActiveBacklog", type = ValidatorType.FIELD, message = "Please select Active Backlog")
            , @RequiredFieldValidator(fieldName = "sixthSemBacklogHistory", type = ValidatorType.FIELD, message = "Please select Backlog History")

        }, regexFields = {
            @RegexFieldValidator(fieldName = "personalContactNumber",
                    regexExpression = "^[6-9]\\d{9}$",
                    type = ValidatorType.FIELD,
                    message = "Invalid Phone number")
            ,
        @RegexFieldValidator(fieldName = "parentContactNumber",
                    regexExpression = "^[6-9]\\d{9}$",
                    type = ValidatorType.FIELD,
                    message = "Invalid Phone number")

        })
public class StudentRegisterationAction extends ActionSupport implements ServletContextAware {

    private final UserService service;

    public StudentRegisterationAction() {
        service = new UserService();
    }

    private String rollNumber;

    private String firstName;
    private String middleName;
    private String lastName;

    private String fullName;

    private String personalContactNumber;
    private String parentContactNumber;

    private String email;
    private Integer admissionyear;
    private String enrollmentNumber;
    private Date dateOfBirth;
    private String department;

    private File[] file;
    private String[] fileContentType;
    private String[] fileFileName;

    private String localAddress;
    private String permanentAddress;

    private Integer sscPassingYear;
    private String sscBoard;
    private Float sscPercentage;

    private Integer hscPassingYear;
    private String hscBoard;
    private Float hscPercentage;

    private Integer firstSemMarksObtain;
    private Integer firstSemTotalMarks;
    private Float firstSemPercentage;

    private Integer secondSemMarksObtain;
    private Integer secondSemTotalMarks;
    private Float secondSemPercentage;

    private Integer thirdSemMarksObtain;
    private Integer thirdSemTotalMarks;
    private Float thirdSemPercentage;

    private Integer fourthSemMarksObtain;
    private Integer fourthSemTotalMarks;
    private Float fourthSemPercentage;

    private Integer fifthSemMarksObtain;
    private Integer fifthSemTotalMarks;
    private Float fifthSemPercentage;

    private Integer sixthSemMarksObtain;
    private Integer sixthSemTotalMarks;
    private Float sixthSemPercentage;

    private Float aggregateUpto6th;

    private Integer firstSemActiveBacklog;
    private Integer firstSemBacklogHistory;

    private Integer secondSemActiveBacklog;
    private Integer secondSemBacklogHistory;

    private Integer thirdSemActiveBacklog;
    private Integer thirdSemBacklogHistory;

    private Integer fourthSemActiveBacklog;
    private Integer fourthSemBacklogHistory;

    private Integer fifthSemActiveBacklog;
    private Integer fifthSemBacklogHistory;

    private Integer sixthSemActiveBacklog;
    private Integer sixthSemBacklogHistory;

    private Integer totalCurrentBacklog;
    private Integer totalHistoryBacklog;

    private String passport;
    private String cv;

    private Integer batch;

    private ServletContext context;

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalContactNumber() {
        return personalContactNumber;
    }

    public void setPersonalContactNumber(String personalContactNumber) {
        this.personalContactNumber = personalContactNumber;
    }

    public String getParentContactNumber() {
        return parentContactNumber;
    }

    public void setParentContactNumber(String parentContactNumber) {
        this.parentContactNumber = parentContactNumber;
    }

    public String getEmail() {

        return email;
    }

    @EmailValidator(type = ValidatorType.FIELD, message = "Enter a valid e-mail address.")
    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAdmissionyear() {
        return admissionyear;
    }

    public void setAdmissionyear(Integer admissionyear) {
        this.admissionyear = admissionyear;
    }

    public String getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(String enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public File[] getFile() {
        return file;
    }

    public void setFile(File[] file) {
        this.file = file;
    }

    public String[] getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(String[] fileContentType) {
        this.fileContentType = fileContentType;
    }

    public String[] getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String[] fileFileName) {
        this.fileFileName = fileFileName;
    }

    public String getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public Integer getSscPassingYear() {
        return sscPassingYear;
    }

    public void setSscPassingYear(Integer sscPassingYear) {
        this.sscPassingYear = sscPassingYear;
    }

    public String getSscBoard() {
        return sscBoard;
    }

    public void setSscBoard(String sscBoard) {
        this.sscBoard = sscBoard;
    }

    public Float getSscPercentage() {
        return sscPercentage;
    }

    @DoubleRangeFieldValidator(message = "Allow number between 1 to 100",
            minInclusive = "0.123", maxInclusive = "100.00")
    public void setSscPercentage(Float sscPercentage) {
        this.sscPercentage = sscPercentage;
    }

    public Integer getHscPassingYear() {
        return hscPassingYear;
    }

    public void setHscPassingYear(Integer hscPassingYear) {
        this.hscPassingYear = hscPassingYear;
    }

    public String getHscBoard() {
        return hscBoard;
    }

    public void setHscBoard(String hscBoard) {
        this.hscBoard = hscBoard;
    }

    public Float getHscPercentage() {
        return hscPercentage;
    }

    @DoubleRangeFieldValidator(message = "Allow number between 1 to 100",
            minInclusive = "0.123", maxInclusive = "100.00")
    public void setHscPercentage(Float hscPercentage) {
        this.hscPercentage = hscPercentage;
    }

    public Integer getFirstSemMarksObtain() {
        return firstSemMarksObtain;
    }

    public void setFirstSemMarksObtain(Integer firstSemMarksObtain) {
        this.firstSemMarksObtain = firstSemMarksObtain;
    }

    public Integer getFirstSemTotalMarks() {
        return firstSemTotalMarks;
    }

    public void setFirstSemTotalMarks(Integer firstSemTotalMarks) {
        this.firstSemTotalMarks = firstSemTotalMarks;
    }

    public Float getFirstSemPercentage() {
        return firstSemPercentage;
    }

    @DoubleRangeFieldValidator(message = "Allow number between 1 to 100",
            minInclusive = "0.123", maxInclusive = "100.00")
    public void setFirstSemPercentage(Float firstSemPercentage) {
        this.firstSemPercentage = firstSemPercentage;
    }

    public Integer getSecondSemMarksObtain() {
        return secondSemMarksObtain;
    }

    public void setSecondSemMarksObtain(Integer secondSemMarksObtain) {
        this.secondSemMarksObtain = secondSemMarksObtain;
    }

    public Integer getSecondSemTotalMarks() {
        return secondSemTotalMarks;
    }

    public void setSecondSemTotalMarks(Integer secondSemTotalMarks) {
        this.secondSemTotalMarks = secondSemTotalMarks;
    }

    public Float getSecondSemPercentage() {
        return secondSemPercentage;
    }

    @DoubleRangeFieldValidator(message = "Allow number between 1 to 100",
            minInclusive = "0.123", maxInclusive = "100.00")
    public void setSecondSemPercentage(Float secondSemPercentage) {
        this.secondSemPercentage = secondSemPercentage;
    }

    public Integer getThirdSemMarksObtain() {
        return thirdSemMarksObtain;
    }

    public void setThirdSemMarksObtain(Integer thirdSemMarksObtain) {
        this.thirdSemMarksObtain = thirdSemMarksObtain;
    }

    public Integer getThirdSemTotalMarks() {
        return thirdSemTotalMarks;
    }

    public void setThirdSemTotalMarks(Integer thirdSemTotalMarks) {
        this.thirdSemTotalMarks = thirdSemTotalMarks;
    }

    public Float getThirdSemPercentage() {
        return thirdSemPercentage;
    }

    @DoubleRangeFieldValidator(message = "Allow number between 1 to 100",
            minInclusive = "0.123", maxInclusive = "100.00")
    public void setThirdSemPercentage(Float thirdSemPercentage) {
        this.thirdSemPercentage = thirdSemPercentage;
    }

    public Integer getFourthSemMarksObtain() {
        return fourthSemMarksObtain;
    }

    public void setFourthSemMarksObtain(Integer fourthSemMarksObtain) {
        this.fourthSemMarksObtain = fourthSemMarksObtain;
    }

    public Integer getFourthSemTotalMarks() {
        return fourthSemTotalMarks;
    }

    public void setFourthSemTotalMarks(Integer fourthSemTotalMarks) {
        this.fourthSemTotalMarks = fourthSemTotalMarks;
    }

    public Float getFourthSemPercentage() {
        return fourthSemPercentage;
    }

    @DoubleRangeFieldValidator(message = "Allow number between 1 to 100",
            minInclusive = "0.123", maxInclusive = "100.00")
    public void setFourthSemPercentage(Float fourthSemPercentage) {
        this.fourthSemPercentage = fourthSemPercentage;
    }

    public Integer getFifthSemMarksObtain() {
        return fifthSemMarksObtain;
    }

    public void setFifthSemMarksObtain(Integer fifthSemMarksObtain) {
        this.fifthSemMarksObtain = fifthSemMarksObtain;
    }

    public Integer getFifthSemTotalMarks() {
        return fifthSemTotalMarks;
    }

    public void setFifthSemTotalMarks(Integer fifthSemTotalMarks) {
        this.fifthSemTotalMarks = fifthSemTotalMarks;
    }

    public Float getFifthSemPercentage() {
        return fifthSemPercentage;
    }

    @DoubleRangeFieldValidator(message = "Allow number between 1 to 100",
            minInclusive = "0.123", maxInclusive = "100.00")
    public void setFifthSemPercentage(Float fifthSemPercentage) {
        this.fifthSemPercentage = fifthSemPercentage;
    }

    public Integer getFirstSemActiveBacklog() {
        return firstSemActiveBacklog;
    }

    public void setFirstSemActiveBacklog(Integer firstSemActiveBacklog) {
        this.firstSemActiveBacklog = firstSemActiveBacklog;
    }

    public Integer getFirstSemBacklogHistory() {
        return firstSemBacklogHistory;
    }

    public void setFirstSemBacklogHistory(Integer firstSemBacklogHistory) {
        this.firstSemBacklogHistory = firstSemBacklogHistory;
    }

    public Integer getSecondSemActiveBacklog() {
        return secondSemActiveBacklog;
    }

    public void setSecondSemActiveBacklog(Integer secondSemActiveBacklog) {
        this.secondSemActiveBacklog = secondSemActiveBacklog;
    }

    public Integer getSecondSemBacklogHistory() {
        return secondSemBacklogHistory;
    }

    public void setSecondSemBacklogHistory(Integer secondSemBacklogHistory) {
        this.secondSemBacklogHistory = secondSemBacklogHistory;
    }

    public Integer getThirdSemActiveBacklog() {
        return thirdSemActiveBacklog;
    }

    public void setThirdSemActiveBacklog(Integer thirdSemActiveBacklog) {
        this.thirdSemActiveBacklog = thirdSemActiveBacklog;
    }

    public Integer getThirdSemBacklogHistory() {
        return thirdSemBacklogHistory;
    }

    public void setThirdSemBacklogHistory(Integer thirdSemBacklogHistory) {
        this.thirdSemBacklogHistory = thirdSemBacklogHistory;
    }

    public Integer getFourthSemActiveBacklog() {
        return fourthSemActiveBacklog;
    }

    public void setFourthSemActiveBacklog(Integer fourthSemActiveBacklog) {
        this.fourthSemActiveBacklog = fourthSemActiveBacklog;
    }

    public Integer getFourthSemBacklogHistory() {
        return fourthSemBacklogHistory;
    }

    public void setFourthSemBacklogHistory(Integer fourthSemBacklogHistory) {
        this.fourthSemBacklogHistory = fourthSemBacklogHistory;
    }

    public Integer getFifthSemActiveBacklog() {
        return fifthSemActiveBacklog;
    }

    public void setFifthSemActiveBacklog(Integer fifthSemActiveBacklog) {
        this.fifthSemActiveBacklog = fifthSemActiveBacklog;
    }

    public Integer getFifthSemBacklogHistory() {
        return fifthSemBacklogHistory;
    }

    public void setFifthSemBacklogHistory(Integer fifthSemBacklogHistory) {
        this.fifthSemBacklogHistory = fifthSemBacklogHistory;
    }

    public Integer getSixthSemMarksObtain() {
        return sixthSemMarksObtain;
    }

    public void setSixthSemMarksObtain(Integer sixthSemMarksObtain) {
        this.sixthSemMarksObtain = sixthSemMarksObtain;
    }

    public Integer getSixthSemTotalMarks() {
        return sixthSemTotalMarks;
    }

    public void setSixthSemTotalMarks(Integer sixthSemTotalMarks) {
        this.sixthSemTotalMarks = sixthSemTotalMarks;
    }

    public Float getSixthSemPercentage() {
        return sixthSemPercentage;
    }

    @DoubleRangeFieldValidator(message = "Allow number between 1 to 100",
            minInclusive = "0.123", maxInclusive = "100.00")
    public void setSixthSemPercentage(Float sixthSemPercentage) {
        this.sixthSemPercentage = sixthSemPercentage;
    }

    public Integer getSixthSemActiveBacklog() {
        return sixthSemActiveBacklog;
    }

    public void setSixthSemActiveBacklog(Integer sixthSemActiveBacklog) {
        this.sixthSemActiveBacklog = sixthSemActiveBacklog;
    }

    public Integer getSixthSemBacklogHistory() {
        return sixthSemBacklogHistory;
    }

    public void setSixthSemBacklogHistory(Integer sixthSemBacklogHistory) {
        this.sixthSemBacklogHistory = sixthSemBacklogHistory;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Float getAggregateUpto6th() {
        return aggregateUpto6th;
    }

    public void setAggregateUpto6th(Float aggregateUpto6th) {
        this.aggregateUpto6th = aggregateUpto6th;
    }

    public Integer getTotalCurrentBacklog() {
        return totalCurrentBacklog;
    }

    public void setTotalCurrentBacklog(Integer totalCurrentBacklog) {
        this.totalCurrentBacklog = totalCurrentBacklog;
    }

    public Integer getTotalHistoryBacklog() {
        return totalHistoryBacklog;
    }

    public void setTotalHistoryBacklog(Integer totalHistoryBacklog) {
        this.totalHistoryBacklog = totalHistoryBacklog;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    @Override
    public void setServletContext(ServletContext sc) {
        this.context = sc;
    }

    @Action(value = "studentregister", results = {
        @Result(name = SUCCESS, location = "home.jsp")
        ,@Result(name = INPUT, location = "registerSixthSem.jsp")},
            interceptorRefs = {
                @InterceptorRef(
                        params = {"allowedTypes", "image/jpeg,application/pdf",
                            "maximumSize", "5242880"},
                        value = "fileUpload"
                )
                ,@InterceptorRef("defaultStack")

            }
    )

    @Override
    public String execute() throws Exception {
        System.out.println("inside");
        String result;
        for (int i = 0; i < getFile().length; i++) {
            if (getFileContentType()[i].equals("image/jpeg")) {
                this.passport = getRollNumber().concat("_".concat(getFileFileName()[i]));
                FilesUtil.saveImageFile(getFile()[i], getPassport(), context);
            } else if (getFileContentType()[i].equals("application/pdf")) {
                this.cv = getRollNumber().concat("_".concat(getFileFileName()[i]));
                FilesUtil.savePdfFile(getFile()[i], getCv(), context);
            }
        }

        this.fullName = ((this.firstName.concat(" ")).concat(this.middleName.concat(" "))).concat(this.lastName);
        int totalMarks = this.firstSemTotalMarks + this.secondSemTotalMarks + this.thirdSemTotalMarks + this.fourthSemTotalMarks + this.fifthSemTotalMarks + this.sixthSemTotalMarks;
        int totalMarksObtain = this.firstSemMarksObtain + this.secondSemMarksObtain + this.thirdSemMarksObtain + this.fourthSemMarksObtain + this.fifthSemMarksObtain + this.sixthSemMarksObtain;
        this.aggregateUpto6th = MethodsUtil.studentAggregate(totalMarks, totalMarksObtain);
        this.totalCurrentBacklog = this.firstSemActiveBacklog + this.secondSemActiveBacklog + this.thirdSemActiveBacklog + this.fourthSemActiveBacklog + this.fifthSemActiveBacklog + this.sixthSemActiveBacklog;
        this.totalHistoryBacklog = this.firstSemBacklogHistory + this.secondSemBacklogHistory + this.thirdSemBacklogHistory + this.fourthSemBacklogHistory + this.fifthSemBacklogHistory + this.sixthSemBacklogHistory;
        this.batch = getAdmissionyear() + 4;

        result = service.saveStudentInfo(
                this.rollNumber,
                this.firstName,
                this.middleName,
                this.lastName,
                this.fullName,
                this.personalContactNumber,
                this.parentContactNumber,
                this.email,
                this.admissionyear,
                this.enrollmentNumber,
                this.dateOfBirth,
                this.department,
                this.file,
                this.fileContentType,
                this.fileFileName,
                this.localAddress,
                this.permanentAddress,
                this.sscPassingYear,
                this.sscBoard,
                this.sscPercentage,
                this.hscPassingYear,
                this.hscBoard,
                this.hscPercentage,
                this.firstSemMarksObtain,
                this.firstSemTotalMarks,
                this.firstSemPercentage,
                this.secondSemMarksObtain,
                this.secondSemTotalMarks,
                this.secondSemPercentage,
                this.thirdSemMarksObtain,
                this.thirdSemTotalMarks,
                this.thirdSemPercentage,
                this.fourthSemMarksObtain,
                this.fourthSemTotalMarks,
                this.fourthSemPercentage,
                this.fifthSemMarksObtain,
                this.fifthSemTotalMarks,
                this.fifthSemPercentage,
                this.sixthSemMarksObtain,
                this.sixthSemTotalMarks,
                this.sixthSemPercentage,
                this.aggregateUpto6th,
                this.firstSemActiveBacklog,
                this.firstSemBacklogHistory,
                this.secondSemActiveBacklog,
                this.secondSemBacklogHistory,
                this.thirdSemActiveBacklog,
                this.thirdSemBacklogHistory,
                this.fourthSemActiveBacklog,
                this.fourthSemBacklogHistory,
                this.fifthSemActiveBacklog,
                this.fifthSemBacklogHistory,
                this.sixthSemActiveBacklog,
                this.sixthSemBacklogHistory,
                this.totalCurrentBacklog,
                this.totalHistoryBacklog,
                this.passport,
                this.cv,
                this.batch
        );

        return result.equals("success") ? "success" : "error";
    }

}

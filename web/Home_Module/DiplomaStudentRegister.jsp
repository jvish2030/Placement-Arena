<%-- 
    Document   : register
    Created on : Nov 15, 2021, 6:27:08 PM
    Author     : jatin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>


<s:form id="studentRegForm2" enctype="multipart/form-data" action="diplomastudentregister.action"  method="post" theme="bootstrap" >
    <div class="row">
        <div class="col-md-4 ">
            <s:textfield  name="firstName" label="First Name" requiredLabel="true"/>
        </div>
        <div class="col-md-4  mt-3 mt-md-0">
            <s:textfield name="middleName"   label="Middle Name" requiredLabel="true"/> 
        </div>
        <div class="col-md-4  mt-3 mt-md-0">
            <s:textfield name="lastName"  label="Last Name" requiredLabel="true"/>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4  mt-3 ">
            <s:textfield name="personalContactNumber"   label="your phone number" requiredLabel="true"/>
        </div>  
        <div class="col-md-4  mt-3 ">
            <s:textfield name="parentContactNumber" errorPosition=""   label="parents phone number" requiredLabel="true"/>
            <div class="validate"></div>
        </div>
        <div class="col-md-4 mt-3  ">
            <s:textfield  name="email" type="email"  label="Email" requiredLabel="true"/>
        </div> 
    </div>
    <div class="row">
        <div class="col-md-4 mt-3">
            <s:select
                name = "admissionyear" 
                tooltip="select Your Admission Year"
                label="Admission Year"
                list="{'2018','2019','2020','2021','2022','2023','2024','2025','2026','2027','2028','2029','2030','2031','2032','2033','2034','2035','2036','2037','2038','2039','2040'}"                                   
                emptyOption="true"
                headerKey=""
                requiredLabel="true"
                headerValue="Select year of admission"/>
        </div>
        <div class="col-md-4  mt-3">
            <s:textfield type="text" name = "enrollmentNumber" requiredLabel="true" label="Enrollment No."/>
        </div>
        <div class="col-md-4  mt-3"> 
            <s:textfield type="text" name = "rollNumber"  requiredLabel="true" label="Roll No."/>
        </div>
    </div>

    <div class="row">
        <div class="col-md-6 mt-3">
            <sj:datepicker  
                autocomplete="off"
                yearRange="1990:2060"
                parentTheme="bootstrap"
                changeYear="true"
                required="true"
                requiredLabel="true"
                cssClass="form-control"
                placeholder="dd/mm/yyyy"
                name="dateOfBirth" 
                errorPosition="top"
                showOn="focus" 
                inputPrependIcon="calendar"
                label="Date of Birth"/>
        </div>                    
        <div class=" col-md-6 mt-3">
            <s:select
                name = "department" 
                tooltip="Select Your Department"
                label="Department"
                list="{'CSE','ETC','ELECT','MECH'}"                                     
                emptyOption="true"
                headerKey=""
                requiredLabel="true"
                headerValue="Select your Department"
                />
        </div>
    </div>

    <div class="row">

        <div class="col-md-6 mt-3">
            <div cssClass="form-horizontal">
                <s:file
                    id="file3"
                    requiredLabel="true"
                    tooltip="Upload Your Passport Size Picture in jpg format with size <= 5mb"
                    accept=".jpg"
                    label="Profile pic"
                    cssClass="form-control"
                    theme="bootstrap"
                    name="file"
                    formGroupCssClass="row"/>
            </div>                                
        </div>
        <div class="col-md-6 mt-3">
            <s:file
                id="file4"
                requiredLabel="true"
                tooltip="Upload Your CV in .pdf format with size <= 5mb"
                accept=".pdf"
                label="Upload CV"
                theme="bootstrap"
                cssClass="form-control"
                name="file"
                formGroupCssClass="row"/>
        </div>
    </div>

    <div class="row">
        <div class="col-md-6 mt-3">
            <s:textarea
                name="localAddress"
                id="localAddress"
                placeholder="please enter present address..."
                rows="3"
                cols="80"
                />
        </div>
        <div class="col-md-6 mt-3">
            <s:textarea
                name="permanentAddress"
                id="permanentAddress"
                placeholder="please enter permanent address..."
                rows="3"
                cols="80"
                />
        </div>
    </div>
    <div class="row">
        <div class="offset-md-6 col-md-6 form-check">
            <input class="form-check-input mx-2"  type="checkbox" id="filladdress" name="option1" value="something" >
            <label class="form-check-label text-muted">parmanent address same as Present address.</label>
        </div>
    </div>
    <div class="section-title pb-0 pt-1 text-sm-start">
        <h6>SSC Details</h6>
    </div>
    <div class="row">
        <div class="col-md-4 ">
            <s:select name = "sscPassingYear"  headerKey="" emptyOption="true" headerValue="Passing year"
                      list="{'2015','2016','2017','2018','2019','2020','2021','2022','2023','2024','2025','2026','2027','2028','2029','2030','2031','2032','2033','2034','2035','2036','2037','2038','2039','2040'}" />                         
        </div>
        <div class="col-md-4 ">
            <s:select name = "sscBoard"  headerKey="" emptyOption="true" headerValue="Select Board"
                      list="{'STATE','CBSE','ICSE','Others'}" />                         
        </div>
        <div class="col-md-4 ">
            <s:textfield name = "sscPercentage" type="number"  placeholder="Percentage"/>
        </div>
    </div>

    <div class="section-title pb-0 pt-1 text-sm-start ">
        <h6>Diploma Details-</h6>
    </div>
    <div class="row">
        <div class="col-md-4 ">
            <s:select name = "diplomaPassingYear"  headerKey="" emptyOption="true" headerValue="Passing year"
                      list="{'2015','2016','2017','2018','2019','2020','2021','2022','2023','2024','2025','2026','2027','2028','2029','2030','2031','2032','2033','2034','2035','2036','2037','2038','2039','2040'}" />                         
        </div>
        <div class="col-md-4 ">
            <s:select name = "diplomaBacklogHistory"  headerKey="" emptyOption="true" headerValue="Select Backlog"
                      list="{'0','1','2','3','4','5','6','7','8','9','10','11','12','13','14','15'}" />                         
        </div>
        <div class="col-md-4 ">
            <s:textfield name = "diplomaPercentage" type="number"  placeholder="Percentage"/>
        </div>
    </div>


    <div class="section-title pb-0 pt-1 text-sm-start ">
        <h6>Third semester Details-</h6>
    </div>
    <div class="row">
        <div class="col-md-4 ">
            <s:textfield name = "thirdSemMarksObtain" type="number" placeholder="Marks Obtained"/>
        </div>
        <div class="col-md-4 ">
            <s:textfield name = "thirdSemTotalMarks" type="number" placeholder="Total Marks"/>

        </div>
        <div class="col-md-4 ">
            <s:textfield name = "thirdSemPercentage" type="number" placeholder="Percentage"/>
        </div>
    </div>

    <div class="section-title pb-0 pt-1 text-sm-start ">
        <h6>Fourth semester Details-</h6>
    </div>
    <div class="row">
        <div class="col-md-4 ">
            <s:textfield name = "fourthSemMarksObtain" type="number" placeholder="Marks Obtained"/>
        </div>
        <div class="col-md-4 ">
            <s:textfield name = "fourthSemTotalMarks" type="number" placeholder="Total Marks"/>

        </div>
        <div class="col-md-4 ">
            <s:textfield name = "fourthSemPercentage" type="number" placeholder="Percentage"/>
        </div>
    </div>

    <div class="section-title pb-0 pt-1 text-sm-start ">
        <h6>Fifth semester Details-</h6>
    </div>
    <div class="row">
        <div class="col-md-4 ">
            <s:textfield name = "fifthSemMarksObtain" type="number"  placeholder="Marks Obtained"/>
        </div>
        <div class="col-md-4">
            <s:textfield name = "fifthSemTotalMarks" type="number"  placeholder="Total Marks"/>

        </div>
        <div class="col-md-4 ">
            <s:textfield name = "fifthSemPercentage" type="number" placeholder="Percentage"/>
        </div>
    </div>
    <div class="section-title pb-0 pt-1 text-sm-start ">
        <h6>Sixth semester Details-</h6>
    </div>
    <div class="row">
        <div class="col-md-4 ">
            <s:textfield name = "sixthSemMarksObtain" type="number"  placeholder="Marks Obtained"/>
        </div>
        <div class="col-md-4">
            <s:textfield name = "sixthSemTotalMarks" type="number"  placeholder="Total Marks"/>

        </div>
        <div class="col-md-4 ">
            <s:textfield name = "sixthSemPercentage" type="number" placeholder="Percentage"/>
        </div>
    </div>
    <div class="section-title pb-0 pt-1 mt-3 text-start ">
        <h5>Backlog Details-</h5>
    </div>


    <div class="row">
        <div class="col-md-6 mb-2">
            <div class="section-title pb-0 pt-1 text-sm-start ">
                <h6>Third semester-</h6>
            </div>
            <div class="row">
                <div class="col-md-6 mb-1">
                    <s:select name = "thirdSemActiveBacklog" headerKey="" emptyOption="true" headerValue=" Select Active Backlog"
                              list="{'0','1','2','3','4','5','6'}" />  
                </div>
                <div class="col-md-6 ">            
                    <s:select name = "thirdSemBacklogHistory" headerKey=""  emptyOption="true"  headerValue=" Select Backlog history"
                              list="{'0','1','2','3','4','5','6'}" />  
                </div>
            </div>
        </div>
        <div class="col-md-6 mb-2">
            <div class="section-title pb-0 pt-1 text-sm-start ">
                <h6>Fourth semester-</h6>
            </div>
            <div class="row">
                <div class="col-md-6 mb-1">
                    <s:select name = "fourthSemActiveBacklog" headerKey="" emptyOption="true"  headerValue=" Select Active Backlog"
                              list="{'0','1','2','3','4','5','6'}" /> 
                </div>
                <div class=" col-md-6">
                    <s:select name = "fourthSemBacklogHistory" headerKey="" emptyOption="true"  headerValue=" Select Backlog history"
                              list="{'0','1','2','3','4','5','6'}" />  
                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-6 mb-2">
            <div class="section-title pb-0 pt-1 text-sm-start ">
                <h6>Fifth semester-</h6>
            </div>
            <div class="row">
                <div class="col-md-6 mb-1">
                    <s:select name = "fifthSemActiveBacklog" headerKey="" emptyOption="true"  headerValue=" Select Active Backlog"
                              list="{'0','1','2','3','4','5','6'}" />    
                </div>
                <div class="col-md-6 ">            
                    <s:select errorPosition="top" name = "fifthSemBacklogHistory" headerKey="" emptyOption="true"  headerValue=" Select Backlog history"
                              list="{'0','1','2','3','4','5','6'}" />  
                </div>
            </div>
        </div>
        <div class="col-md-6 mb-2">
            <div class="section-title pb-0 pt-1 text-sm-start ">
                <h6>Sixth semester-</h6>
            </div>
            <div class="row">
                <div class="col-md-6 mb-1">
                    <s:select  name = "sixthSemActiveBacklog" headerKey="" emptyOption="true"  headerValue=" Select Active Backlog"
                               list="{'0','1','2','3','4','5','6'}" /> 
                </div>
                <div class=" col-md-6">
                    <s:select name = "sixthSemBacklogHistory" headerKey="" emptyOption="true"  headerValue=" Select Backlog history"
                              list="{'0','1','2','3','4','5','6'}" />  
                </div>
            </div>
        </div>
    </div>
    <div class="text-center mt-4">
        <sj:submit
            onclick="val()"
            cssClass="btnblues"
            formIds="studentRegForm2"
            validate="true"
            validateFunction="bootstrapValidation"
            value="Register"
            targets="AppformResult" 
            errorPosition="top"
            onSuccessTopics="complete"
            />                      
    </div>
</s:form>
<script type="text/javascript">
    $(document).ready(function () {
        $("#filladdress").on("click", function () {
            if (this.checked) {
                $("#permanentAddress").val($("#localAddress").val());
            } else {
                $("#permanentAddress").val('');
            }
        });
    });
    function val() {
        var file1 = $('#file3').val();
        var file2 = $('#file4').val();

        if (file1 === "" || file2 === "") {
            alert("upload file"); //alert when no file is selected

            return false;
        } else
        {
            /* get file size in MB */
            var file_size1 = $('#file3')[0].files[0].size / 1024 / 1024;
            var file_size2 = $('#file4')[0].files[0].size / 1024 / 1024;

            //check if file size is greater than 2MB
            if (file_size1 > 3 || file_size2 > 3) {
                alert("File size is greater than 3MB");
                return false;
            } else
            {
                return true;
            }
        }

    }
</script>
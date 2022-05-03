<%-- 
    Document   : AppList
    Created on : Dec 25, 2021, 9:44:47 AM
    Author     : jatin
--%>
<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>


<%
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);
%>
<s:actionmessage theme="bootstrap"/>   
<div class="card table-card">
    <div class="card-header">
        <h5>Appointments</h5>
        <div class="card-header-right">
            <ul class="list-unstyled card-option">
                <li><i class="fa fa fa-wrench open-card-option"></i></li>
                <li><i class="fa fa-window-maximize full-card"></i></li>
                <li><i class="fa fa-minus minimize-card"></i></li>
                <li><i class="fa fa-refresh reload-card"></i></li>
                <li><i class="fa fa-trash close-card"></i></li>
            </ul>
        </div>
    </div>
    <div class="card-block">
        <div style="height:300px;overflow:auto;">
            <div class="table-responsive">
                <table class="table table-hover m-b-0 without-header">
                    <tbody>
                        <s:iterator value="dataList" status="list">
                            <tr >
                                <td onclick="loadDynamicContentModal('modal${appId}')" style="cursor: pointer">
                                    <div class="d-inline-block align-middle"  >
                                        <img src="assets/images/avatar-4.jpg" alt="user image" class="img-radius img-40 align-top m-r-15">
                                        <div class="d-inline-block">
                                            <h6>${uname}</h6>
                                            <p class="text-muted message m-b-0">${subject}</p>
                                        </div>
                                    </div>
                                </td>
                                <td class="text-right">
                                    <h6 class="f-w-700"><s:date name="date" format="dd/MM/yyyy"/><i class="far fa-envelope text-c-green m-l-10"></i></h6>
                                        <s:url var="deleteURL" value="deleteApp.action" namespace="/">
                                            <s:param name="id">${appId}</s:param>
                                        </s:url>
                                    <!--                                                                                        <button class="btn btn-sm waves-effect waves-light btn-danger">Delete</button>-->
                                    <sj:a 
                                        href="%{deleteURL}"
                                        targets="deleteMessage"
                                        indicator="indicator"
                                        buttonIcon="ui-icon-refresh"
                                        cssClass="btn text-danger my-0 py-0"
                                        onclick="return confirm('Are you sure?')"
                                        >
                                        delete
                                    </sj:a>


                                </td>
                            </tr>

                            <!-- modal section -->
                        <div class="modal fade" id="modal${appId}">
                            <div class="modal-dialog">
                                <div class="modal-content">

                                    <!-- Modal Header -->
                                    <div class="modal-header">
                                        <h4 class="modal-title">${subject}</h4>
                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                    </div>
                                    <!-- Modal body -->
                                    <div class="modal-body">
                                        <div class="name"><p>Name: </p><span>${uname}</span></div>
                                        <div class="department"><p>Department: </p><span>${depart}</span></div>
                                        <div class="mobile"><p>Mobile: </p><span>${phone}</span></div>
                                        <div class="message"><p>Message: </p>  <textarea class="form-control" disabled="true"   rows="5" >${message}</textarea>
                                       </div>
                                        <form id="${appId}" method="post"  action="scheduleApp.action" >
                                            <input type="hidden" name="modalid" value="modal${appId}"/>
                                            <input type="hidden" name="uname" value="${uname}"/>
                                            <input type="hidden" name="email" value="${email}"/>

                                            <div class="form-group">
                                                <label class="control-label mt-1" for="validationCustom${appId}">Schedule Appointment at :</label>
                                                <div>
                                                    <sj:datepicker 
                                                        id="validationCustom%{appId}"
                                                        name="date_time"
                                                        autocomplete="off" 
                                                        required="true"
                                                        class="form-control"
                                                        placeholder="select date & time"
                                                        showOn="focus"
                                                        timepicker="true" 
                                                        timepickerSeparator=" at "
                                                        />     
                                                </div>
                                                <div class="invalid-feedback">Please select date & time.</div>
                                            </div>
                                            <div class="form-group ">
                                                <div>
                                                    <sj:submit
                                                        formIds="%{appId}"
                                                        clearForm="true"
                                                        targets="scheduleAppMessage"
                                                        indicator="indicator"
                                                        class="btn btn-primary "
                                                        button="true"
                                                        value="Submit"
                                                        onSuccessTopics="done"
                                                        onBeforeTopics="before"
                                                        validate="true"
                                                        />

                                                    <button type="button" class="btn btn-secondary float-right" data-dismiss="modal">Close</button>
                                                </div>
                                            </div>
                                        </form>



                                    </div>
                                    <!-- Modal footer -->
                                    <div class="modal-footer">

                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- modal section closed-->
                    </s:iterator>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

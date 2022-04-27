package com.cognizant.simpleCoding.SimpleCoding.modelclass;

import java.util.Date;

public class ErrorMessage {
    private String Message;
    private String MessageInfo;
    private Date date;

    public ErrorMessage() {
    }

    public ErrorMessage(String message, String messageInfo, Date date) {
        Message = message;
        MessageInfo = messageInfo;
        this.date = date;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getMessageInfo() {
        return MessageInfo;
    }

    public void setMessageInfo(String messageInfo) {
        MessageInfo = messageInfo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

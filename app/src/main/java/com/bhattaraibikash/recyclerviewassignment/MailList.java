package com.bhattaraibikash.recyclerviewassignment;

public class MailList {

    private String mailTitle;
    private String message;
    private String time;
    private int imgId;

    public MailList(String mailTitle, String message, String time, int imgId) {
        this.mailTitle = mailTitle;
        this.message = message;
        this.time = time;
        this.imgId = imgId;
    }

    public String getMailTitle() {
        return mailTitle;
    }

    public void setMailTitle(String mailTitle) {
        this.mailTitle = mailTitle;
    }

    public String getMessage() {
        return message;
    }

    public void setImage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}

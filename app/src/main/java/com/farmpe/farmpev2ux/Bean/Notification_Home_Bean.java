package com.farmpe.farmpev2ux.Bean;




public class Notification_Home_Bean {

    public String getNotiftn_mess() {
        return notiftn_mess;
    }

    public void setNotiftn_mess(String notiftn_mess) {
        this.notiftn_mess = notiftn_mess;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String notiftn_mess, id;

    public Boolean getIs_read() {
        return is_read;
    }

    public void setIs_read(Boolean is_read) {
        this.is_read = is_read;
    }

    Boolean is_read;



    public Notification_Home_Bean(String notiftn_mess, String id, Boolean is_read) {
        this.notiftn_mess = notiftn_mess;
        this.id = id;
        this.is_read = is_read;
    }
}

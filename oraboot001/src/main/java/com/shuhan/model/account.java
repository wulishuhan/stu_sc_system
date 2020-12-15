package com.shuhan.model;

public class account {
    private String sno;

    private String pwd;

    public account(String username, String password) {
        this.sno=username;
        this.pwd=password;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }
}
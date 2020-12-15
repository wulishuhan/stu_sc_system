package com.shuhan.model;

public class scKey {
    private String sno;

    private String cno;

    private Integer term;

    public scKey(String sno, String cno, int term) {
        this.cno=cno;
        this.sno=sno;
        this.term=term;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno == null ? null : cno.trim();
    }
}
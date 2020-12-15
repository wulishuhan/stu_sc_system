package com.shuhan.model;

public class Class {
    private String clno;

    private String dept;

    private String grade;

    private String branch;

    public String getClno() {
        return clno;
    }

    public void setClno(String clno) {
        this.clno = clno == null ? null : clno.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }
}
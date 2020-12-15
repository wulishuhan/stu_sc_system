package com.shuhan.model;

import java.math.BigDecimal;

public class sc extends scKey {
    private int grade;

    public sc(String sno, String cno, int grade, int term) {
        super(sno,cno,term);
        this.grade=grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
package com.cognizant.simpleCoding.SimpleCoding.modelclass;

import javax.persistence.*;

@Entity
@Table(name="registeration")
public class StudentRegisteration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sno")
    private int registerno;

    @Column(name="studentName")
    private String name;
    @Column(name="studentEmailid")
    private String emailid;

    private long mobileNo;

    public StudentRegisteration() {
    }

    public StudentRegisteration(int registerno, String name, String emailid, long mobileNo) {
        this.registerno = registerno;
        this.name = name;
        this.emailid = emailid;
        this.mobileNo = mobileNo;
    }

    public int getRegisterno() {
        return registerno;
    }

    public void setRegisterno(int registerno) {
        this.registerno = registerno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }
}

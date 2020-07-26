package com.shailesh.mak.springbootjaspermysql.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tenants")
public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "first_name")
    String firstName;
    @Column(name = "last_name")
    String lastName;
    @Column(name = "bldg_no")
    Integer bldgNo;
    @Column(name = "apt_no")
    Integer aptNo;
    @Column(name = "parking_no")
    String parkingNo;
    @Column(name = "renew_date")
    Date renewDate;

    public Tenant() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getBldgNo() {
        return bldgNo;
    }

    public void setBldgNo(Integer bldgNo) {
        this.bldgNo = bldgNo;
    }

    public Integer getAptNo() {
        return aptNo;
    }

    public void setAptNo(Integer aptNo) {
        this.aptNo = aptNo;
    }

    public Date getRenewDate() {
        return renewDate;
    }

    public void setRenewDate(Date renewDate) {
        this.renewDate = renewDate;
    }

    public String getParkingNo() {
        return parkingNo;
    }

    public void setParkingNo(String parkingNo) {
        this.parkingNo = parkingNo;
    }
}

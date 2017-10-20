package com.company;

import java.util.ArrayList;

public class Experience {

    private String position;
    private String company;
    private String dates;
    public ArrayList<Duty> dutyList = new ArrayList<Duty>();

    public ArrayList<Duty> getDutyList() {
        return dutyList;
    }

    public void setDutyList(ArrayList<Duty> dutyList) {
        this.dutyList = dutyList;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }


}

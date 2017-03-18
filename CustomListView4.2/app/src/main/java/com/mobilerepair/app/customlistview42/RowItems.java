package com.mobilerepair.app.customlistview42;

/**
 * Created by Santoshraddi on 21-02-2017.
 */
public class RowItems {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String name;
    private String phone;

    public RowItems(String title, String desc) {
        this.name = title;
        this.phone = desc;
    }
}

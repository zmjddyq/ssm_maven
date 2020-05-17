package com.ssm_02.pojo;

import java.util.Arrays;
import java.util.Date;

public class Beauty {
    private Integer id;

    private String name;

    private String sex;

    private Date borndate;

    private String phone;

    private Integer boyfriendId;

    private byte[] photo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBorndate() {
        return borndate;
    }

    public void setBorndate(Date borndate) {
        this.borndate = borndate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getBoyfriendId() {
        return boyfriendId;
    }

    public void setBoyfriendId(Integer boyfriendId) {
        this.boyfriendId = boyfriendId;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Beauty{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", borndate=" + borndate +
                ", phone='" + phone + '\'' +
                ", boyfriendId=" + boyfriendId +
                ", photo=" + Arrays.toString(photo) +
                '}';
    }
}
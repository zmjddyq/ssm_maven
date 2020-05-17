package com.ssm_02.pojo;

public class Boys {
    private Integer id;

    private String boyname;

    private Integer usercp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBoyname() {
        return boyname;
    }

    public void setBoyname(String boyname) {
        this.boyname = boyname == null ? null : boyname.trim();
    }

    public Integer getUsercp() {
        return usercp;
    }

    public void setUsercp(Integer usercp) {
        this.usercp = usercp;
    }
}
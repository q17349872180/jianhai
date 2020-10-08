package net.xdclass.online_xdclass.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

/**
 *  id          int(11) unsigned auto_increment
 *         primary key,
 *     name        varchar(128)           null comment '昵称',
 *     pwd         varchar(124)           null comment '密码',
 *     head_img    varchar(524)           null comment '头像',
 *     phone       varchar(64) default '' null comment '手机号',
 *     create_time datetime               null comment '创建时间',
 */
public class User {

    private Integer id;

    private String name;

    @JsonIgnore
    private String pwd;

    private String headImg;

    private String phone;

    private Date crateTime;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", headImg='" + headImg + '\'' +
                ", phone='" + phone + '\'' +
                ", crateTime=" + crateTime +
                '}';
    }

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
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }
}

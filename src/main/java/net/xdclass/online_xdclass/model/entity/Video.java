package net.xdclass.online_xdclass.model.entity;

import java.util.Date;
import java.util.List;

/**
 *  id          int(11) unsigned auto_increment
 *         primary key,
 *     title       varchar(524)               null comment '视频标题',
 *     summary     varchar(1026)              null comment '概述',
 *     cover_img   varchar(524)               null comment '封面图',
 *     price       int                        null comment '价格,分',
 *     create_time datetime                   null comment '创建时间',
 *     point       double(11, 2) default 8.70 null comment '默认8.7，最高10分'
 */
public class Video {
    private Integer id;

    private String title;

    private String summary;

    private String coverImg;

    private int price;

    private Date createTime;

    private Double point;

    private List<Chapter> chapterList;

    public List<Chapter> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<Chapter> chapterList) {
        this.chapterList = chapterList;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", coverImg='" + coverImg + '\'' +
                ", price=" + price +
                ", createTime=" + createTime +
                ", point=" + point +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }
}

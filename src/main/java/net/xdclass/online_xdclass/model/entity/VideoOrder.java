package net.xdclass.online_xdclass.model.entity;

import java.util.Date;

/**
 * id           int(11) unsigned auto_increment
 *         primary key,
 *     out_trade_no varchar(64)  null comment '订单唯一标识',
 *     state        int          null comment '0表示未支付，1表示已支付',
 *     create_time  datetime     null comment '订单生成时间',
 *     total_fee    int          null comment '支付金额，单位分',
 *     video_id     int          null comment '视频主键',
 *     video_title  varchar(256) null comment '视频标题',
 *     video_img    varchar(256) null comment '视频图片',
 *     user_id      int(12)      null comment '用户id'
 */
public class VideoOrder {

    private Integer id;

    private String outTeadeNo;

    private Integer state;

    private Date createTime;

    private Integer totalFee;

    private Integer videoId;

    private String videoTitle;

    private String videoImg;

    private Integer userId;

    @Override
    public String toString() {
        return "VideoOrder{" +
                "id=" + id +
                ", outTeadeNo='" + outTeadeNo + '\'' +
                ", state=" + state +
                ", createTime=" + createTime +
                ", totalFee=" + totalFee +
                ", videoId=" + videoId +
                ", videoTitle='" + videoTitle + '\'' +
                ", videoImg='" + videoImg + '\'' +
                ", userId=" + userId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOutTeadeNo() {
        return outTeadeNo;
    }

    public void setOutTeadeNo(String outTeadeNo) {
        this.outTeadeNo = outTeadeNo;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getVideoImg() {
        return videoImg;
    }

    public void setVideoImg(String videoImg) {
        this.videoImg = videoImg;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}

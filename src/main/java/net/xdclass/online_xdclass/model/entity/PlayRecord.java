package net.xdclass.online_xdclass.model.entity;

import java.util.Date;

/**
 * id          int(11) unsigned auto_increment
 *         primary key,
 *     user_id     int      null,
 *     video_id    int      null,
 *     current_num int      null comment '当前播放第几集',
 *     episode_id  int      null comment '当前播放第几集视频id',
 *     create_time datetime null
 */
public class PlayRecord {

    private Integer id;
    private Integer userId;
    private Integer videoId;
    private Integer currentNum;
    private Integer episodeId;
    private Date createTime;

    @Override
    public String toString() {
        return "PlayRecord{" +
                "id=" + id +
                ", userId=" + userId +
                ", videoId=" + videoId +
                ", currentNum=" + currentNum +
                ", episodeId=" + episodeId +
                ", createTime=" + createTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(Integer currentNum) {
        this.currentNum = currentNum;
    }

    public Integer getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(Integer episodeId) {
        this.episodeId = episodeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

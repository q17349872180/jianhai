package net.xdclass.online_xdclass.model.entity;

import java.util.Date;

/**
 * id          int(11) unsigned auto_increment
 *         primary key,
 *     title       varchar(524)         null comment '集标题',
 *     num         int(10)              null comment '第几集,全局顺序',
 *     ordered     int                  null comment '顺序，章里面的顺序',
 *     play_url    varchar(256)         null comment '播放地址',
 *     chapter_id  int                  null comment '章节主键id',
 *     free        tinyint(2) default 0 null comment '0表示免费，1表示首付',
 *     video_id    int(10)              null comment '视频id',
 *     create_time datetime             null comment '创建时间'
 */
public class Episode {
    private Integer id;

    private String title;

    private Integer num;

    private Integer ordered;

    private String playUrl;

    private Integer chapterId;

    private Integer free;

    private Integer videoId;

    private Date createTime;

    @Override
    public String toString() {
        return "EpisodeMapper{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", num=" + num +
                ", ordered=" + ordered +
                ", playUrl='" + playUrl + '\'' +
                ", chapterId=" + chapterId +
                ", free=" + free +
                ", videoId=" + videoId +
                ", createTime=" + createTime +
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

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Integer getFree() {
        return free;
    }

    public void setFree(Integer free) {
        this.free = free;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

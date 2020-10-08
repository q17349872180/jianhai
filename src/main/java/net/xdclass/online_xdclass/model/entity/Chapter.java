package net.xdclass.online_xdclass.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * id          int(11) unsigned auto_increment
 *         primary key,
 *     video_id    int          null comment '视频主键',
 *     title       varchar(128) null comment '章节名称',
 *     ordered     int          null comment '章节顺序',
 *     create_time datetime     null comment '创建时间'
 */
public class Chapter implements Serializable {

    private Integer id;

    private Integer videoId;

    private String title;

    private Integer ordered;

    private Date createTime;

    private List<Episode> episodeList;

    public List<Episode> getEpisodeList() {
        return episodeList;
    }

    public void setEpisodeList(List<Episode> episodeList) {
        this.episodeList = episodeList;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", videoId=" + videoId +
                ", title='" + title + '\'' +
                ", ordered=" + ordered +
                ", createTime=" + createTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

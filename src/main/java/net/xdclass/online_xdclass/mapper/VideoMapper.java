package net.xdclass.online_xdclass.mapper;

import net.xdclass.online_xdclass.model.entity.Video;
import net.xdclass.online_xdclass.model.entity.VideoBanner;
import net.xdclass.online_xdclass.model.entity.VideoOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface VideoMapper {
    List<Video> listVideo();

    List<VideoBanner> listBanner();

    Video findDetailById(@Param("video_id") int videoId);

    Video  findById(@Param("video_id") int videoId);
}

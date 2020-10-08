package net.xdclass.online_xdclass.mapper;

import net.xdclass.online_xdclass.model.entity.Episode;
import org.apache.ibatis.annotations.Param;

public interface EpisodeMapper {
    Episode findFirstByVideoId(@Param("video_id") int videoId);
}

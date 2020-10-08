package net.xdclass.online_xdclass.service.impl;

import net.xdclass.online_xdclass.exception.XDException;
import net.xdclass.online_xdclass.mapper.EpisodeMapper;
import net.xdclass.online_xdclass.mapper.PlayRecordMapper;
import net.xdclass.online_xdclass.mapper.VideoMapper;
import net.xdclass.online_xdclass.mapper.VideoOrderMappero;
import net.xdclass.online_xdclass.model.entity.Episode;
import net.xdclass.online_xdclass.model.entity.PlayRecord;
import net.xdclass.online_xdclass.model.entity.Video;
import net.xdclass.online_xdclass.model.entity.VideoOrder;
import net.xdclass.online_xdclass.service.VideoOrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class VideoOrderSerivceImpl implements VideoOrderService {
    @Autowired
    private VideoOrderMappero videoOrderMappero;
    @Autowired
    private VideoMapper videoMapper;

    @Autowired
    private EpisodeMapper episodeMapper;

    @Autowired
    private PlayRecordMapper playRecordMapper;
    @Override
    @Transactional
    public int save(int userId, int videoId) {
        VideoOrder videoOrder = videoOrderMappero.findByUserIdAndVideoIdAndState(userId,videoId,1);
        if (videoOrder !=null){
            return 0;
        }
        Video video = videoMapper.findById(videoId);
        VideoOrder videoOrder1 = new VideoOrder();
        videoOrder1.setCreateTime(new Date());
        videoOrder1.setOutTeadeNo(UUID.randomUUID().toString());
        videoOrder1.setState(1);
        videoOrder1.setTotalFee(video.getPrice());
        videoOrder1.setVideoId(videoId);
        videoOrder1.setVideoImg(video.getCoverImg());
        videoOrder1.setVideoTitle(video.getTitle());
        videoOrder1.setUserId(userId);
        int rows = videoOrderMappero.saveOrder(videoOrder1);

        if(rows == 1){
            Episode episode = episodeMapper.findFirstByVideoId(videoId);
            if(episode == null){
                throw new XDException(-1,"视频没有集信息");
            }
            PlayRecord playRecord = new PlayRecord();
            playRecord.setCreateTime(new Date());
            playRecord.setCurrentNum(episode.getNum());
            playRecord.setEpisodeId(episode.getId());
            playRecord.setUserId(userId);
            playRecord.setVideoId(videoId);
            playRecordMapper.saveRecord(playRecord);
        }
        return rows;
    }

    @Override
    public List<VideoOrder> listOrderById(Integer userId) {

        return videoOrderMappero.findById(userId);
    }
}

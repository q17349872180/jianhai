package net.xdclass.online_xdclass.controller;

import net.xdclass.online_xdclass.model.entity.Video;
import net.xdclass.online_xdclass.model.entity.VideoBanner;
import net.xdclass.online_xdclass.service.VideoService;
import net.xdclass.online_xdclass.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/v1/pub/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @RequestMapping("list")
    public Object listVideo(){

    List<Video> list = videoService.listVideo();
    return JsonData.buildSuccess(list);
    }

    @GetMapping("list_banner")
    public JsonData listBanner(){

    List<VideoBanner> list = videoService.listBanner();
    return JsonData.buildSuccess(list);
    }

    @GetMapping("find_detail_by_id")
    public JsonData findDetailByid(@RequestParam(value = "video_id",required = true)int videoId){

        Video video = videoService.findDetailById(videoId);
        return JsonData.buildSuccess(video);
    }
}

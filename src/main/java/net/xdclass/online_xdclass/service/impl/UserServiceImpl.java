package net.xdclass.online_xdclass.service.impl;
import	java.util.Random;
import	java.util.Date;

import net.xdclass.online_xdclass.model.entity.User;
import net.xdclass.online_xdclass.mapper.UserMapper;
import net.xdclass.online_xdclass.service.UserService;
import net.xdclass.online_xdclass.utils.CommonUtils;
import net.xdclass.online_xdclass.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int save(Map<String, String> userInfo) {

        User user = parseToUser(userInfo);
        if (user != null) {
           return userMapper.save(user);
        }else {
            return -1;
        }
    }

    @Override
    public String findByPhoneAn1dPwd(String phone, String pwd) {

       User user = userMapper.findByPhoneAndPwd(phone, CommonUtils.MD5(pwd));
       if (user != null) {
           String token = JWTUtils.geneJsonWebToken(user);
           return token;
       }else {
           return null;
       }
    }

    @Override
    public User finById(Integer id) {
        User user = userMapper.findById(id);
        return user;
    }

    /**
     *
     * @param userInfo
     * @return
     */
    private User parseToUser(Map<String, String> userInfo) {

        if (userInfo.containsKey("phone") && userInfo.containsKey("pwd") && userInfo.containsKey("name")){
            User user = new User();
            user.setPhone(userInfo.get("phone"));
            user.setName(userInfo.get("name"));
            user.setHeadImg(getRandomimg());
            user.setCrateTime(new Date());
            String pwd = userInfo.get("pwd");
            user.setPwd(CommonUtils.MD5(pwd));
            return user;
        }else {
            return null;
        }
    }

    private static final String [] headImg = {
            "https://xd-video-pc-img.oss-cnbeijing.aliyuncs.com/xdclass_pro/default/head_img/12.jpeg",
            "https://xd-video-pc-img.oss-cnbeijing.aliyuncs.com/xdclass_pro/default/head_img/11.jpeg",
            "https://xd-video-pc-img.oss-cnbeijing.aliyuncs.com/xdclass_pro/default/head_img/13.jpeg",
            "https://xd-video-pc-img.oss-cnbeijing.aliyuncs.com/xdclass_pro/default/head_img/14.jpeg",
            "https://xd-video-pc-img.oss-cnbeijing.aliyuncs.com/xdclass_pro/default/head_img/15.jpeg"
    };
    public String getRandomimg(){
        int size = headImg.length;
        Random random = new Random();
       int s= random.nextInt(size);
        return headImg[s];
    }


}
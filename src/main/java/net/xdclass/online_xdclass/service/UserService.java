package net.xdclass.online_xdclass.service;

import net.xdclass.online_xdclass.model.entity.User;

import java.util.Map;

public interface UserService{

    /**
     * 新增用户
     * @param userInfo
     * @return
     */
    int save(Map<String, String> userInfo);

    String findByPhoneAn1dPwd(String phone, String pwd);

    User finById(Integer id);
}

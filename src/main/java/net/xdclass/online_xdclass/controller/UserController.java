package net.xdclass.online_xdclass.controller;

import net.xdclass.online_xdclass.model.entity.User;
import net.xdclass.online_xdclass.model.request.LoginRequest;
import net.xdclass.online_xdclass.service.UserService;
import net.xdclass.online_xdclass.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("api/v1/pri/user")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("register")
    public JsonData register(@RequestBody Map<String, String> userInfo ){
        int rows = userService.save(userInfo);
        return rows == 1 ? JsonData.buildSuccess(rows): JsonData.buildError("注册失败");
    }

    @PostMapping("login")
    public JsonData longin(@RequestBody LoginRequest loginRequest){
        String token = userService.findByPhoneAn1dPwd(loginRequest.getPhone(),loginRequest.getPwd());
        return token == null ? JsonData.buildError("登录失败密码错误"): JsonData.buildSuccess(token);
    }

    @GetMapping("find_by_token")
    public JsonData findUserByToken(HttpServletRequest request){

        Integer id = (Integer) request.getAttribute("user_id");
        if(id == null){
            return JsonData.buildError("查询失败");
        }
        User user = userService.finById(id);
        return JsonData.buildSuccess(user);
    }

}

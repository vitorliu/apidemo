package com.example.demo.controller;

import com.example.demo.constant.Constant;
import com.example.demo.entity.ResponseMessage;
import com.example.demo.service.UserService;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import java.util.List;
import java.util.Map;


@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/getUserItem",method = RequestMethod.GET)
    @ResponseBody
    public ResponseMessage getUserItem(String id, ServletRequest request){
        ResponseMessage msg=new ResponseMessage();
        try{
            msg=userService.getUser(id);
            System.out.println("getUserItem return msg:"+msg.toString()+"userId="+id);
        }catch (Exception e){
            System.out.println("getUserItem request params:"+request.getParameter("data"));
            msg.setCode(Constant.ERROR_CODE);
            msg.setMsg(Constant.ERROR_MSG);
        }
        return msg;
    }
}

package com.example.demo.service;

import com.example.demo.entity.ResponseMessage;
import com.example.demo.entity.UserInfo;

import java.util.List;
import java.util.Map;

public interface UserService {
    ResponseMessage getUser(String userId);
}

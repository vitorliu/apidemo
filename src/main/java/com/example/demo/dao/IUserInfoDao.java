package com.example.demo.dao;

import com.example.demo.entity.UserInfo;
import org.apache.ibatis.annotations.Select;


public interface IUserInfoDao {
 //   @Select("select *from yyl_user_info where id=#{id}")
    UserInfo getUserInfo(String id);
}

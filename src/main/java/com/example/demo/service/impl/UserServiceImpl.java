package com.example.demo.service.impl;

import com.example.demo.constant.Constant;
import com.example.demo.dao.IUserInfoDao;
import com.example.demo.entity.ResponseMessage;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserService;
import com.example.demo.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Override
    public ResponseMessage getUser(String userId) {
        SqlSession sqlSession = MybatisUtils.getSqlFactory().openSession();
      //  UserInfo userInfo= sqlSession.selectOne("UserInfoDao.getUser",userId);
        IUserInfoDao userInfoDao = sqlSession.getMapper(IUserInfoDao.class);
        UserInfo userInfo = userInfoDao.getUserInfo(userId);
        ResponseMessage msg;
        try {
            if (userInfo!=null){
                msg=new ResponseMessage(Constant.SUCCESS_CODE,Constant.SUCCESS_MSG,userInfo);
            }else {
                msg=new ResponseMessage("-1","该用户不存在");
            }
        }catch (Exception e){
            msg=new ResponseMessage(Constant.ERROR_CODE,Constant.ERROR_MSG);
        }
        return msg;
    }
}

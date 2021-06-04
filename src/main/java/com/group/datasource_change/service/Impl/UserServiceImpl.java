package com.group.datasource_change.service.Impl;

import com.group.datasource_change.entity.UserEntity;
import com.group.datasource_change.mapper.student1.UserMapper1;
import com.group.datasource_change.mapper.student2.UserMapper2;
import com.group.datasource_change.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rensiqi1
 * @date 2021/6/4 18:16
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {


    @Resource
    UserMapper1 userMapper1;

    @Resource
    UserMapper2 userMapper2;


    @Override
    public List<UserEntity> queryStudentByName1(String name){
        log.info("UserServiceImpl -> queryStudentByName,name:{}",name);
        List<UserEntity> list = new ArrayList<>();
        list = userMapper1.queryStudentByName1(name);
        log.info("UserServiceImpl -> queryStudentByName,result:{}",list);
        return  list;
    }

    @Override
    public List<UserEntity> queryStudentByName2(String name){
        log.info("UserServiceImpl -> queryStudentByName,name:{}",name);
        List<UserEntity> list = new ArrayList<>();
        list = userMapper2.queryStudentByName2(name);
        log.info("UserServiceImpl -> queryStudentByName,result:{}",list);
        return  list;
    }

    @Override
    public List<UserEntity> queryStudentByAge1(Integer age){
        log.info("UserServiceImpl -> queryStudentByName,name:{}",age);
        List<UserEntity> list = new ArrayList<>();
        list = userMapper1.queryStudentByAge1(age);
        log.info("UserServiceImpl -> queryStudentByName,result:{}",list);
        return  list;
    }

    @Override
    public List<UserEntity> queryStudentByAge2(Integer age){
        log.info("UserServiceImpl -> queryStudentByAge,age:{}",age);
        List<UserEntity> list = new ArrayList<>();
        list = userMapper2.queryStudentByAge2(age);
        log.info("UserServiceImpl -> queryStudentByAge,result:{}",list);
        return list;
    }
}

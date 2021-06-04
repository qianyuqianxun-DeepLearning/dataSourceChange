package com.group.datasource_change.service;

import com.group.datasource_change.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rensiqi1
 * @date 2021/6/4 18:14
 */
public interface UserService {

    /**
     * 数据源1 查询学生信息根据名字
     * @param name
     * @return
     */
     List<UserEntity> queryStudentByName1(String name);

    /**
     * 数据源2 查询学生信息根据年龄
     * @param age
     * @return
     */
     List<UserEntity> queryStudentByAge1(Integer age);

    /**
     * 数据源2 查询学生信息根据名字
     * @param name
     * @return
     */
     List<UserEntity> queryStudentByName2(String name);

    /**
     * 数据源2 查询学生信息根据年龄
     * @param age
     * @return
     */
    List<UserEntity> queryStudentByAge2(Integer age);




}

package com.group.datasource_change.mapper.student1;

import com.group.datasource_change.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author rensiqi1
 * @date 2021/6/4 18:12
 */
@Mapper
public interface UserMapper1 {

    List<UserEntity> queryStudentByName1(String name);

    List<UserEntity> queryStudentByAge1(Integer age);
}

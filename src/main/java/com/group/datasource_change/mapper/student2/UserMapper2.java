package com.group.datasource_change.mapper.student2;

import com.group.datasource_change.entity.UserEntity;

import java.util.List;
import java.util.ListIterator;

/**
 * @author rensiqi1
 * @date 2021/6/4 18:13
 */
public interface UserMapper2 {

    List<UserEntity> queryStudentByName2(String name);

    List<UserEntity> queryStudentByAge2(Integer age);
}

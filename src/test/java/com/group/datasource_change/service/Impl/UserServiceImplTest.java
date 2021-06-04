package com.group.datasource_change.service.Impl;

import com.group.datasource_change.entity.UserEntity;
import com.group.datasource_change.service.UserService;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author rensiqi1
 * @date 2021/6/4 20:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceImplTest {

    @Resource
    UserService userService;

    @Test
    void queryStudentByName1() {
       List<UserEntity> list = userService.queryStudentByName1("chun");
       System.out.println(list);
       List<UserEntity> list1 = userService.queryStudentByName2("chun");
       System.out.println(list1);
    }

    @Test
    void queryStudentByAge() {
        List<UserEntity> list = userService.queryStudentByAge1(23);
        System.out.println(list);
        List<UserEntity> list1 = userService.queryStudentByAge2(23);
        System.out.println(list);
    }
}
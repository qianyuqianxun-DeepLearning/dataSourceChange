package com.group.datasource_change.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author rensiqi1
 * @date 2021/6/4 17:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    /**
     * 日志ID
     */
    private Long id;

    /**
     * 学生姓名
     */
    private String name;

    /**
     * 学生性别
     */
    private String gender;

    /**
     * 学生年龄
     */
    private Integer age;

    /**
     * 学生学号
     */
    private String studentId;

}

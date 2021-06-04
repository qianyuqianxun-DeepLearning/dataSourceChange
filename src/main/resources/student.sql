CREATE DATABASE IF NOT EXISTS Student1;
USE Student1;
DROP TABLE IF EXISTS `student`;
CREATE TABLE `Student`(
                          `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
                          `name` VARCHAR(50) NOT NULL COMMENT '学生姓名',
                          `gender` VARCHAR(50) NOT NULL COMMENT '学生性别',
                          `age` BIGINT(20) NOT NULL COMMENT '学生年龄',
                          `studentId` BIGINT(20) NOT NULL COMMENT '学生ID',
                          PRIMARY KEY(`id`)
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT '学生信息表';

INSERT INTO Student
    (name,gender,age,studentId)
values
('chun','man',23,1997),
('feng','man',23,1998),
('shi','man',23,1999),
('li','man',23,1996);


CREATE DATABASE IF NOT EXISTS Student2;
USE Student2;
DROP TABLE IF EXISTS `student`;
CREATE TABLE `Student`(
                          `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
                          `name` VARCHAR(50) NOT NULL COMMENT '学生姓名',
                          `gender` VARCHAR(50) NOT NULL COMMENT '学生性别',
                          `age` BIGINT(20) NOT NULL COMMENT '学生年龄',
                          `studentId` BIGINT(20) NOT NULL COMMENT '学生ID',
                          PRIMARY KEY(`id`)
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT '学生信息表';

INSERT INTO Student (name,gender,age,studentId)
values
('bu','man',23,1997),
('ru','man',23,1996),
('ni','man',21,1998);


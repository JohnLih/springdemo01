-- 创建数据库
CREATE DATABASE demo;

-- 使用数据库
USE demo;

-- 创建数据库表 user
CREATE TABLE t_user (
  `u_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `name` VARCHAR(255) NOT NULL COMMENT '用户名称',
  `password` VARCHAR(255) NOT NULL COMMENT '用户密码',
  `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  PRIMARY KEY (u_id),
  UNIQUE (`name`),
  key idx_user_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='用户表';


CREATE TABLE t_user_property(
  `u_id` BIGINT NOT NULL COMMENT '用户ID',
  `name` VARCHAR(255) NOT NULL COMMENT '用户属性名称',
  `value` VARCHAR(255) COMMENT '用户属性值',
  PRIMARY KEY (u_id,`name`),
  FOREIGN KEY (u_id) REFERENCES t_user(u_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户属性表';

-- test
INSERT INTO t_user(name,password) VALUES
      ('zhangsan','123456');
INSERT INTO t_user_property(u_id, name, value) VALUES
  (1000,'email','demo@123.com');

SELECT `u_id`,`name`,`password`,`create_time` FROM t_user LIMIT 0,10;

DELETE FROM t_user WHERE u_id = 1000;

SELECT u_id AS userId,
  `name`,
  `value`
FROM t_user_property;


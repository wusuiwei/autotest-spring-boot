###################################系统管理##############################
-- 用户表
CREATE TABLE `sys_user`
(
    `id`              int NOT NULL,
    `real_name`       varchar(50) COMMENT '真实姓名',
    `nickname`        varchar(50) COMMENT '用户昵称',
    `gender`          varchar(255) COMMENT '性别',
    `mobile`          varchar(100) COMMENT '电话号码',
    `email`           varchar(100) COMMENT '邮箱',
    `birthday`        date COMMENT '生日',
    `compony_id`      int COMMENT '所属企业ID',
    `compony_name`    varchar(50) COMMENT '所属企业名称',
    `dept_id`         int COMMENT '所属部门ID',
    `dept_name`       varchar(255) COMMENT '所属部门名称',
    `entry_date`      date COMMENT '入职日期',
    `QQ`              varchar(20) COMMENT 'QQ账号',
    `weixin`          varchar(100) COMMENT '微信账号',
    `dingding`        varchar(100) COMMENT '钉钉账号',
    `address`         varchar(255) COMMENT '通讯地址',
    `last_ip`         varchar(128) COMMENT '最近登录的IP',
    `status`          tinyint COMMENT '状态：0-禁用，1-启用',
    `lockd_at`        bigint COMMENT '禁用时间',
    `created_user_id` bigint COMMENT '创建用户',
    `created_at`      bigint COMMENT '创建时间',
    `updated_at`      bigint COMMENT '更新时间',
    `updated_user_id` bigint COMMENT '更新用户',
    PRIMARY KEY (`id`),
    UNIQUE KEY `mobile` (`mobile`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT ='用户表';

-- 角色表
create table if not exists `sys_role`
(
    `id`              int not null,
    `role_name`       varchar(50),
    `created_user_id` bigint COMMENT '创建用户',
    `created_at`      bigint COMMENT '创建时间',
    `updated_at`      bigint COMMENT '更新时间',
    `updated_user_id` bigint COMMENT '更新用户',
    PRIMARY KEY (`id`)
) engine = InnoDB
  default charset = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci comment '角色表';

-- 账号表
create table if not exists `sys_account`
(
    `id`              int not null,
    `account`       varchar(50) comment  '账号',
    `password` varchar(100) comment  '密码',
    `salt` varchar(20) comment  '盐',
    `created_user_id` bigint COMMENT '创建用户',
    `created_at`      bigint COMMENT '创建时间',
    `updated_at`      bigint COMMENT '更新时间',
    `updated_user_id` bigint COMMENT '更新用户',
    PRIMARY KEY (`id`)
) engine = InnoDB
  default charset = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci comment '账号表';

-- 操作日志表
create table if not exists `sys_operation_log`
(
    `id`              int not null,
    `account`       varchar(50) comment  '账号',
    `password` varchar(100) comment  '密码',
    `salt` varchar(20) comment  '盐',
    `created_user_id` bigint COMMENT '创建用户',
    `created_at`      bigint COMMENT '创建时间',
    `updated_at`      bigint COMMENT '更新时间',
    `updated_user_id` bigint COMMENT '更新用户',
    PRIMARY KEY (`id`)
) engine = InnoDB
  default charset = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci comment '操作日志表';

-- 配置表
create table if not exists `sys_config`
(
    `id`              int not null,
    `account`       varchar(50) comment  '账号',
    `password` varchar(100) comment  '密码',
    `salt` varchar(20) comment  '盐',
    `created_user_id` bigint COMMENT '创建用户',
    `created_at`      bigint COMMENT '创建时间',
    `updated_at`      bigint COMMENT '更新时间',
    `updated_user_id` bigint COMMENT '更新用户',
    PRIMARY KEY (`id`)
) engine = InnoDB
  default charset = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci comment '日志表';

-- 数据字典表
create table if not exists `sys_dict`
(
    `id`              int not null,
    `account`       varchar(50) comment  '账号',
    `password` varchar(100) comment  '密码',
    `salt` varchar(20) comment  '盐',
    `created_user_id` bigint COMMENT '创建用户',
    `created_at`      bigint COMMENT '创建时间',
    `updated_at`      bigint COMMENT '更新时间',
    `updated_user_id` bigint COMMENT '更新用户',
    PRIMARY KEY (`id`)
) engine = InnoDB
  default charset = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci comment '日志表';




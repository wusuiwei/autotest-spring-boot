###################################测试中心##############################
-- 测试套件表
create table if not exists `t_suite`
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
  COLLATE = utf8mb4_0900_ai_ci comment '测试套件表';

-- 测试用例表
create table if not exists `t_case`
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
  COLLATE = utf8mb4_0900_ai_ci comment '测试用例表';

-- 功能测试步骤表
create table if not exists `t_case_step`
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
  COLLATE = utf8mb4_0900_ai_ci comment '功能测试步骤表';

-- 脚本测试步骤表
create table if not exists `t_scipt_case_step`
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
  COLLATE = utf8mb4_0900_ai_ci comment '脚本测试步骤表';

-- 测试用例执行记录表
create table if not exists `t_case_log`
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
  COLLATE = utf8mb4_0900_ai_ci comment '测试用例执行记录表';

-- 测试用例步骤执行记录表
create table if not exists `t_case_log`
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
  COLLATE = utf8mb4_0900_ai_ci comment '测试用例步骤执行记录表';

-- 测试报告记录表
create table if not exists `t_case_log`
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
  COLLATE = utf8mb4_0900_ai_ci comment '测试报告记录表';

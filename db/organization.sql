###################################组织管理##############################
-- 公司表
create table if not exists `o_compony`
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
  COLLATE = utf8mb4_0900_ai_ci comment '公司表';

-- 部门表
create table if not exists `o_dept`
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
  COLLATE = utf8mb4_0900_ai_ci comment '部门表';

-- 人员表
create table if not exists `o_member`
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
  COLLATE = utf8mb4_0900_ai_ci comment '人员表';
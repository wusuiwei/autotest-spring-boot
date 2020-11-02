package io.github.wusuiwei.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 项目表
 */
@Data
@Table(name = "project")
@Entity
public class ProjectEntity {
    /**
     * ID
     */
    @Id
    private Integer id;
    /**
     * 项目名称
     */
    private String name;
    /**
     * 项目描述
     */
    private String desc;
    /**
     * 状态
     */
    private Boolean state;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 更新时间
     */
    private Long updateTime;
}

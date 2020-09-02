package io.github.wusuiwei.model;

import lombok.Data;

@Data
public class WebUITestCase {
    private Integer id;
    private String name;
    private String keyword;
    private String params;
    private String comment;
}

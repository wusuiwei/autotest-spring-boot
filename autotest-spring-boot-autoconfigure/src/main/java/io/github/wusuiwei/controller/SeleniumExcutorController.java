package io.github.wusuiwei.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/selenium")
public class SeleniumExcutorController {

    @PostMapping("/excute")
    public String excute(List<String> packages, List<String> clazzes, List<String> ids) {
        return "执行中";
    }
}

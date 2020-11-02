package io.github.wusuiwei.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reporter")
public class ReporterController {

    @GetMapping("/")
    public String getReporter() {
        return  "hello";
    }
}

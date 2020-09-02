package io.github.wusuiwei.controller.webui;

import io.github.wusuiwei.model.WebUITestCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/webui/case")
public class WebUITestCaseController {

    @GetMapping("")
    public List<WebUITestCase> list() {
        return new ArrayList<WebUITestCase>();
    }
}

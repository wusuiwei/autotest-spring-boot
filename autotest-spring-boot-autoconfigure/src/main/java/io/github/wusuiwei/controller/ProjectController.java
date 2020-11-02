package io.github.wusuiwei.controller;

import io.github.wusuiwei.entity.ProjectEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @GetMapping("")
    public List<ProjectEntity> getList() {
        return new ArrayList<ProjectEntity>();
    }

    @GetMapping("/search")
    public List<ProjectEntity> search(String name) {
        return new ArrayList<ProjectEntity>();
    }

    @GetMapping("/{id}")
    public ProjectEntity getByid(@PathVariable("id") Integer id) {
        return new ProjectEntity();
    }

    @PostMapping("/")
    public void create(ProjectEntity projectEntity) {

    }

    @PostMapping("/{id}")
    public void update(ProjectEntity projectEntity) {

    }
    @DeleteMapping("/{id}")
    public void delete(Integer id) {

    }
}

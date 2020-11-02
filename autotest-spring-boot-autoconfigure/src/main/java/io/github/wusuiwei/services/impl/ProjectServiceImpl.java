package io.github.wusuiwei.services.impl;

import io.github.wusuiwei.dao.ProjectRepository;
import io.github.wusuiwei.entity.ProjectEntity;
import io.github.wusuiwei.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public void create(ProjectEntity projectEntity) {
        projectRepository.save(projectEntity);
    }

}

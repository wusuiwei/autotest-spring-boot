package io.github.wusuiwei.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

public class MySelectImports implements ImportSelector {
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"io.github.wusuiwei.controller.ExcutorContrller"};
    }
}

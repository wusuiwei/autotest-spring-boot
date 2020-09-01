package io.github.wusuiwei.controller;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

import static org.junit.platform.engine.discovery.ClassNameFilter.includeClassNamePatterns;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;

@RestController
@RequestMapping("/excutor")
public class ExcutorContrller {

    @GetMapping("/")
    public String excute(String packageName, String className) throws FileNotFoundException {
        new Thread(() -> {

        });
        System.out.println(packageName + "======" + className);
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder
                .request()
                .selectors(
                        selectPackage("com.baidu")
//                        selectClass(com.baidu.cases.LoginTest.class)
                )
                .filters(
                        includeClassNamePatterns(".*Test")
                )
                .build();
        Launcher launcher = LauncherFactory.create();
        // Register a listener of your choice
        SummaryGeneratingListener listener = new SummaryGeneratingListener();
        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);

        TestExecutionSummary summary = listener.getSummary();
        System.out.println(summary);
        // Do something with the TestExecutionSummary.
        return "执行中";
    }
}

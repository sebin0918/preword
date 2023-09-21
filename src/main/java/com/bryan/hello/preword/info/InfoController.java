package com.bryan.hello.preword.info;

import com.bryan.hello.preword.info.model.Project;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.Date;

@Slf4j
@RestController
public class InfoController {

    @GetMapping("/info")
    public Object projectInfo() {
        log.debug("/info start");

        Project project = new Project();
        project.projectName = "preword";
        project.author = null; //"hello-bryan";
        project.createdDate = new Date();
        return project;
    }
}

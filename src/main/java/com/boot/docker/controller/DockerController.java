package com.boot.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName: com.boot.docker.controller
 * @ClassName: DockerController
 * @Description: This is DockerController class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-22 3:07
 */
@RestController
public class DockerController {
    @RequestMapping("/test")
    public String test() {
        return "hello docker!";
    }
}

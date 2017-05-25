package com.shearf.demo.docker.web.controller;

import com.shearf.demo.docker.domain.entity.AccessLog;
import com.shearf.demo.docker.service.AccessLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xiahaihu on 17/5/25.
 */
@RestController
@RequestMapping("access/log")
public class AccessLogController {

    @Autowired
    private AccessLogService accessLogService;

    @GetMapping(value = {"", "/"})
    public List<AccessLog> list() {
        return accessLogService.listAll();
    }
}

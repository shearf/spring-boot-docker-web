package com.shearf.demo.docker.service;

import com.shearf.demo.docker.domain.entity.AccessLog;

import java.util.List;

/**
 * Created by xiahaihu on 17/5/25.
 */
public interface AccessLogService {

    /**
     * 获得全部
     *
     * @return
     */
    List<AccessLog> listAll();

    void createLog(AccessLog accessLog);
}

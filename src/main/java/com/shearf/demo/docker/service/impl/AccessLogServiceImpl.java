package com.shearf.demo.docker.service.impl;

import com.shearf.demo.docker.dal.mapper.AccessLogMapper;
import com.shearf.demo.docker.domain.entity.AccessLog;
import com.shearf.demo.docker.service.AccessLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiahaihu on 17/5/25.
 */
@Service
public class AccessLogServiceImpl implements AccessLogService {

    @Autowired
    private AccessLogMapper accessLogMapper;

    @Override
    public List<AccessLog> listAll() {
        return accessLogMapper.selectAll();
    }

    @Override
    public void createLog(AccessLog accessLog) {
        accessLogMapper.insert(accessLog);
    }
}

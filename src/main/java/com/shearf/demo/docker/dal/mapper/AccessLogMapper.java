package com.shearf.demo.docker.dal.mapper;

import com.shearf.demo.docker.domain.entity.AccessLog;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiahaihu on 17/5/25.
 */
@Repository
public interface AccessLogMapper {
    List<AccessLog> selectAll();

    void insert(AccessLog accessLog);
}

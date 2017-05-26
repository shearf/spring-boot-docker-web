package com.shearf.demo.docker.domain.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by xiahaihu on 17/5/25.
 */
@Data
public class AccessLog extends Model {

    private String remoteAddr;

    private String serverName;

    private Date createTime;
}

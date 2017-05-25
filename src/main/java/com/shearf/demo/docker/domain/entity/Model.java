package com.shearf.demo.docker.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by xiahaihu on 17/5/25.
 */
@Data
public abstract class Model implements Serializable {

    private Integer id;
}

package com.shearf.demo.docker.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xiahaihu on 17/5/27.
 */
@RestController
@RequestMapping("cache")
public class RedisController {

    @Autowired
    private StringRedisTemplate template;


    @GetMapping("set/{key}/{value}")
    public boolean cacheQuery(@PathVariable("key") String key, @PathVariable("value") String value) {
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key, value);
        return true;
    }

    @GetMapping("get/{key}")
    public String getCache(@PathVariable String key) {
        ValueOperations<String, String> ops = template.opsForValue();
        if (template.hasKey(key)) {
            return ops.get(key);
        }
        return null;
    }
}

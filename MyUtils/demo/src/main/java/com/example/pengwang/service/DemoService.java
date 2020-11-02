package com.example.pengwang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author peng.wang
 * @Description TODO
 * @createTime 2019/11/5
 */
@Service
public class DemoService {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int getCount(){

        return jdbcTemplate.queryForObject("select count(1) from firstverifyorder", Integer.class);
    }

}

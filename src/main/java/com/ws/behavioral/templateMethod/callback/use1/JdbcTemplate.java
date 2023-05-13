package com.ws.behavioral.templateMethod.callback.use1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 王顺
 * @Date: 2023/5/13 14:52
 * @Version 1.0
 */
public class JdbcTemplate {
    public User query(String sql, JdbcTemplateDemo.UserRowMapper userRowMapper) {
        return new User();
    }
}

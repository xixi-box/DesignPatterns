package com.ws.behavioral.templateMethod.callback.use1;


import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: 王顺
 * @Date: 2023/5/13 14:51
 * @Version 1.0
 */
public class JdbcTemplateDemo {
    private JdbcTemplate jdbcTemplate;

    public User queryUser(long id) {
        String sql = "select * from user where id=" + id;
        return jdbcTemplate.query(sql, new UserRowMapper()).get(0);
    }

    class UserRowMapper implements RowMapper<User> {
        public User mapRow(ResultSet rs, int rowNum) throws SQLException, SQLException {
            User user = new User();
            user.setId(rs.getLong("id"));
            user.setName(rs.getString("name"));
            user.setTelephone(rs.getString("telephone"));
            return user;
        }
    }
}
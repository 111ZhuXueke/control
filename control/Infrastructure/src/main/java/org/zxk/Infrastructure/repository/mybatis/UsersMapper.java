package org.zxk.Infrastructure.repository.mybatis;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.zxk.domain.model.Users;

import java.util.List;

@Repository
public interface UsersMapper {
    @Select("select * from users")
    @Results({
            @Result(column = "username"),
            @Result(column = "phone"),
            @Result(column = "password"),
            @Result(column = "epassword")
    })
    List<Users> findAll();

    /*@Select("select * from users where id = ?")
    @Results({
            @Result(column = "username")
    })
    String getById(@Param("id") Integer id);*/
}

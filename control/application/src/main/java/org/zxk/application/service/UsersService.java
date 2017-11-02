package org.zxk.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zxk.Infrastructure.repository.mybatis.UsersMapper;
import org.zxk.domain.model.Users;
import java.util.List;

@Service
public class UsersService {

    @Autowired(required = false)
    private UsersMapper usersMapper;

    public List<Users> findAll(){
        return usersMapper.findAll();
    }
    //public String getById(Integer id){return usersMapper.getById(id);}
}

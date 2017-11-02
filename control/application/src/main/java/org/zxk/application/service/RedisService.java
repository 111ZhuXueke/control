package org.zxk.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RedisService {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Resource(name = "stringRedisTemplate")
    ValueOperations<String,String> valOpsStr;

    @Autowired
    RedisTemplate<Object,Object> redisTemplate;

    @Resource(name = "redisTemplate")
    ValueOperations<Object,Object> valOpsObj;

    /**
     * 根据key获取String值
     * @param str
     * @return
     */
    public String getString(String str){
        return valOpsStr.get(str);
    }

    /**
     * 设置缓存
     * @param key
     * @param value
     */
    public void setString(String key, String value){
        valOpsStr.set(key,value);
    }

    /**
     * 删除String key
     * @param key
     */
    public void delete(String key){
        stringRedisTemplate.delete(key);
    }

    /**
     * 根据key获取Object值
     * @param o
     * @return
     */
    public Object getObject(Object o){
        return valOpsObj.get(o);
    }

    /**
     * 设置Object缓存
     * @param key
     * @param value
     */
    public void setObject(Object key, Object value){
        valOpsObj.set(key, value);
    }

    /**
     * 删除key
     * @param key
     */
    public void delete(Object key){
        redisTemplate.delete(key);
    }
}

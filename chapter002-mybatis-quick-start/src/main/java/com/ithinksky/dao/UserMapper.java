package com.ithinksky.dao;

import com.ithinksky.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

/**
 * @author tengpeng.gao
 */
public interface UserMapper {


    UserEntity selectByPrimaryKey(@Param("id") Integer id);

}

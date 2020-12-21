package com.kkb.shopcenter.server.mapper;

import com.kkb.shopcenter.common.pojo.BaseEntity;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface BaseMapper <T extends BaseEntity> extends Mapper<T>,MySqlMapper<T>{
    
}

package com.safecornerscoffee.mocha.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TimeMapper {
    String getCurrentTime();
}

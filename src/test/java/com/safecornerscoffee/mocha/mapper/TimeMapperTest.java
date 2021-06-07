package com.safecornerscoffee.mocha.mapper;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/web/WEB-INF/applicationContext.xml")
public class TimeMapperTest {

    @Autowired
    TimeMapper timeMapper;

    @Test
    public void getCurrentTimeTest() {
        String time = timeMapper.getCurrentTime();
        System.out.println("time: " + time);
        Assertions.assertThat(time).isNotNull();
    }
}
package com.safecornerscoffee.mocha.service;

import com.safecornerscoffee.mocha.mapper.TimeMapper;
import org.springframework.stereotype.Service;

@Service
public class TimeService {

    private final TimeMapper timeMapper;

    public TimeService(TimeMapper timeMapper) {
        this.timeMapper = timeMapper;

    }

    public String getCurrentTime() {
        return timeMapper.getCurrentTime();
    }
}

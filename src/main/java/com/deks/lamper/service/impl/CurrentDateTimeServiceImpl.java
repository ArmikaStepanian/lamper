package com.deks.lamper.service.impl;

import com.deks.lamper.service.CurrentDateTimeService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CurrentDateTimeServiceImpl implements CurrentDateTimeService {

    @Override
    public LocalDateTime getCurrentDateTime(){
        return LocalDateTime.now();
    }

}

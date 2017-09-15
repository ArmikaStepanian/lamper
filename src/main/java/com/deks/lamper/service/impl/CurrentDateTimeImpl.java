package com.deks.lamper.service.impl;

import com.deks.lamper.service.CurrentDateTime;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CurrentDateTimeImpl implements CurrentDateTime {

    @Override
    public LocalDateTime getCurrentDateTime(){
        return LocalDateTime.now();
    }

}

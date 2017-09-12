package com.deks.lamper.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.deks.lamper.model.enums.Position;
import com.deks.lamper.service.LampSwitch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling
@Component
public class ScheduledTasksImpl {

    @Autowired
    private LampSwitch lampSwitch;

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("The time is now " + dateFormat.format(new Date()));
       lampSwitch.setSwitch(Position.ON);
    }
}

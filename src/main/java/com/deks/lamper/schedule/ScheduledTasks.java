package com.deks.lamper.schedule;

import com.deks.lamper.service.CurrentStatus;
import com.deks.lamper.service.LampSwitch;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@RequiredArgsConstructor
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private final LampSwitch lampSwitch;
    private final CurrentStatus currentStatus;

    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {
        System.out.println("The time is now " + dateFormat.format(new Date()) + " position = " + currentStatus.getCurrentPosition());
        try {
            lampSwitch.setSwitch(currentStatus.getCurrentPosition());
        } catch (Exception e) {

        }

    }
}

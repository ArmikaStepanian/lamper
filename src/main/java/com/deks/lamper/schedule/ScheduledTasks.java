package com.deks.lamper.schedule;

import com.deks.lamper.model.enums.Position;
import com.deks.lamper.service.CurrentStatus;
import com.deks.lamper.service.LampSwitch;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Slf4j
@Component
@RequiredArgsConstructor
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private final LampSwitch lampSwitch;
    private final CurrentStatus currentStatus;

    private Position previousPosition = null;

    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {

        //log.debug("The time is now {} , position {}", dateFormat.format(new Date()), currentStatus.getCurrentPosition());

        Position currentPosition = currentStatus.getCurrentPosition();
        if (previousPosition == null || !previousPosition.equals(currentPosition)) {

            log.debug("previousPosition is {} , currentPosition is {} ", previousPosition, currentPosition);
            previousPosition = currentPosition;

            try {
                lampSwitch.setSwitch(currentPosition);
            } catch (Exception e) {
                log.error(e.getMessage());
            }
        }
    }
}

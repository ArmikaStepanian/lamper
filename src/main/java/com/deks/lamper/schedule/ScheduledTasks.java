package com.deks.lamper.schedule;

import com.deks.lamper.model.enums.Position;
import com.deks.lamper.service.CurrentStatusService;
import com.deks.lamper.service.LampSwitchService;
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
    private final LampSwitchService lampSwitchService;
    private final CurrentStatusService currentStatusService;

    private Position previousPosition = null;

    @Scheduled(fixedRate = 500)
    public void reportCurrentTime() {

        //log.debug("The time is now {} , position {}", dateFormat.format(new Date()), currentStatusService.getCurrentPosition());

        Position currentPosition = currentStatusService.getCurrentPosition();
        if (previousPosition == null || !previousPosition.equals(currentPosition)) {

            log.debug("previousPosition is {} , currentPosition is {} ", previousPosition, currentPosition);
            previousPosition = currentPosition;

            try {
                lampSwitchService.setSwitch(currentPosition);
            } catch (Exception e) {
                log.error(e.getMessage());
            }
        }
    }
}

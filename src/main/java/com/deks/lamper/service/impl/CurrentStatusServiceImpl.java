package com.deks.lamper.service.impl;

import com.deks.lamper.model.enums.ManualMode;
import com.deks.lamper.model.enums.Position;
import com.deks.lamper.service.CurrentDateTimeService;
import com.deks.lamper.service.CurrentStatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static java.time.DayOfWeek.*;

@Service
@RequiredArgsConstructor
public class CurrentStatusServiceImpl implements CurrentStatusService {

    private static List<DayOfWeek> days = Arrays.asList(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY);

    private int startHour = 9; //10AM
    private int endHour = 19; //20PM

    private ManualMode manualMode = ManualMode.SCHEDULE;

    @Autowired
    CurrentDateTimeService currentDateTimeService;

    @Override
    public Position getCurrentPosition() {

        LocalDateTime currentDateTime = this.currentDateTimeService.getCurrentDateTime();

        if(!ManualMode.DISABLE.equals(this.manualMode)){
            if(ManualMode.FORCE_ON.equals(this.manualMode)){
                return Position.ON;
            }
            if (days.contains(currentDateTime.getDayOfWeek()) || ManualMode.ENABLE.equals(this.manualMode)) {
                if (currentDateTime.getHour() >= startHour && currentDateTime.getHour() <= endHour) {
                    return Position.ON;
                }
            }
        }
        return Position.OFF;
    }

    @Override
    public void setManualMode(ManualMode manualMode){
        this.manualMode = manualMode;
    }

    @Override
    public ManualMode getManualMode(){
        return this.manualMode;
    }

    @Override
    public int getStartHour() {
        return this.startHour;
    }
}

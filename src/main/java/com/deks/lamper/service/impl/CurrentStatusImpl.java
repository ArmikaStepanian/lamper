package com.deks.lamper.service.impl;

import com.deks.lamper.model.enums.ManualMode;
import com.deks.lamper.model.enums.Position;
import com.deks.lamper.service.CurrentDateTime;
import com.deks.lamper.service.CurrentStatus;
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
public class CurrentStatusImpl implements CurrentStatus {

    private static List<DayOfWeek> days = Arrays.asList(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY);

    private static int startHour = 9; //10AM
    private static int endHour = 19; //20PM

    private ManualMode manualMode = ManualMode.SCHEDULE;

    @Autowired
    CurrentDateTime currentDateTime;

    @Override
    public Position getCurrentPosition() {

        LocalDateTime currentDateTime = this.currentDateTime.getCurrentDateTime();

        if(!ManualMode.DISABLE.equals(this.manualMode)){
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
}

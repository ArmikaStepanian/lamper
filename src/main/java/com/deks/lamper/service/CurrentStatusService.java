package com.deks.lamper.service;

import com.deks.lamper.model.enums.ManualMode;
import com.deks.lamper.model.enums.Position;

public interface CurrentStatusService {
    Position getCurrentPosition();

    void setManualMode(ManualMode manualMode);

    ManualMode getManualMode();

    int getStartHour();
}

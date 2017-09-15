package com.deks.lamper.service;

import com.deks.lamper.model.enums.ManualMode;
import com.deks.lamper.model.enums.Position;

public interface CurrentStatus {
    Position getCurrentPosition();

    void setManualMode(ManualMode manualMode);

    ManualMode getManualMode();
}

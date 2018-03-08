package com.deks.lamper.service.impl;

import com.deks.lamper.model.enums.Position;
import com.deks.lamper.service.LampSwitchService;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

/**
 * @author ISmorodin
 */
@Service
public class LampSwitchServiceImpl implements LampSwitchService {

    @Override
    @SneakyThrows
    public void setSwitch(Position position) {
        /*List<String> lines = new ArrayList<>();
        if (ON.equals(position)) {
            lines = Collections.singletonList("RELE_1=ON");
        } else if (OFF.equals(position)) {
            lines = Collections.singletonList("RELE_1=OFF");
        }
        Path file = Paths.get("C:\\MP709\\MP709.local.set");
        Files.write(file, lines, Charset.forName("UTF-8"));*/

        Runtime run = Runtime.getRuntime();
        run.exec("gpio mode 1 out");
        if (Position.ON.equals(position)) {
            run.exec("gpio write 1 1");

        } else if (Position.OFF.equals(position)) {
            run.exec("gpio write 1 0");
        }
    }
}

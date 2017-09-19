package com.deks.lamper.service.impl;

import com.deks.lamper.model.enums.Position;
import com.deks.lamper.service.LampSwitchService;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.deks.lamper.model.enums.Position.OFF;
import static com.deks.lamper.model.enums.Position.ON;

/**
 * @author ISmorodin
 */
@Service
public class LampSwitchServiceImpl implements LampSwitchService {

    @Override
    @SneakyThrows
    public void setSwitch(Position position) {
        List<String> lines = new ArrayList<>();
        if (ON.equals(position)) {
            lines = Collections.singletonList("RELE_1=ON");
        } else if (OFF.equals(position)) {
            lines = Collections.singletonList("RELE_1=OFF");
        }
        Path file = Paths.get("C:\\test\\test.txt");
        Files.write(file, lines, Charset.forName("UTF-8"));
    }
}

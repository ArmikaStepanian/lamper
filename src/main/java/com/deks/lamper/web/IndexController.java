package com.deks.lamper.web;

import com.deks.lamper.model.enums.ManualMode;
import com.deks.lamper.service.CurrentStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    CurrentStatus currentStatus;

    @GetMapping("/")
    public ModelAndView index() {
        Map<String, String> model = new HashMap<>();
        model.put("mode", currentStatus.getManualMode().toString());
        model.put("position", currentStatus.getCurrentPosition().toString());
        return new ModelAndView("index", model);
    }

    @PostMapping("/enable")
    public RedirectView enable(){
        currentStatus.setManualMode(ManualMode.ENABLE);
        return new RedirectView("/");
    }

    @PostMapping("/schedule")
    public RedirectView schedule(){
        currentStatus.setManualMode(ManualMode.SCHEDULE);
        return new RedirectView("/");
    }

    @PostMapping("/disable")
    public RedirectView disable(){
        currentStatus.setManualMode(ManualMode.DISABLE);
        return new RedirectView("/");
    }
}

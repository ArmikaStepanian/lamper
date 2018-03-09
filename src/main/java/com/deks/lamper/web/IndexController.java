package com.deks.lamper.web;

import com.deks.lamper.model.enums.ManualMode;
import com.deks.lamper.service.CurrentStatusService;
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
    CurrentStatusService currentStatusService;

    @GetMapping("/")
    public ModelAndView index() {
        Map<String, String> model = new HashMap<>();
        model.put("mode", currentStatusService.getManualMode().toString());
        model.put("position", currentStatusService.getCurrentPosition().toString());
        return new ModelAndView("index", model);
    }

    @PostMapping("/enable")
    public RedirectView enable(){
        currentStatusService.setManualMode(ManualMode.ENABLE);
        return new RedirectView("/");
    }

    @PostMapping("/schedule")
    public RedirectView schedule(){
        currentStatusService.setManualMode(ManualMode.SCHEDULE);
        return new RedirectView("/");
    }

    @PostMapping("/disable")
    public RedirectView disable(){
        currentStatusService.setManualMode(ManualMode.DISABLE);
        return new RedirectView("/");
    }

    @PostMapping("/forceon")
    public RedirectView forceon(){
        currentStatusService.setManualMode(ManualMode.FORCE_ON);
        return new RedirectView("/");
    }

    @PostMapping("/time")
    public RedirectView time(){
        return new RedirectView("/time");
    }

    @PostMapping("/back")
    public RedirectView timeBack(){
        return new RedirectView("/");
    }

    @GetMapping("/time")
    public ModelAndView getTime() {
        Map<String, Integer> model = new HashMap<>();
        model.put("start", currentStatusService.getStartHour());
        return new ModelAndView("time", model);
    }
}

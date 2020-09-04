package com.ephec.sgbd.controller;

import com.ephec.sgbd.service.HomeService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    // fields
    private final HomeService homeService;

    // constructor
    @Autowired
    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    //localhost:8080/fifaman/home
    //localhost:8080/fifaman/home?user=chris
    @GetMapping("/home")
    public String home(){

        return "home";
    }

    // model attribute
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage(){

        log.info("welcomeMessage() called ");
        return homeService.getWelcomeMessage();
    }

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String home2() {

        return "home";
    }

    @RequestMapping(value="/formules", method=RequestMethod.GET)
    public String Formules() {

        return "website/formules";
    }

    @RequestMapping(value="/contact", method=RequestMethod.GET)
    public String Contacthome() {

        return "website/contact";
    }
}

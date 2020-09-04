package com.ephec.sgbd.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.ephec.sgbd.utils.ViewNames.APP_DESCRIPTION;
import static com.ephec.sgbd.utils.ViewNames.APP_WELCOME;

@Slf4j
@Controller
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String home() {

        return "home";
    }

    @RequestMapping(value = "/championnats", method = RequestMethod.GET)
    public String championnats() {

        return "championnats";
    }

    @RequestMapping(value = "/user/newchmapionnat", method = RequestMethod.GET)
    public String newchmapionnat() {

        return "newchmapionnat";
    }

    @RequestMapping(value = "/classement", method = RequestMethod.GET)
    public String classement() {

        return "classement";
    }

    @RequestMapping(value = "/equipes", method = RequestMethod.GET)
    public String equipes() {

        return "equipes";
    }

    @RequestMapping(value = "/matchs", method = RequestMethod.GET)
    public String matchs() {

        return "matchs";
    }

    @RequestMapping(value = "/stats", method = RequestMethod.GET)
    public String stats() {

        return "stats";
    }

    // model attribute
    @ModelAttribute("app_welcome")
    public String appWelcome(){
        return APP_WELCOME;
    }

    @ModelAttribute("app_description")
    public String appDescription(){
        return APP_DESCRIPTION;
    }

}

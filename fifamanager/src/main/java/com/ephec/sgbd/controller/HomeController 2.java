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
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home2() {

        return "home";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {

        return "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {

        return "login";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {

        return "register";
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

            /*
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
        public String home(@RequestParam String name, @RequestParam String surname,  Model model) {
            model.addAttribute("name", homeService.getMyName(name));
            model.addAttribute("surname", homeService.getMyName(surname));
            log.info("model = {}", model);

            return "home";
        }

        // model attribute
        @ModelAttribute("welcomeMessage")
        public String welcomeMessage(){

            log.info("welcomeMessage() called ");
            return homeService.getWelcomeMessage();
        }
     */
}

package com.ephec.sgbd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
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

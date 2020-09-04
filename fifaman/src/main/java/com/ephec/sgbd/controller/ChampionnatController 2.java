package com.ephec.sgbd.controller;

import com.ephec.sgbd.model.Championnat;
import com.ephec.sgbd.model.Equipe;
import com.ephec.sgbd.service.EquipeService;
import com.ephec.sgbd.util.AttributeNames;
import com.ephec.sgbd.util.Mappings;
import com.ephec.sgbd.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import static com.ephec.sgbd.util.ViewNames.APP_DESCRIPTION;
import static com.ephec.sgbd.util.ViewNames.APP_WELCOME;

@Slf4j
@Controller
public class ChampionnatController {

    private static final Logger log = LoggerFactory.getLogger(ChampionnatController.class);

    // == fields ==
    private final EquipeService equipeService;

    // == constructors ==
    @Autowired
    public ChampionnatController(EquipeService equipeService) {
        this.equipeService = equipeService;
    }

    // == model attributes ==
    @ModelAttribute
    public Championnat championnat() {
        return equipeService.getChampionnat();
    }

    // == handler methods ==
    // http://localhost:8080/fifaman/equipes
    @GetMapping(Mappings.EQUIPES)
    public String equipes() {
        return ViewNames.EQUIPES;
    }

    @PostMapping(Mappings.ADD_EQUIPE)
    public String ajouterEquipe(@ModelAttribute(AttributeNames.EQUIPES)  Equipe equipe){
        return "redirect:/"+ Mappings.EQUIPES;
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

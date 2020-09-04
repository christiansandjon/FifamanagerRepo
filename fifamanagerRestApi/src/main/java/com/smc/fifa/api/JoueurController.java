package com.smc.fifa.api;

import com.smc.fifa.model.Joueur;
import com.smc.fifa.taskservice.ChampionnatServiceImpl;
import com.smc.fifa.taskservice.JoueurServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("api/v1/joueur")
public class JoueurController {

    private final JoueurServiceImpl joueurServiceImpl;

    @Autowired
    public JoueurController(JoueurServiceImpl joueurServiceImpl, ChampionnatServiceImpl championnatServiceImpl) {
        this.joueurServiceImpl = joueurServiceImpl;
    }

    @PostMapping
    public void addJoueur(@Valid @NotNull @RequestBody Joueur joueur) {
        joueurServiceImpl.addJoueur(joueur);
    }

    @GetMapping
    public List<Joueur> getAllJoueur() {
        return joueurServiceImpl.getAllJoueur();
    }

    @GetMapping(path = "{id}")
    public Joueur getJoueur(@NotNull @PathVariable("id") Integer id) {
        return joueurServiceImpl.getJoueur(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteJoueur(@NotNull @PathVariable("id") Integer id) {
        joueurServiceImpl.deleteJoueur(id);
    }

    @PutMapping(path = "{id}")
    public void updateJoueurById(@NotNull @PathVariable("id") Integer id, @Valid @NotNull @RequestBody Joueur joueurToUpdate) {
        joueurServiceImpl.updateJoueur(id, joueurToUpdate);
    }
}

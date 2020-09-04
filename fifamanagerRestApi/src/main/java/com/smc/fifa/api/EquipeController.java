package com.smc.fifa.api;

import com.smc.fifa.model.Equipe;
import com.smc.fifa.taskservice.ChampionnatServiceImpl;
import com.smc.fifa.taskservice.EquipeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("api/v1/equipe")
public class EquipeController {

    private final EquipeServiceImpl equipeServiceImpl;

    @Autowired
    public EquipeController(EquipeServiceImpl equipeServiceImpl, ChampionnatServiceImpl championnatServiceImpl) {
        this.equipeServiceImpl = equipeServiceImpl;
    }

    @PostMapping
    public void addEquipe(@Valid @NotNull @RequestBody Equipe equipe) {
        equipeServiceImpl.addEquipe(equipe);
    }

    @GetMapping
    public List<Equipe> getAllEquipe() {
        return equipeServiceImpl.getAllEquipe();
    }

    @GetMapping(path = "{id}")
    public Equipe getEquipe(@NotNull @PathVariable("id") Integer id) {
        return equipeServiceImpl.getEquipe(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteEquipe(@NotNull @PathVariable("id") Integer id) {
        equipeServiceImpl.deleteEquipe(id);
    }

    @PutMapping(path = "{id}")
    public void updateEquipeById(@NotNull @PathVariable("id") Integer id, @Valid @NotNull @RequestBody Equipe equipeToUpdate) {
        equipeServiceImpl.updateEquipe(id, equipeToUpdate);
    }
}

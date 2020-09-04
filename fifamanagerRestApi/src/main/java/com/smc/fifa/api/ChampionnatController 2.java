package com.smc.fifa.api;

import com.smc.fifa.model.Championnat;
import com.smc.fifa.taskservice.ChampionnatServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("api/v1/championnat")
public class ChampionnatController {

    private final ChampionnatServiceImpl championnatServiceImpl;

    @Autowired
    public ChampionnatController(ChampionnatServiceImpl championnatServiceImpl) {
        this.championnatServiceImpl = championnatServiceImpl;
    }

    @PostMapping
    public void addChampionnat(@Valid @NotNull @RequestBody Championnat championnat) {
        championnatServiceImpl.addChampionnat(championnat);
    }

    @GetMapping
    public List<Championnat> getAllChampionnat() {
        return championnatServiceImpl.getAllChampionnat();
    }

    @GetMapping(path = "{id}")
    public Championnat getChampionnat(@NotNull @PathVariable("id") Integer id) {
        return championnatServiceImpl.getChampionnat(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteChampionnat(@NotNull @PathVariable("id") Integer id) {
        championnatServiceImpl.deleteChampionnat(id);
    }

    @PutMapping(path = "{id}")
    public void updateChampionnatById(@NotNull @PathVariable("id") Integer id, @Valid @NotNull @RequestBody Championnat championnatToUpdate) {
        championnatServiceImpl.updateChampionnat(id, championnatToUpdate);
    }
}

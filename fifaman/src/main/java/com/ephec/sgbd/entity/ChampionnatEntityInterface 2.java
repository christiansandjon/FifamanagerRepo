package com.ephec.sgbd.entity;

import com.ephec.sgbd.model.Championnat;

import java.util.List;

public interface ChampionnatEntityInterface {

    List<Championnat> findByName(String nom);

    void updateExportBusy(int id);

    void removeTrackDocExport(int id);

    void insertTrackDocExport(Championnat championnat);
}

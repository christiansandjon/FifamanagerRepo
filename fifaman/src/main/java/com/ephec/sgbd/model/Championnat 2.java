package com.ephec.sgbd.model;

import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

@Getter
@Setter
@Data
@EqualsAndHashCode(of = "id")
public class Championnat implements Serializable {

    public static final String QUERY_FIND = "Championnat.find";

    private Integer id;
    private String nom;
    private String saison;
    private List<Equipe> equipes = new ArrayList<>();
    private int count = 1;

    public Championnat() {
	}

    public Championnat(String nom, String saison) {
        this.nom = nom;
        this.saison = saison;
    }

    // public methods
    public List<Equipe> getEquipes() {
        return equipes;
    }

	// ajouter des equipe au championnat
    public void addEquipe(@NonNull Equipe equipe) {

        equipe.setId(count);
        equipes.add(equipe);
        count++;
    }

    public void remove(int id){
		ListIterator<Equipe> equipeListIterator = equipes.listIterator();

		while (equipeListIterator.hasNext()){
			Equipe equipe = equipeListIterator.next();

			if (equipe.getId() == id){
				equipeListIterator.remove();
				break;
			}
		}
	}

	public Equipe getEquipe(int id){
    	for (Equipe equipe : equipes){
    		if (equipe.getId() == id){
    			return equipe;
			}
		}
    	return null;
	}

	public void updateEquipe(@NonNull Equipe equipe) {
    	ListIterator<Equipe> equipeListIterator = equipes.listIterator();

		while (equipeListIterator.hasNext()){
			Equipe equipe2 = equipeListIterator.next();

			if (equipe2.equals(equipe)){
				equipeListIterator.set(equipe);
				break;
			}
		}
	}

    @Override
    public String toString() {
        return "Championnat{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", saison='" + saison + '\'' +
                '}';
    }
}
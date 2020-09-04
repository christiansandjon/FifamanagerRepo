package com.ephec.sgbd.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Sanction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String type;
    @ManyToOne
    private Joueur joueur;

	public Sanction() {
	}

	public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Joueur getJoueur() {
        return this.joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Sanction sanction = (Sanction) o;
		return id == sanction.id &&
				Objects.equals(type, sanction.type) &&
				Objects.equals(joueur, sanction.joueur);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, type, joueur);
	}
}
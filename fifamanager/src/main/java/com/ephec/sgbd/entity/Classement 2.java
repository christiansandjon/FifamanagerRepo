package com.ephec.sgbd.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Classement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Resultat resultat;

	public Classement() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Resultat getResultat() {
		return resultat;
	}

	public void setResultat(Resultat resultat) {
		this.resultat = resultat;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Classement that = (Classement) o;
		return id == that.id &&
				Objects.equals(resultat, that.resultat);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, resultat);
	}
}
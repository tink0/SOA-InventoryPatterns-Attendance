package sk.tuke.seregely.dipl.att.entity;

// Generated Mar 29, 2013 4:53:51 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Oddelenie generated by hbm2java
 */
public class Oddelenie implements java.io.Serializable {

	private int idOddelenia;
	private String nazov;
	private Set zamestnanecs = new HashSet(0);
	private Set veduciOddelenias = new HashSet(0);
	private Set personalistas = new HashSet(0);

	public Oddelenie() {
	}

	public Oddelenie(int idOddelenia) {
		this.idOddelenia = idOddelenia;
	}

	public Oddelenie(int idOddelenia, String nazov, Set zamestnanecs,
			Set veduciOddelenias, Set personalistas) {
		this.idOddelenia = idOddelenia;
		this.nazov = nazov;
		this.zamestnanecs = zamestnanecs;
		this.veduciOddelenias = veduciOddelenias;
		this.personalistas = personalistas;
	}

	public int getIdOddelenia() {
		return this.idOddelenia;
	}

	public void setIdOddelenia(int idOddelenia) {
		this.idOddelenia = idOddelenia;
	}

	public String getNazov() {
		return this.nazov;
	}

	public void setNazov(String nazov) {
		this.nazov = nazov;
	}

	public Set getZamestnanecs() {
		return this.zamestnanecs;
	}

	public void setZamestnanecs(Set zamestnanecs) {
		this.zamestnanecs = zamestnanecs;
	}

	public Set getVeduciOddelenias() {
		return this.veduciOddelenias;
	}

	public void setVeduciOddelenias(Set veduciOddelenias) {
		this.veduciOddelenias = veduciOddelenias;
	}

	public Set getPersonalistas() {
		return this.personalistas;
	}

	public void setPersonalistas(Set personalistas) {
		this.personalistas = personalistas;
	}

}
package sk.tuke.seregely.dipl.att.entity;

// Generated Mar 29, 2013 4:53:51 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Zamestnanec generated by hbm2java
 */
public class Zamestnanec implements java.io.Serializable {

	private int idZamestnanca;
	private Oddelenie oddelenie;
	private String celeMeno;
	private String email;
	private Set dovolenkas = new HashSet(0);
	private Set praceneschopnosts = new HashSet(0);
	private Set pritomnostVPracis = new HashSet(0);

	public Zamestnanec() {
	}

	public Zamestnanec(int idZamestnanca) {
		this.idZamestnanca = idZamestnanca;
	}

	public Zamestnanec(int idZamestnanca, Oddelenie oddelenie, String celeMeno,
			Set dovolenkas, Set praceneschopnosts, Set pritomnostVPracis) {
		this.idZamestnanca = idZamestnanca;
		this.oddelenie = oddelenie;
		this.celeMeno = celeMeno;
		this.dovolenkas = dovolenkas;
		this.praceneschopnosts = praceneschopnosts;
		this.pritomnostVPracis = pritomnostVPracis;
	}

	public int getIdZamestnanca() {
		return this.idZamestnanca;
	}

	public void setIdZamestnanca(int idZamestnanca) {
		this.idZamestnanca = idZamestnanca;
	}

	public Oddelenie getOddelenie() {
		return this.oddelenie;
	}

	public void setOddelenie(Oddelenie oddelenie) {
		this.oddelenie = oddelenie;
	}

	public String getCeleMeno() {
		return this.celeMeno;
	}

	public void setCeleMeno(String celeMeno) {
		this.celeMeno = celeMeno;
	}

	public Set getDovolenkas() {
		return this.dovolenkas;
	}

	public void setDovolenkas(Set dovolenkas) {
		this.dovolenkas = dovolenkas;
	}

	public Set getPraceneschopnosts() {
		return this.praceneschopnosts;
	}

	public void setPraceneschopnosts(Set praceneschopnosts) {
		this.praceneschopnosts = praceneschopnosts;
	}

	public Set getPritomnostVPracis() {
		return this.pritomnostVPracis;
	}

	public void setPritomnostVPracis(Set pritomnostVPracis) {
		this.pritomnostVPracis = pritomnostVPracis;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

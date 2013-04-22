package sk.tuke.seregely.dipl.att.entity;

import java.util.Date;

public class DovolenkaExport {

	private int idDovolenka;
	private Date zaciatok;
	private Date koniec;
	private int zamestnanec;
	
	public DovolenkaExport() {
		
	}
	
	public DovolenkaExport( int id, Date zaciatok, Date koniec, int zamestnanec) {
		this.idDovolenka = id;
		this.zaciatok = zaciatok;
		this.koniec = koniec;
		this.zamestnanec = zamestnanec;
	}

	public int getIdDovolenka() {
		return idDovolenka;
	}
	
	public void setIdDovolenka(int id) {
		this.idDovolenka = id;
	}
	
	public Date getZaciatok() {
		return zaciatok;
	}
	
	public void setZaciatok(Date zaciatok) {
		this.zaciatok = zaciatok;
	}
	
	public Date getKoniec() {
		return koniec;
	}
	
	public void setKoniec(Date koniec) {
		this.koniec = koniec;
	}
	
	public int getZamestnanec() {
		return zamestnanec;
	}
	
	public void setZamestnanec(int vodic) {
		this.zamestnanec = vodic;
	}
}
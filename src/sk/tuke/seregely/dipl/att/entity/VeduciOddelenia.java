package sk.tuke.seregely.dipl.att.entity;

// Generated Mar 29, 2013 4:53:51 PM by Hibernate Tools 4.0.0

/**
 * VeduciOddelenia generated by hbm2java
 */
public class VeduciOddelenia implements java.io.Serializable {

	private int idVeduceho;
	private Oddelenie oddelenie;
	private String celeMeno;

	public VeduciOddelenia() {
	}

	public VeduciOddelenia(int idVeduceho) {
		this.idVeduceho = idVeduceho;
	}

	public VeduciOddelenia(int idVeduceho, Oddelenie oddelenie, String celeMeno) {
		this.idVeduceho = idVeduceho;
		this.oddelenie = oddelenie;
		this.celeMeno = celeMeno;
	}

	public int getIdVeduceho() {
		return this.idVeduceho;
	}

	public void setIdVeduceho(int idVeduceho) {
		this.idVeduceho = idVeduceho;
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

}

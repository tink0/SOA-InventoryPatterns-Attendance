package sk.tuke.seregely.dipl.att.services.entities;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import sk.tuke.seregely.dipl.att.entity.Dovolenka;
import sk.tuke.seregely.dipl.att.entity.EntityDAO;
import sk.tuke.seregely.dipl.att.entity.Zamestnanec;

@WebService()
public class DovolenkaService {

	final EntityDAO<Dovolenka> dovolenkaDAO = new EntityDAO("sk.tuke.seregely.dipl.att.entity.Dovolenka","id_dovolenky");

	@WebMethod()
	public Dovolenka retrieve(int id) {
		return dovolenkaDAO.findById(id);
	}
	
	@WebMethod()
	public Dovolenka create(Date zaciatok, Date koniec, Zamestnanec zamestnanec, int stav) {
		Dovolenka novaDovolenka = new Dovolenka();
	
		novaDovolenka.setZaciatok(zaciatok);
		novaDovolenka.setKoniec(koniec);
		novaDovolenka.setZamestnanec(zamestnanec);
		novaDovolenka.setStav(stav);
		
		dovolenkaDAO.persist(novaDovolenka);
		
		return novaDovolenka;
	}
	
	@WebMethod()
	public void delete(int id) {
		Dovolenka toDelete;
		toDelete = dovolenkaDAO.findById(id);
		dovolenkaDAO.delete(toDelete);
	}
	
	@WebMethod()
	public Dovolenka update(Dovolenka dovolenka) {
		return dovolenkaDAO.merge(dovolenka);
	}
	
	
}

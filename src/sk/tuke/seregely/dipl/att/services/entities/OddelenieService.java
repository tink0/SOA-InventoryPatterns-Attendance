package sk.tuke.seregely.dipl.att.services.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import sk.tuke.seregely.dipl.att.entity.*;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class OddelenieService {

	final EntityDAO<Oddelenie> oddelenieDAO = new EntityDAO("sk.tuke.seregely.dipl.att.entity.Oddelenie","id_oddelenia");

	@WebMethod()
	public Oddelenie retrieve(int id) {
		return oddelenieDAO.findById(id);
	}
	
	@WebMethod()
	public Oddelenie create(String nazov) {
		Oddelenie noveOddelenie = new Oddelenie();
		
		noveOddelenie.setNazov(nazov);

		oddelenieDAO.persist(noveOddelenie);
		
		return noveOddelenie;
	}
	
	@WebMethod()
	public void delete(int id) {
		Oddelenie toDelete;
		toDelete = oddelenieDAO.findById(id);
		oddelenieDAO.delete(toDelete);
	}
	
	@WebMethod()
	public Oddelenie update(Oddelenie jazda) {
		return oddelenieDAO.merge(jazda);
	}
	
	
}


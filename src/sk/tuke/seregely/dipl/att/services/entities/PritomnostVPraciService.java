package sk.tuke.seregely.dipl.att.services.entities;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import sk.tuke.seregely.dipl.att.entity.EntityDAO;
import sk.tuke.seregely.dipl.att.entity.PritomnostVPraci;
import sk.tuke.seregely.dipl.att.entity.Zamestnanec;

@WebService()
public class PritomnostVPraciService {
	
	final EntityDAO<PritomnostVPraci> PritomnostDAO = new EntityDAO("sk.tuke.seregely.dipl.att.entity.PritomnostVPraci","id_pritomnosti");

	@WebMethod()
	public PritomnostVPraci retrieve(int id) {
		return PritomnostDAO.findById(id);
	}
	
	@WebMethod()
	public PritomnostVPraci create(Date zaciatok, Date koniec, int stav, Zamestnanec zamestnanec) {
		PritomnostVPraci novaPritomnost = new PritomnostVPraci();
		
		novaPritomnost.setKoniec(koniec);
		novaPritomnost.setStav(stav);
		novaPritomnost.setZaciatok(zaciatok);
		novaPritomnost.setZamestnanec(zamestnanec);

		PritomnostDAO.persist(novaPritomnost);
		
		return novaPritomnost;
	}
	
	@WebMethod()
	public void delete(int id) {
		PritomnostVPraci toDelete;
		toDelete = PritomnostDAO.findById(id);
		PritomnostDAO.delete(toDelete);
	}
	
	@WebMethod()
	public PritomnostVPraci update(PritomnostVPraci pp) {
		return PritomnostDAO.merge(pp);
	}
	
	
}

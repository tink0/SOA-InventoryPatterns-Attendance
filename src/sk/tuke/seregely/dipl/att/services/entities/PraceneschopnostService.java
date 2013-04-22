package sk.tuke.seregely.dipl.att.services.entities;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import sk.tuke.seregely.dipl.att.entity.EntityDAO;
import sk.tuke.seregely.dipl.att.entity.Praceneschopnost;
import sk.tuke.seregely.dipl.att.entity.Zamestnanec;

@WebService()
public class PraceneschopnostService {
	
	final EntityDAO<Praceneschopnost> praceneschopnostDAO = new EntityDAO("sk.tuke.seregely.dipl.att.entity.Praceneschopnost","id_praceneschopnosti");

	@WebMethod()
	public Praceneschopnost retrieve(int id) {
		return praceneschopnostDAO.findById(id);
	}
	
	@WebMethod()
	public Praceneschopnost create(Date koniec, Date zaciatok, int stav, Zamestnanec zamestnanec) {
		Praceneschopnost novaPraceneschopnost = new Praceneschopnost();
		
		novaPraceneschopnost.setKoniec(koniec);
		novaPraceneschopnost.setZaciatok(zaciatok);
		novaPraceneschopnost.setStav(stav);
		novaPraceneschopnost.setZamestnanec(zamestnanec);
		
		praceneschopnostDAO.persist(novaPraceneschopnost);
		
		return novaPraceneschopnost;
	}
	
	@WebMethod()
	public void delete(int id) {
		Praceneschopnost toDelete;
		toDelete = praceneschopnostDAO.findById(id);
		praceneschopnostDAO.delete(toDelete);
	}
	
	@WebMethod()
	public Praceneschopnost update(Praceneschopnost pn) {
		return praceneschopnostDAO.merge(pn);
	}
	
	
}

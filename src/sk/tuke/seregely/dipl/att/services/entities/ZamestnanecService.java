package sk.tuke.seregely.dipl.att.services.entities;

import javax.jws.WebMethod;
import javax.jws.WebService;

import sk.tuke.seregely.dipl.att.entity.EntityDAO;
import sk.tuke.seregely.dipl.att.entity.Oddelenie;
import sk.tuke.seregely.dipl.att.entity.Zamestnanec;

@WebService()
public class ZamestnanecService {
	
	final EntityDAO<Zamestnanec> zamestnanecDAO = new EntityDAO("sk.tuke.seregely.dipl.att.entity.Zamestnanec","id_zamestnanca");

	@WebMethod()
	public Zamestnanec retrieve(int id) {
		return zamestnanecDAO.findById(id);
	}
	
	@WebMethod()
	public Zamestnanec create(String celeMeno, Oddelenie oddelenie) {
		Zamestnanec novyZamestnanec = new Zamestnanec();
		
		novyZamestnanec.setCeleMeno(celeMeno);
		novyZamestnanec.setOddelenie(oddelenie);

		zamestnanecDAO.persist(novyZamestnanec);
		
		return novyZamestnanec;
	}
	
	@WebMethod()
	public void delete(int id) {
		Zamestnanec toDelete;
		toDelete = zamestnanecDAO.findById(id);
		zamestnanecDAO.delete(toDelete);
	}
	
	@WebMethod()
	public Zamestnanec update(Zamestnanec zamestnanec) {
		return zamestnanecDAO.merge(zamestnanec);
	}
	
	
}

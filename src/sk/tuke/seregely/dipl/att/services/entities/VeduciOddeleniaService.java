package sk.tuke.seregely.dipl.att.services.entities;

import javax.jws.WebMethod;
import javax.jws.WebService;

import sk.tuke.seregely.dipl.att.entity.EntityDAO;
import sk.tuke.seregely.dipl.att.entity.Oddelenie;
import sk.tuke.seregely.dipl.att.entity.VeduciOddelenia;

@WebService()
public class VeduciOddeleniaService {
	final EntityDAO<VeduciOddelenia> oddelenieDAO = new EntityDAO("sk.tuke.seregely.dipl.att.entity.VeduciOddelenia","id_veduceho");

	@WebMethod()
	public VeduciOddelenia retrieve(int id) {
		return oddelenieDAO.findById(id);
	}
	
	@WebMethod()
	public VeduciOddelenia create(String celeMeno, Oddelenie oddelenie) {
		VeduciOddelenia novyVeduci = new VeduciOddelenia();
		
		novyVeduci.setCeleMeno(celeMeno);
		novyVeduci.setOddelenie(oddelenie);

		oddelenieDAO.persist(novyVeduci);
		
		return novyVeduci;
	}
	
	@WebMethod()
	public void delete(int id) {
		VeduciOddelenia toDelete;
		toDelete = oddelenieDAO.findById(id);
		oddelenieDAO.delete(toDelete);
	}
	
	@WebMethod()
	public VeduciOddelenia update(VeduciOddelenia novyVeduci) {
		return oddelenieDAO.merge(novyVeduci);
	}
	
	
}

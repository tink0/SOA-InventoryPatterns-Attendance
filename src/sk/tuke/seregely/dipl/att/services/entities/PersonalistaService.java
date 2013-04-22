package sk.tuke.seregely.dipl.att.services.entities;

import javax.jws.WebMethod;
import javax.jws.WebService;

import sk.tuke.seregely.dipl.att.entity.EntityDAO;
import sk.tuke.seregely.dipl.att.entity.Oddelenie;
import sk.tuke.seregely.dipl.att.entity.Personalista;

@WebService()
public class PersonalistaService {
	
	final EntityDAO<Personalista> personalistaDAO = new EntityDAO("sk.tuke.seregely.dipl.att.entity.Personalista","id_personalistu");

	@WebMethod()
	public Personalista retrieve(int id) {
		return personalistaDAO.findById(id);
	}
	
	@WebMethod()
	public Personalista create(String celeMeno, Oddelenie oddelenie) {
		Personalista novyPersonalista = new Personalista();
		
		novyPersonalista.setCeleMeno(celeMeno);
		novyPersonalista.setOddelenie(oddelenie);
		
		personalistaDAO.persist(novyPersonalista);
		
		return novyPersonalista;
	}
	
	@WebMethod()
	public void delete(int id) {
		Personalista toDelete;
		toDelete = personalistaDAO.findById(id);
		personalistaDAO.delete(toDelete);
	}
	
	@WebMethod()
	public Personalista update(Personalista personalista) {
		return personalistaDAO.merge(personalista);
	}
	
	
}

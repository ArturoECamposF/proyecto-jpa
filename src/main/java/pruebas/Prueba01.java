package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Rol;

public class Prueba01 {

	public static void main(String[] args) {

		EntityManagerFactory factory= Persistence.createEntityManagerFactory("Semana01JPA");
		EntityManager em = factory.createEntityManager();
		
		Query query = em.createNamedQuery("Rol.findAll");
						
		List <Rol> rolList = (List<Rol>) query.getResultList();
	
		for (Rol r:rolList) {
			System.out.println(r.getIdrol());
			System.out.println(r.getRolName());
			System.out.println(r.getRolStatus());
		}

	}
	
}

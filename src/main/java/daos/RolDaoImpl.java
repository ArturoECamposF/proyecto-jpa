package daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Rol;

public class RolDaoImpl implements RolDao{
	
	EntityManagerFactory factory;
	EntityManager em;
	
	public RolDaoImpl () {
		factory= Persistence.createEntityManagerFactory("Semana01JPA");
		em = factory.createEntityManager();
	}

	@Override
	public void create(Rol rol) {
		
		em.getTransaction().begin();//permite una instancia asociada a la entidad sobre la cual se realiza la operacion
		em.persist(rol);//agrega temporalmente una nueva entidad
		em.getTransaction().commit();//inserta el dato en la bd
		
	}

	@Override
	public void update(Rol rol) {
		
		try {
			em.getTransaction().begin();
			em.merge(rol);//actualiza una entidad existente en la bd, tiene que venir con todos los elementos de lo que se va a actualizar
			em.getTransaction().commit();				
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
		
	
	}

	@Override
	public void delete(Rol rol) {
		em.getTransaction().begin();
		em.remove(rol);//remove pide objetos, no identificadores
		em.getTransaction().commit();
		
	}

	@Override
	public Rol find(Integer id) {
		
		return em.find(Rol.class, id);
	}

	@Override
	public List<Rol> findAll() {		
			Query query = em.createNamedQuery("Rol.findAll");
			List<Rol> lista = query.getResultList();
			
			return lista;
		}
	}



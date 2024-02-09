package pruebas;

import java.util.List;

import daos.RolDao;
import daos.RolDaoImpl;
import model.Rol;

public class Prueba04 {

	public static void main(String[] args) {

		RolDao dao = new RolDaoImpl();
		
		Rol rol = new Rol();
		rol.setRolName("asistente2");
		rol.setRolStatus(1);
		
		dao.create(rol);
		
		List <Rol> rolList = dao.findAll();
		
		for (Rol r:rolList) {
			System.out.println(r.getIdrol());
			System.out.println(r.getRolName());
			System.out.println(r.getRolStatus());
		}

	}

}

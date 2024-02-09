package daos;

import java.util.List;

import model.Rol;

public interface RolDao {
	
	public void create(Rol rol);
	
	public void update(Rol rol);

	public void delete(Rol rol);//eliminar por medio del idenficador

	public Rol find(Integer id);//buscar por medio del identificador

	public List<Rol> findAll();

}

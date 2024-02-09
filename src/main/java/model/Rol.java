package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table (name="rol")
@NamedQuery(name = "Rol.findAll", query = "SELECT r FROM Rol r")

public class Rol {
	
	@Id
	@Column(name= "idrol")
	private int idrol;
	
	@Column(name = "rolName")
	private String rolName;
	
	@Column(name = "rolStatus")
	private int rolStatus;

	
	public Rol (){
		
		
	}
	
	public int getIdrol() {
		return idrol;
	}

	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}

	public String getRolName() {
		return rolName;
	}

	public void setRolName(String rolName) {
		this.rolName = rolName;
	}

	public int getRolStatus() {
		return rolStatus;
	}

	public void setRolStatus(int rolStatus) {
		this.rolStatus = rolStatus;
	}
	
	
}

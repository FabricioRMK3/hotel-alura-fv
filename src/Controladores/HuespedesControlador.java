package Controladores;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

import DAO.HuespedesDao;
import Factory.ConexionBD;
import clases.Huespedes;

public class HuespedesControlador {
	private HuespedesDao huespedesDao;
	
	public HuespedesControlador() {
		Connection con = new ConexionBD().conectarBase();
		this.huespedesDao = new HuespedesDao(con);
	}
	
	public void guardar (Huespedes huespedes) {
		this.huespedesDao.guardar(huespedes);
	}
	
	public List<Huespedes> mostrarHuesped(){
		return this.huespedesDao.mostrar();
	}
	
	public List<Huespedes> buscarHuesped(String id){
		return this.huespedesDao.buscarId(id);
	}
	
	public void actualizarH(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, String telefono,
			Integer idReserva, Integer id) {
		this.huespedesDao.ActualizarH(nombre, apellido, fechaNacimiento, nacionalidad, telefono, idReserva, id);
	}
	
	public void eliminar(Integer idReserva) {
		this.huespedesDao.Eliminar(idReserva);
	}
}

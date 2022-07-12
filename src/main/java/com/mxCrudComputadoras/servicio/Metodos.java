package com.mxCrudComputadoras.servicio;

import java.util.List;
import com.mxCrudComputadoras.dominio.Computadoras;

public interface Metodos {

	public void guardar(Computadoras computadora);
	public void editar(Computadoras computadora);
	public void eliminar(Computadoras computadora);
	
	public Computadoras buscar(Computadoras computadora);
	public List<Computadoras>lista();
	
}

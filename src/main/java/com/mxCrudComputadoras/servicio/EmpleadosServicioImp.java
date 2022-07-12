

package com.mxCrudComputadoras.servicio;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mxCrudComputadoras.dao.ComputadorasDao;
import com.mxCrudComputadoras.dominio.Computadoras;

@Service // con esta anotacion indico que esta clase va a ser un servicio
public class EmpleadosServicioImp implements Metodos {

	// inyeccion de dependencias
	// @Autowired indica la iyeccion de dependencias --> para tener un mejor control
	// de los objetos que se inicializan
	@Autowired
	ComputadorasDao computadorasDao;

	@Override
	public void guardar(Computadoras computadora) {

		computadorasDao.save(computadora);
	}

	@Override
	public void editar(Computadoras computadora) {
		computadorasDao.save(computadora);
	}

	@Override
	public void eliminar(Computadoras computadora) {

		computadorasDao.delete(computadora);

	}

	@Override
	public Computadoras buscar(Computadoras computadora) {
	
		return computadorasDao.findById(computadora.getId()).orElse(null);
		// busca por id y me devulves mi objeto --> si existe retorname null
	}

	@Override
	public List<Computadoras> lista() {

		return (List<Computadoras>) computadorasDao.findAll();
	}


}
package com.mxCrudComputadoras.dao;

import org.springframework.data.repository.CrudRepository;

import com.mxCrudComputadoras.dominio.Computadoras;

//eta es una clase kj viene de spring data contiene todos los metodso del crud generico
public interface ComputadorasDao extends CrudRepository<Computadoras, Integer>{

}

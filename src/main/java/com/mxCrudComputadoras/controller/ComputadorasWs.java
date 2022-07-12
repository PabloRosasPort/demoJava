package com.mxCrudComputadoras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mxCrudComputadoras.dominio.Computadoras;
import com.mxCrudComputadoras.servicio.Metodos;

@RestController // Indico k esta clase sera una web service tipo Rest
@RequestMapping("ComputadorasWs")
@CrossOrigin
public class ComputadorasWs {

	// listar
	@Autowired
	Metodos metodos;
	// direccion de mi web service

	// http://localhost:9000/ComputadorasWs/lista

	@GetMapping("lista")
	public List<Computadoras> lista() {
		List<Computadoras> listar = metodos.lista();
		int suma = 0;
		for (Computadoras c : listar) {

			suma += c.getPrecio();
			System.out.println("Total precio" + suma);
		}

		return listar;
	}

	// http://localhost:9000/ComputadorasWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Computadoras computadora) {
		metodos.guardar(computadora);
	}

	// editar
	// @RequestBody-->PERMITE CONVERTIR UN JSON EN OOBJETO
	// http://localhost:9000/ComputadorasWs/guardar
	@PostMapping("editar")
	public void editar(@RequestBody Computadoras computadora) {
		metodos.editar(computadora);
	}

	// http://localhost:9000/ComputadorasWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Computadoras computadora) {
		metodos.eliminar(computadora);
	}

	@PostMapping("buscar")
	public Computadoras buscar(@RequestBody Computadoras computadora) {
		computadora = metodos.buscar(computadora);
		return computadora;
	}

}

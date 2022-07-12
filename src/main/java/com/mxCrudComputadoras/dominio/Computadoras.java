package com.mxCrudComputadoras.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPUTADORAS_7")
public class Computadoras {

	@Id // este es la llave de mi tabla--> pk
	@Column(name = "ID", columnDefinition = "NUMBER") // MAPEA MI TABLA MED ICE LA ESTRC DE MI TABLA
	int id;
	@Column(name = "MARCA", columnDefinition = "NVARCHAR2(100)")
	String marca;
	@Column(name = "MODELO", columnDefinition = "NVARCHAR2(100)")
	String modelo;
	@Column(name = "COLOR", columnDefinition = "NVARCHAR2(100)")
	String color;
	@Column(name = "PRECIO", columnDefinition = "NUMBER")
	double precio;

	public Computadoras() {

	}

	public Computadoras(int id) {

		this.id = id;
	}

	public Computadoras(int id, String marca, String modelo, String color, double precio) {

		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Computadoras [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio="
				+ precio + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}

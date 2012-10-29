package com.laboratorio4.ejemplo.bl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	@GeneratedValue
	private Long id;

	private Long legajo;
	private String nombre;
	private String apellido;
	private String documento;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "titular")
	private List<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLegajo() {
		return legajo;
	}

	public void setLegajo(Long legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public List<CuentaBancaria> getCuentas() {
		return cuentas;
	}
	
	public void setCuenta(List<CuentaBancaria> cuenta) {
		this.cuentas = cuenta;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", legajo=" + legajo + ", nombre="
				+ nombre + ", apellido=" + apellido + ", documento="
				+ documento + "]";
	}
}

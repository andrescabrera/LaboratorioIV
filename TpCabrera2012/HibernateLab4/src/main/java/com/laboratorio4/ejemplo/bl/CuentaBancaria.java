package com.laboratorio4.ejemplo.bl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cuenta")
public class CuentaBancaria {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	private Cliente titular;
	
	private Double saldo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Cliente getTitular() {
		return titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [id=" + id + ", saldo=" + saldo + "]";
	}

}

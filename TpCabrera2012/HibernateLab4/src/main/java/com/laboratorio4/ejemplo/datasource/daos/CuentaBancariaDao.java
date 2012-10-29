package com.laboratorio4.ejemplo.datasource.daos;

import java.util.Collection;

import com.laboratorio4.ejemplo.bl.*;

public interface CuentaBancariaDao {

	public Collection<CuentaBancaria> getCuentasBancarias();
	public CuentaBancaria getCuentaBancaria(Long cuentaId);
	public Long save(CuentaBancaria cuentaBancaria);
	
}

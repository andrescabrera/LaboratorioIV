package com.laboratorio4.ejemplo.datasource.daos;

import java.util.Collection;

import com.laboratorio4.ejemplo.bl.Cliente;

public interface ClienteDao {

	public Collection<Cliente> getClientes();
	public Cliente getCliente(Long clienteId);
	public Long save(Cliente cliente);
}

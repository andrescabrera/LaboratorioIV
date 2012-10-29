package com.laboratorio4.ejemplo.presentation;

import java.util.Collection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.laboratorio4.ejemplo.bl.Cliente;
import com.laboratorio4.ejemplo.datasource.daos.ClienteDao;
import com.laboratorio4.ejemplo.datasource.daos.CuentaBancariaDao;
import com.laboratorio4.ejemplo.datasource.daos.impl.ClienteDaoImpl;
import com.laboratorio4.ejemplo.datasource.daos.impl.CuentaBancariaDaoImpl;

public class TestConsola {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("labocuatrops");
		
		ClienteDao clienteDao = new ClienteDaoImpl(emf.createEntityManager());
		CuentaBancariaDao cuentaDao = new CuentaBancariaDaoImpl(
				emf.createEntityManager());

		Cliente clienteAndres = new Cliente();

		clienteAndres.setNombre("Andres");
		clienteAndres.setApellido("Cabrera");
		clienteAndres.setLegajo(53231l);
		clienteAndres.setDocumento("123456");

		clienteDao.save(clienteAndres);
		
		System.out.println("---Persistido: " + clienteAndres);
		
//		mostrarClientes(clienteDao.getClientes());
			
		
		emf.close();
		
	}

	public static void mostrarClientes(Collection<Cliente> clientes) {

		System.out.println("--------------Clientes en la base----------------");
		for (Cliente c : clientes) {
			System.out.println(c);
		}
	}
}

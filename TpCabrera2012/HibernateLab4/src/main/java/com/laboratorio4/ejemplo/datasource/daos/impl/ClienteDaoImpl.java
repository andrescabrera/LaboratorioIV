package com.laboratorio4.ejemplo.datasource.daos.impl;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.laboratorio4.ejemplo.bl.Cliente;
import com.laboratorio4.ejemplo.datasource.daos.ClienteDao;

public class ClienteDaoImpl implements ClienteDao{

	public ClienteDaoImpl (EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	private EntityManager entityManager;	

	@Override
	@SuppressWarnings("unchecked")
	public Collection<Cliente> getClientes() {
		Query query = entityManager.createQuery("select c from Cliente c");
		Collection<Cliente> resultList = query.getResultList();
		return resultList;
	}

	@Override
	public Cliente getCliente(Long clienteId) {
		return entityManager.find(Cliente.class, clienteId);
	}
	
	@Override
	public Long save(Cliente cliente) {
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();
		entityManager.merge(cliente);		
		return cliente.getId();
	}
}

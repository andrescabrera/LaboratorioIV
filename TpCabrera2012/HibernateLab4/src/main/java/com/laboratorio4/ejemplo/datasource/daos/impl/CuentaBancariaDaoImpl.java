package com.laboratorio4.ejemplo.datasource.daos.impl;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.laboratorio4.ejemplo.bl.CuentaBancaria;
import com.laboratorio4.ejemplo.datasource.daos.CuentaBancariaDao;

public class CuentaBancariaDaoImpl implements CuentaBancariaDao {

	public CuentaBancariaDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	private EntityManager entityManager;

	@Override
	@SuppressWarnings("unchecked")
	public Collection<CuentaBancaria> getCuentasBancarias() {
		Query query = entityManager
				.createQuery("select c from CuentaBancaria c");
		Collection<CuentaBancaria> resultList = query.getResultList();
		return resultList;
	}

	@Override
	public CuentaBancaria getCuentaBancaria(Long clienteId) {
		return entityManager.find(CuentaBancaria.class, clienteId);
	}

	@Override
	public Long save(CuentaBancaria cuentaBancaria) {
		entityManager.getTransaction().begin();
		entityManager.persist(cuentaBancaria);
		entityManager.getTransaction().commit();
		entityManager.merge(cuentaBancaria);
		return cuentaBancaria.getId();
	}
}

package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Usuario;

@Transactional
@Repository
public class UsuarioRepositoryImpl implements IUsuarioRepository {

	private EntityManager entityManager;


	public Usuario ConsultarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Usuario> myQuery = this.entityManager.createQuery("SELECT u FROM Usuario u WHERE u.nombre=: nombre",
				Usuario.class);
		myQuery.setParameter("nombre", nombre);
		return myQuery.getSingleResult();
	}

}

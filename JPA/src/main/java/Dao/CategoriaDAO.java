package Dao;

import Dominio.Categoria;

import javax.persistence.EntityManager;
import java.io.Serializable;

public class CategoriaDAO implements Serializable {

    private static final Long serialVersionUID = 1l;

    private EntityManager em;

    public CategoriaDAO(EntityManager em) {
        this.em = em;
    }

    public void addCategoria(Categoria categoria){
        this.em.persist(categoria);
    }

    public Categoria buscaPorNome(String nome) {
        String myQuery = "SELECT c FROM Categoria c WHERE c.nome = :nome";
        return em.createQuery(myQuery, Categoria.class)
                .setParameter("nome", nome)
                .getSingleResult();
    }

    public void remover(Long id) {
        em.getTransaction().begin();
        Categoria categoria = em.find(Categoria.class, id);
        em.remove(categoria);
    }
}

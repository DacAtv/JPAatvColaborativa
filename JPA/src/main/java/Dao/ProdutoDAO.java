package Dao;

import Dominio.Produto;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import java.io.Serializable;
import java.util.List;

public class ProdutoDAO implements Serializable {

    private static final Long serialVersionUID = 1l;

    private EntityManager em;

    public ProdutoDAO(EntityManager em) {
        this.em = em;
    }

    public void addProduto(Produto produto){
        this.em.persist(produto);
    }

    public Produto buscaPorNome(String nome) {
        String myQuery = "SELECT p FROM Produto p WHERE p.nome = :nome";
        return em.createQuery(myQuery, Produto.class)
                .setParameter("nome", nome)
                .getSingleResult();
    }

    public List<Produto> listarProduto() {
        TypedQuery<Produto> query = em.createQuery("FROM Produto", Produto.class);
        return query.getResultList();
    }

    public void remover(Long id) {
        em.getTransaction().begin();
        Produto produto = em.find(Produto.class, id);
        em.remove(produto);
    }
}

package Dominio;

import java.util.Date;
import java.util.List;

public class Categoria {
    private int id;
    private String nome;
    private Date dataCriacao;
    private List<Produto> produtos;

    public Categoria(int id, String nome, Date dataCriacao, List<Produto> produtos) {
        this.id = id;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.produtos = produtos;
    }
    
}

package Dominio;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "categoria", length = 1, discriminatorType = DiscriminatorType.STRING)
public class Categoria {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String nome;
    private Date dataCriacao;
    private List<Produto> produtos;

    public Categoria() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Categoria(int id, String nome, Date dataCriacao, List<Produto> produtos) {
        this.id = Long.valueOf(id);
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.produtos = produtos;
    }
    
}

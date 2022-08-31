package Dominio;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "produto", length = 1, discriminatorType = DiscriminatorType.STRING)
public class Produto {
        @Id
        @Column(name = "id", nullable = false)
        private Long id;
        private String nome;
        private String descricao;
        private Date dataDeValidade;
        private List<Categoria> categorias;

        public Produto() {
        }

        public Produto(int id, String nome, String descricao, Date dataDeValidade, List<Dominio.Categoria> categorias) {
                this.id = Long.valueOf(id);
                this.nome = nome;
                this.descricao = descricao;
                this.dataDeValidade = dataDeValidade;
                this.categorias = categorias;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getDescricao() {
                return descricao;
        }

        public void setDescricao(String descricao) {
                this.descricao = descricao;
        }

        public Date getDataDeValidade() {
                return dataDeValidade;
        }

        public void setDataDeValidade(Date dataDeValidade) {
                this.dataDeValidade = dataDeValidade;
        }

        public List<Dominio.Categoria> getCategorias() {
                return categorias;
        }

        public void setCategorias(List<Dominio.Categoria> categorias) {
                this.categorias = categorias;
        }
}

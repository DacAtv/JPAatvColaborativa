package Dominio;

import java.util.Date;
import java.util.List;

public class Produto {
        private int id;
        private String nome;
        private String descricao;
        private Date dataDeValidade;
        private List<Categoria> categorias;

        public Produto(int id, String nome, String descricao, Date dataDeValidade, List<Dominio.Categoria> categorias) {
                this.id = id;
                this.nome = nome;
                this.descricao = descricao;
                this.dataDeValidade = dataDeValidade;
                this.categorias = categorias;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
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

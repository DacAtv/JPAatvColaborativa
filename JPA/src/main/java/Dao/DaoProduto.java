package Dao;

import Dominio.Produto;
import Interfaces.Produtos;

import java.io.IOException;
import java.util.List;

public class DaoProduto implements Produtos {

    public boolean addProduto(Produto produto) throws IOException, ClassNotFoundException {
        return false;
    }

    public Produto busca(String cpf) throws IOException, ClassNotFoundException {
        return null;
    }

    public List<Produto> listarProduto() throws IOException, ClassNotFoundException {
        return null;
    }
}

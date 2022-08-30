package Interfaces;

import Dominio.Produto;

import java.io.IOException;
import java.util.List;

public interface Produtos {

    public boolean addProduto(Produto produto) throws IOException, ClassNotFoundException;
    public Produto busca(String cpf)throws IOException, ClassNotFoundException;
    public List<Produto> listarProduto()throws IOException, ClassNotFoundException;
}

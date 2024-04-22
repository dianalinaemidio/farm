package br.com.dianalinaemidio;

import java.util.ArrayList;
import java.util.List;

public class Celeiro {

    private int capacidade = 20;
    private List<Produto> produtos = new ArrayList<>();

    public Celeiro(){
        produtos.add(new Batata());
        produtos.add(new Cenoura());
        produtos.add(new Morango());
    }

    public void armazenar(Produto produto) {
        if (getEspacoDisponivel() < 2) {
            throw new RuntimeException("celeiro cheio");
        }
        produtos.add(produto);
        produtos.add(produto);
    }

   
    public void consumir(Produto produto){
        if (!produtos.contains(produto)){
            throw new RuntimeException("Produto não encontrado");
        }
        produtos.remove(produto);
    }

    public int getEspacoDisponivel(){
        return capacidade - produtos.size();
    }

    public double getOcupacao(){
        return (double) produtos.size() / capacidade;
    }

    public boolean celeiroCheio(){
        return produtos.size() == capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public boolean tem(Produto produto) {
        return produtos.contains(produto);
    }

    public int getQtdeBatatas(){
        int qtde = 0;
        for (Produto produto : produtos){
            if (produto instanceof Batata){
                qtde++;
            }
        }
        return qtde;
    }

    public int getQtdeCenouras(){
        int qtde = 0;
        for (Produto produto : produtos){
            if (produto instanceof Cenoura){
                qtde++;
            }
        }
        return qtde;
    }

    public int getQtdeMorangos(){
        int qtde = 0;
        for (Produto produto : produtos){
            if (produto instanceof Morango){
                qtde++;
            }
        }
        return qtde;
    }


    

}

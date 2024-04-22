package br.com.dianalinaemidio;

public class Batata extends Produto {

    @Override
    public String getImagem() {
        return "images/batata" + tamanho + ".png";
    }
    
}

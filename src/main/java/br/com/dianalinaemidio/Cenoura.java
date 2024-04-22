package br.com.dianalinaemidio;

public class Cenoura extends Produto {

    @Override
    public String getImagem() {
        return "images/cenoura" + tamanho + ".png";
    }

}

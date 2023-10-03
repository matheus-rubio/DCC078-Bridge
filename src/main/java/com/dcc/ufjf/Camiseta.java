package com.dcc.ufjf;

class Camiseta extends Produto {
    public Camiseta(float precoBase, QualidadeProduto qualidade) {
        super(precoBase, qualidade);
    }

    public float calcularPreco() {
        float adicional = precoBase * qualidade.calcularValorAdicional();
        return precoBase + adicional;
    }
}

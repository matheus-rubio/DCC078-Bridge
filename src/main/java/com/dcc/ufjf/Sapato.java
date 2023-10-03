package com.dcc.ufjf;

class Sapato extends Produto {
    public Sapato(float precoBase, QualidadeProduto qualidade) {
        super(precoBase, qualidade);
    }

    public float calcularPreco() {
        float adicional = precoBase * qualidade.calcularValorAdicional();
        return precoBase + adicional;
    }
}

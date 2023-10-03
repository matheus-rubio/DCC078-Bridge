package com.dcc.ufjf;

abstract class Produto {
    protected float precoBase;
    protected QualidadeProduto qualidade;

    public Produto(float precoBase, QualidadeProduto qualidade) {
        this.precoBase = precoBase;
        this.qualidade = qualidade;
    }

    public abstract float calcularPreco();
}

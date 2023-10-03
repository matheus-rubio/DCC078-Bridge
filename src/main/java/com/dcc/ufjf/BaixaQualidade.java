package com.dcc.ufjf;

class BaixaQualidade implements QualidadeProduto {
    public float calcularValorAdicional() {
        return 0.1f; // Adicional de 10% para baixa qualidade
    }
}

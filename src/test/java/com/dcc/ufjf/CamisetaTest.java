package com.dcc.ufjf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CamisetaTest {

    @Test
    public void testCamisetaBaixaQualidade() {
        QualidadeProduto baixaQualidade = new BaixaQualidade();
        Camiseta camiseta = new Camiseta(20.0f, baixaQualidade);
        assertEquals(22.0f, camiseta.calcularPreco(), 0.01f);
    }

    @Test
    public void testCamisetaMediaQualidade() {
        QualidadeProduto mediaQualidade = new MediaQualidade();
        Camiseta camiseta = new Camiseta(20.0f, mediaQualidade);
        assertEquals(24.0f, camiseta.calcularPreco(), 0.01f);
    }

    @Test
    public void testCamisetaAltaQualidade() {
        QualidadeProduto altaQualidade = new AltaQualidade();
        Camiseta camiseta = new Camiseta(20.0f, altaQualidade);
        assertEquals(26.0f, camiseta.calcularPreco(), 0.01f);
    }
}

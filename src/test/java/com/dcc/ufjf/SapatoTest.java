package com.dcc.ufjf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SapatoTest {

    @Test
    public void testSapatoBaixaQualidade() {
        QualidadeProduto baixaQualidade = new BaixaQualidade();
        Sapato sapato = new Sapato(50.0f, baixaQualidade);
        assertEquals(55.0f, sapato.calcularPreco(), 0.01f);
    }

    @Test
    public void testSapatoMediaQualidade() {
        QualidadeProduto mediaQualidade = new MediaQualidade();
        Sapato sapato = new Sapato(50.0f, mediaQualidade);
        assertEquals(60.0f, sapato.calcularPreco(), 0.01f);
    }

    @Test
    public void testSapatoAltaQualidade() {
        QualidadeProduto altaQualidade = new AltaQualidade();
        Sapato sapato = new Sapato(50.0f, altaQualidade);
        assertEquals(65.0f, sapato.calcularPreco(), 0.01f);
    }
}

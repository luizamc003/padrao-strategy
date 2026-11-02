package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    @Test
    void deveParcelarSemJurosCompra() {
        Compra compra = new Compra();
        compra.parcelarSemJuros(300.0f, 3.0f);
        assertEquals(100.0f, compra.getValorParcela(), 0.01f);
    }

    @Test
    void deveParcelarJuros5Compra() {
        Compra compra = new Compra();
        compra.parcelarJuros5(300.0f, 3.0f);
        assertEquals(105.0f, compra.getValorParcela(), 0.01f);
    }

    @Test
    void deveParcelarJuros10Compra() {
        Compra compra = new Compra();
        compra.parcelarJuros10(300.0f, 3.0f);
        assertEquals(110.0f, compra.getValorParcela(), 0.01f);
    }

    @Test
    void deveParcelarCompraEmUmaVez() {
        Compra compra = new Compra();
        compra.parcelarSemJuros(300.0f, 1.0f);
        assertEquals(300.0f, compra.getValorParcela(), 0.01f);
    }

    @Test
    void naoDeveParcelarSemJurosEmZeroParcelas() {
        try {
            Compra compra = new Compra();
            compra.parcelarSemJuros(300.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de parcelas inválido", e.getMessage());
        }
    }

    @Test
    void naoDeveParcelarJuros5EmZeroParcelas() {
        try {
            Compra compra = new Compra();
            compra.parcelarJuros5(300.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de parcelas inválido", e.getMessage());
        }
    }

    @Test
    void naoDeveParcelarJuros10EmZeroParcelas() {
        try {
            Compra compra = new Compra();
            compra.parcelarJuros10(300.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de parcelas inválido", e.getMessage());
        }
    }
}
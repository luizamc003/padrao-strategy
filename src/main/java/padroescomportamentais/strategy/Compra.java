package padroescomportamentais.strategy;

public class Compra {

    private float valorParcela;

    public float getValorParcela() {
        return valorParcela;
    }

    public void parcelarSemJuros(float valorCompra, float numeroParcelas) {
        CalculadoraParcela calculadora = new CalculadoraParcela(valorCompra, numeroParcelas);
        this.valorParcela = calculadora.calcular(new ParcelamentoSemJuros());
    }

    public void parcelarJuros5(float valorCompra, float numeroParcelas) {
        CalculadoraParcela calculadora = new CalculadoraParcela(valorCompra, numeroParcelas);
        this.valorParcela = calculadora.calcular(new ParcelamentoJuros5());
    }

    public void parcelarJuros10(float valorCompra, float numeroParcelas) {
        CalculadoraParcela calculadora = new CalculadoraParcela(valorCompra, numeroParcelas);
        this.valorParcela = calculadora.calcular(new ParcelamentoJuros10());
    }
}
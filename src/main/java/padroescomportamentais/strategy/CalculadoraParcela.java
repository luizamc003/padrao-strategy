package padroescomportamentais.strategy;

public class CalculadoraParcela {

    private float valorCompra;
    private float numeroParcelas;

    public CalculadoraParcela(float valorCompra, float numeroParcelas) {
        this.valorCompra = valorCompra;
        this.numeroParcelas = numeroParcelas;
    }

    public float calcular(Parcelamento tipoParcelamento) {
        if (numeroParcelas == 0) {
            throw new IllegalArgumentException("Número de parcelas inválido");
        }
        return tipoParcelamento.calcular(valorCompra, numeroParcelas);
    }
}
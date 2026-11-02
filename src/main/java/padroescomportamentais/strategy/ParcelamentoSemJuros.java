package padroescomportamentais.strategy;

public class ParcelamentoSemJuros implements Parcelamento {

    public float calcular(float valorCompra, float numeroParcelas) {
        return valorCompra / numeroParcelas;
    }
}
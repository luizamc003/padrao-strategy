package padroescomportamentais.strategy;

public class ParcelamentoJuros5 implements Parcelamento {

    public float calcular(float valorCompra, float numeroParcelas) {
        return (valorCompra * 1.05f) / numeroParcelas;
    }
}
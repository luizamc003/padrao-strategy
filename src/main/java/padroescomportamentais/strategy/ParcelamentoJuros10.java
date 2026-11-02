package padroescomportamentais.strategy;

public class ParcelamentoJuros10 implements Parcelamento {

    public float calcular(float valorCompra, float numeroParcelas) {
        return (valorCompra * 1.10f) / numeroParcelas;
    }
}
package br.com.americanas.polotech.model.entity;

public class CaixaCompra {
    private static Double saldoDisponivel;

    public static Double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public static void setSaldoDisponivel(Double saldoDisponivel) {
        CaixaCompra.saldoDisponivel = saldoDisponivel;
    }
}

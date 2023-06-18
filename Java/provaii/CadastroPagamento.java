package com.mycompany.provaii;


public class CadastroPagamento  extends Cliente {
    private double valor;
    private String dataRecebimentoCadPagamento;
    private String codigoCliente;
    private String nomeCliente;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataRecebimentoCadPagamento() {
        return dataRecebimentoCadPagamento;
    }

    public void setDataRecebimentoCadPagamento(String dataRecebimentoCadPagamento) {
        this.dataRecebimentoCadPagamento = dataRecebimentoCadPagamento;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    
    
}

package com.mycompany.provaii;

/**
 *
 * @author Acer
 */

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Scanner;

public class ProvaII {
    
    //Listas
    static ArrayList<CadastroPagamento> listaCadastroPagamento = new ArrayList<CadastroPagamento>();
    static ArrayList<CadastroRecebimento> listaCadastroRecebimento = new ArrayList<CadastroRecebimento>();
    
    public static void main(String[] args) {
        
        String opcao = "";
        while (!opcao.equals("N")) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("1. Cadastro de cliente" +
                               "\n2. Cadastro de fornecedor" +
                               "\n3. Cadastro do pagamento" +
                               "\n4. Cadastro do recebimento" +
                               "\n5. Relatório de pagamentos e recebimentos");
            opcao = entrada.next();
            if (opcao.equals("1")) {
                cadastroCliente();
            } else {
                if (opcao.equals("2")) {
                    cadastroFornecedor();
                } else {
                    if (opcao.equals("3")) {
                        cadastroPagamento();
                    } else {
                        if (opcao.equals("4")) {
                            cadastroRecebimento();
                        } else {
                            if (opcao.equals("5")) {
                                relatorioPagamentoRecebimento();
                            } else {
                                if (opcao.equals("N")) {
                                    break;
                                } else {
                                    System.out.println("Opção inválida!");
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Deseja continuar? [S/N]");
            opcao = entrada.next();
    }
}
    public static void cadastroCliente() {
        Cliente cliente = new Cliente();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Código do cliente: ");
        String codigo = entrada.next();
        cliente.setCodigo(codigo);
        System.out.println("Nome: ");
        String nome = entrada.next();
        cliente.setNome(nome);
        System.out.println("Endereço: ");
        String endereco = entrada.next();
        cliente.setEndereco(endereco);
        System.out.println("Telefone: ");
        String telefone = entrada.next();
        cliente.setTelefone(telefone);
        System.out.println("CPF: ");
        String cpf = entrada.next();
        cliente.setCpf(cpf);
        System.out.println("Serviço pretado: ");
        String servicoPrestado = entrada.next();
        cliente.setServicoPrestado(servicoPrestado);
    }
    
    public static void cadastroFornecedor() {
        Fornecedor fornecedor = new Fornecedor();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Codígo fornecedor: ");
        String codigoFornecedor = entrada.next();
        fornecedor.setCodigoFornecedor(codigoFornecedor);
        System.out.println("Nome do fornecedor: ");
        String nomeFornecedor = entrada.next();
        fornecedor.setNomeFornecedor(nomeFornecedor);
        System.out.println("Endereço do fornecedor: ");
        String enderecoFornecedor = entrada.next();
        fornecedor.setEnderecoFornecedor(enderecoFornecedor);
        System.out.println("Telefone do fornecedor: ");
        String telefoneFornecedor = entrada.next();
        fornecedor.setTelefoneFornecedor(telefoneFornecedor);
        System.out.println("CNPJ: ");
        String cnpj = entrada.next();
        fornecedor.setCnpj(cnpj);
        System.out.println("Serviço prestado: ");
        String servicoPrestado = entrada.next();
        fornecedor.setServFornecidoFornecedor(servicoPrestado);
    }
    
    public static void cadastroPagamento() {
        CadastroPagamento cadastroPagamento = new CadastroPagamento();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Código do cliente: ");
        String codigoCliente = entrada.next();
        cadastroPagamento.setCodigoCliente(codigoCliente);
        System.out.println("Nome do cliente: ");
        String nomeCliente = entrada.next();
        cadastroPagamento.setNomeCliente(nomeCliente);
        System.out.println("Data do recebimento: ");
        String dataRecebimento = entrada.next();
        cadastroPagamento.setDataRecebimentoCadPagamento(dataRecebimento);
        System.out.println("Valor: ");
        double valor = entrada.nextDouble();
        cadastroPagamento.setValor(valor);
        listaCadastroPagamento.add(cadastroPagamento);
    }
    
    public static void cadastroRecebimento() {
        CadastroRecebimento cadastroRecebimento = new CadastroRecebimento();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Código do fornecedor: ");
        String codigoFornecedorr = entrada.next();
        cadastroRecebimento.setCodigoFornecedorr(codigoFornecedorr);
        System.out.println("Nome do fornecedor: ");
        String nomeFornecedor = entrada.next();
        cadastroRecebimento.setNomeFornecedor(nomeFornecedor);
        System.out.println("Data do recebimento: ");
        String dataRecebimentoCadRecebimento = entrada.next();
        cadastroRecebimento.setDataRecebimentoCadRecebimento(dataRecebimentoCadRecebimento);
        System.out.println("Valor: ");
        int valorCadRecebimento = entrada.nextInt();
        cadastroRecebimento.setValorCadRecebimento(valorCadRecebimento);
        listaCadastroRecebimento.add(cadastroRecebimento);
    }
    
    public static void relatorioPagamentoRecebimento() {
        for (CadastroPagamento cadastroPagamento : listaCadastroPagamento) {
            System.out.println("Nome: " + cadastroPagamento.getNomeCliente() +
                               "\nCódigo: " + cadastroPagamento.getCodigoCliente() +
                               "\nData do pagamento: " + cadastroPagamento.getDataRecebimentoCadPagamento() +
                               "\nValor: " + cadastroPagamento.getValor());
        }
        for (CadastroRecebimento cadastroRecebimento : listaCadastroRecebimento) {
            System.out.println("Data do recebimento: " + cadastroRecebimento.getDataRecebimentoCadRecebimento() +
                              "\nValor: " + cadastroRecebimento.getValorCadRecebimento() +
                              "\nCódigo: " + cadastroRecebimento.getCodigoFornecedorr() +
                              "\nNome: " + cadastroRecebimento.getNomeFornecedor());
        }
    }
}
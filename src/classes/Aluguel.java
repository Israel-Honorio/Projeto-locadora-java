/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Aluguel {
    private Funcionario funcionario;
    private Cliente cliente;
    private Carro carro;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private double valor;
    private double comissao;

    public Aluguel(Funcionario funcionario, Cliente cliente, Carro carro, LocalDate dataInicio, LocalDate dataFim) {
        if (dataFim.isBefore(dataInicio)) {
            throw new IllegalArgumentException("Data de fim deve ser após a data de início");
        }
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.carro = carro;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valor = calcularValor();
        this.comissao = calcularComissao();
    }

    // calcula o valor com base no preço do carro e o tempo alugado
    private double calcularValor() {
        long diasAlugados = ChronoUnit.DAYS.between(dataInicio, dataFim) + 1;
        double val = diasAlugados * carro.getPrecoDiario();
        if (cliente.getQuantidadeDeAlugueis()%3==0){
            val *= 0.9;
        }
        return val;
    }

    private double calcularComissao() {
        return valor * 0.1;
    }

    public double getValor() {
        return valor;
    }

    public double getComissao() {
        return comissao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }
    
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Carro getCarro() {
        return carro;
    }
}

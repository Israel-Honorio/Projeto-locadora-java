/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author parac
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Carro implements Ordenacao{
    private String marca;
    private String placa;
    private short ano;
    private String nome;
    private String modelo;
    private String cor;
    private double precoDiario;
    private List<LocalDate> datasDeUso;

    public Carro(String marca, String placa, short ano, String nome, String modelo, String cor, double precoDiario) {
        this.marca = marca;
        this.placa = placa;
        this.ano = ano;
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.precoDiario = precoDiario;
        this.datasDeUso = new ArrayList<>();
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public short getAno() {
        return ano;
    }

    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public double getPrecoDiario() {
        return precoDiario;
    }
    
    // retorna uma lista de datas em que o carro esta sendo utilizado
    public List<LocalDate> getDatasDeUso(){
        return datasDeUso;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPrecoDiario(double precoDiario) {
        this.precoDiario = precoDiario;
    }

    // itera entre a lista de datas e retorna se esta disponpivel entre as datas selecionadas
    public boolean disponivelEntre(LocalDate dataInicio, LocalDate dataFim) {
        for (LocalDate data : datasDeUso) {
            if (!data.isBefore(dataInicio) && !data.isAfter(dataFim)) {
                return false;
            }
        }
        return true;
    }

    // defina as datas selecionadas como utilizadas no período do aluguel
    public void registrarAluguel(LocalDate dataInicio, LocalDate dataFim) {
        LocalDate data = dataInicio;
        while (!data.isAfter(dataFim)) {
            datasDeUso.add(data);
            data = data.plusDays(1);
        }
    }
    
    // retorna a duração do alugel
    public short diasTotaisEmAluguel() {
        return (short) datasDeUso.size();
    }
    
    @Override
    public boolean eMenor(Ordenacao outro){
        return placa.compareTo(((Carro)outro).getPlaca())<0;
    }
}
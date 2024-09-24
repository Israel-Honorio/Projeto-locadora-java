/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author parac
 */

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDate;

//Realiza a leitura e escrita em arquivos
public class GerenciadorDeArquivos {

    //Le double/Cliente/Funcionario/Carro de um BufferedReader
    public double lerDouble(BufferedReader leitor) throws IOException{
        return Double.parseDouble(leitor.readLine());
    }
    public Cliente lerCliente(BufferedReader leitor) throws IOException{
        //TODO
        String nome = leitor.readLine();
        String email = leitor.readLine();
        String cpf = leitor.readLine();
        long telefone = Long.parseLong(leitor.readLine());
        long cep = Long.parseLong(leitor.readLine());
        short qntAlugueis = Short.parseShort(leitor.readLine());
        return new Cliente(qntAlugueis,nome,email,cpf,telefone,cep);
    }
    public Funcionario lerFuncionario(BufferedReader leitor) throws IOException{
        //TODO
        String nome = leitor.readLine();
        String email = leitor.readLine();
        String cpf = leitor.readLine();
        long telefone = Long.parseLong(leitor.readLine());
        long cep = Long.parseLong(leitor.readLine());
        double salario = Double.parseDouble(leitor.readLine());
        double comissao = Double.parseDouble(leitor.readLine());
        String senha = leitor.readLine();
        return new Funcionario(salario,comissao,senha,nome,email,cpf,telefone,cep);
    }
    public Carro lerCarro(BufferedReader leitor) throws IOException{
        String marca = leitor.readLine();
        String placa = leitor.readLine();
        short ano = Short.parseShort(leitor.readLine());
        String nome = leitor.readLine();
        String modelo = leitor.readLine();
        String cor = leitor.readLine();
        double precoDiario = Double.parseDouble(leitor.readLine());
        Carro carro = new Carro(marca,placa,ano,nome,modelo,cor,precoDiario);
        int qDatas = Integer.parseInt(leitor.readLine());
        for(int i = 0; i < qDatas; i++){
            int year = Integer.parseInt(leitor.readLine());
            int month = Integer.parseInt(leitor.readLine());
            int day = Integer.parseInt(leitor.readLine());
            LocalDate data = LocalDate.of(year,month,day);
            carro.registrarAluguel(data, data);
        }
        return carro;
    }
    //Lê uma lista de elementos sequencialmente
    public ArrayList<Cliente> lerListaCliente(BufferedReader leitor) throws IOException{
        //ler coisa
        int q = Integer.parseInt(leitor.readLine());
        ArrayList<Cliente> lista = new ArrayList<>();
        for(int i = 0; i < q; i++){
            lista.add(lerCliente(leitor));
        }
        return lista;
    }
    public ArrayList<Funcionario> lerListaFuncionario(BufferedReader leitor) throws IOException{
        //ler coisa
        int q = Integer.parseInt(leitor.readLine());
        ArrayList<Funcionario> lista = new ArrayList<>();
        for(int i = 0; i < q; i++){
            lista.add(lerFuncionario(leitor));
        }
        return lista;
    }
    public ArrayList<Carro> lerListaCarro(BufferedReader leitor) throws IOException{
        //ler coisa
        int q = Integer.parseInt(leitor.readLine());
        ArrayList<Carro> lista = new ArrayList<>();
        for(int i = 0; i < q; i++){
            lista.add(lerCarro(leitor));
        }
        return lista;
    }
    //Metodos para escrita de elementos
    public void escrever(BufferedWriter escritor, int i) throws IOException{
        escreverLinha(escritor, i);
    }
    public void escrever(BufferedWriter escritor, double d) throws IOException{
        escreverLinha(escritor, d);
    }
    public void escrever(BufferedWriter escritor, Cliente cliente) throws IOException {
        escreverLinha(escritor, cliente.getNome());
        escreverLinha(escritor, cliente.getEmail());
        escreverLinha(escritor, cliente.getCpf());
        escreverLinha(escritor, cliente.getTelefone());
        escreverLinha(escritor, cliente.getCep());
        escreverLinha(escritor, cliente.getQuantidadeDeAlugueis());
    }
    public void escrever(BufferedWriter escritor, Funcionario funcionario) throws IOException{
        escreverLinha(escritor, funcionario.getNome());
        escreverLinha(escritor, funcionario.getEmail());
        escreverLinha(escritor, funcionario.getCpf());
        escreverLinha(escritor, funcionario.getTelefone());
        escreverLinha(escritor, funcionario.getCep());
        escreverLinha(escritor, funcionario.getSalario());
        escreverLinha(escritor, funcionario.getComissao());
        escreverLinha(escritor, funcionario.getSenha());
    }
    public void escrever(BufferedWriter escritor, Carro carro) throws IOException{
        Object[] atributos = {carro.getMarca(), carro.getPlaca(), carro.getAno(),
        carro.getNome(), carro.getModelo(), carro.getCor(), carro.getPrecoDiario()};
        for(var o : atributos){
            escreverLinha(escritor, o);
        }
        var datas = (ArrayList<LocalDate>)carro.getDatasDeUso();
        escreverLinha(escritor, (int)datas.size());
        for(var d : datas){
            escreverLinha(escritor, d.getYear());
            escreverLinha(escritor, d.getMonthValue());
            escreverLinha(escritor, d.getDayOfMonth());
        }
    }
    public void escreverLinha(BufferedWriter escritor, Object objeto) throws IOException{
        escritor.append(String.valueOf(objeto)); escritor.newLine();
    }
}

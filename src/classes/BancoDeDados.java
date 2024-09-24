/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.util.ArrayList;
import java.util.Comparator;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
/**
 *
 * @author parac
 */

//Classe que centraliza e faz a persistência dos dados
public class BancoDeDados {
    private ArrayList<Cliente> clientes;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Carro> carros;
    private GerenciadorDeArquivos gerenciador;
    private Comparator<Cliente> comparadorCliente;
    private Comparator<Funcionario> comparadorFuncionario;
    private Comparator<Carro> comparadorCarro;
    private double caixaEmpresa;
    String arquivoClientes;
    String arquivoFuncionarios;
    String arquivoCarros;
    String arquivoFinanceiro;

    //Inicializa comparadores das classes de acordo com a interface implementada
    private void inicializarComparadores(){
        comparadorCliente = (Cliente a, Cliente b)->(a.eMenor(b) ? -1 : (b.eMenor(a) ? 1 : 0));
        comparadorFuncionario = (Funcionario a, Funcionario b)->(a.eMenor(b) ? -1 : (b.eMenor(a) ? 1 : 0));
        comparadorCarro = (Carro a, Carro b)->(a.eMenor(b) ? -1 : (b.eMenor(a) ? 1 : 0));
    }
    
    public BancoDeDados(){
        //ler informações dos arquivos
        arquivoClientes = "ArquivosBD\\clientes.txt";
        arquivoFuncionarios = "ArquivosBD\\funcionarios.txt";
        arquivoCarros = "ArquivosBD\\carros.txt";
        arquivoFinanceiro = "ArquivosBD\\financeiro.txt";
        gerenciador = new GerenciadorDeArquivos();
        inicializarComparadores();
        inicializarArquivos();
        
        try{
            BufferedReader leitorClientes = new BufferedReader(new FileReader(arquivoClientes)),
                    leitorFuncionarios = new BufferedReader(new FileReader(arquivoFuncionarios)),
                    leitorCarros = new BufferedReader(new FileReader(arquivoCarros)),
                    leitorFinanceiro = new BufferedReader(new FileReader(arquivoFinanceiro));
            clientes = gerenciador.lerListaCliente(leitorClientes);
            funcionarios = gerenciador.lerListaFuncionario(leitorFuncionarios);
            carros = gerenciador.lerListaCarro(leitorCarros);
            caixaEmpresa = gerenciador.lerDouble(leitorFinanceiro);
            leitorClientes.close();
            leitorFuncionarios.close();
            leitorCarros.close();
            leitorFinanceiro.close();
        } catch(IOException e){
            System.out.println(e);
            System.out.println("Erro na inicialização do banco de dados");
        }
        atualizarBancoDeDados(arquivoClientes);
        atualizarBancoDeDados(arquivoFuncionarios);
        atualizarBancoDeDados(arquivoCarros);
        atualizarBancoDeDados(arquivoFinanceiro);
    }

    //Inicializa os arquivos, se não existirem
    private void inicializarArquivos(){
        String[] caminhos = {arquivoClientes,arquivoCarros,arquivoFuncionarios,arquivoFinanceiro};
        for(var s : caminhos){
            File arquivo = new File(s);
            if (!arquivo.exists()){
                try{
                    arquivo.createNewFile();
                    try (BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo))) {
                        gerenciador.escreverLinha(escritor, 0);
                    }
                } catch (IOException e){
                    System.out.println(e);
                    System.out.println("Erro ao inicializar " + arquivo);
                }
            }
            else{
                //System.out.println("Arquivo " + arquivo + "pronto");
            }
        }
    }

    //Reescreve o arquivo passado
    private void atualizarBancoDeDados(String arquivo){
        try{
            File arquivoAntigo = new File(arquivo);
            if (arquivoAntigo.exists())arquivoAntigo.delete();
            File arquivoNovo = new File(arquivo);
            arquivoNovo.createNewFile();
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo))) {
                if (arquivo.equals(arquivoFinanceiro)){
                    gerenciador.escrever(escritor, caixaEmpresa);
                }
                else if (arquivo.equals(arquivoClientes)){
                    gerenciador.escreverLinha(escritor, clientes.size());
                    for(var c : clientes){
                        gerenciador.escrever(escritor, c);
                    }
                }
                else if (arquivo.equals(arquivoFuncionarios)){
                    gerenciador.escreverLinha(escritor, funcionarios.size());
                    for(var f : funcionarios){
                        gerenciador.escrever(escritor, f);
                    }
                }
                else if (arquivo.equals(arquivoCarros)){
                    gerenciador.escreverLinha(escritor, carros.size());
                    for(var c : carros){
                        gerenciador.escrever(escritor, c);
                    }
                }
                else throw new IOException("Arquivo fora dos registros");
            }
        }catch(IOException e){
            System.out.println(e);
            System.out.println("Erro ao atualizar o arquivo " + arquivo);
        }
    }

    //Adiciona Cliente/Funcionario/Carro e mantém a lista ordenada
    public void adicionar(Cliente cliente){
        //adicionar um cliente no banco de dados permanentemente
        //reescrever o arquivo de clientes para adicioná-lo
        clientes.add(cliente);
        clientes.sort(comparadorCliente);
        atualizarBancoDeDados(arquivoClientes);
    }
    public void adicionar(Funcionario funcionario){
        //TODO
        funcionarios.add(funcionario);
        funcionarios.sort(comparadorFuncionario);
        atualizarBancoDeDados(arquivoFuncionarios);
    }
    public void adicionar(Carro carro){
        //TODO
        carros.add(carro);
        carros.sort(comparadorCarro);
        atualizarBancoDeDados(arquivoCarros);
    }

    //Salva edição no banco de dados
    public void editar(Cliente cliente){
        for(var c : clientes){
            if (c.equals(cliente)){
                c = cliente;
            }
        }
        atualizarBancoDeDados(arquivoClientes);
    }
    public void editar(Funcionario funcionario){
        for(var f : funcionarios){
            if (f.equals(funcionario)){
                f = funcionario;
            }
        }
        atualizarBancoDeDados(arquivoFuncionarios);
    }
    public void editar(Carro carro){
        for(var c : carros){
            if (c.equals(carro)){
                c = carro;
            }
        }
        atualizarBancoDeDados(arquivoCarros);
    }
    //Remove elemento do banco
    public void apagar(Cliente cliente){
        clientes.remove(cliente);
        atualizarBancoDeDados(arquivoClientes);
    }
    public void apagar(Funcionario funcionario){
        funcionarios.remove(funcionario);
        atualizarBancoDeDados(arquivoFuncionarios);
    }
    public void apagar(Carro carro){
        carros.remove(carro);
        atualizarBancoDeDados(arquivoCarros);
    }
    public ArrayList<Cliente> getClientes() {
        //retornar lista atual de clientes
        return clientes;
    }
    public ArrayList<Funcionario> getFuncionarios() {
        //retornar lista atual de funcionarios
        return funcionarios;
    }
    public ArrayList<Carro> getCarros() {
        //retornar lista atual de carros
        return carros;
    }
    public Carro getCarro(String placa){
        Carro carro = null;
        for(var c : carros){
            if (c.getPlaca().equals(placa)){
                carro = c; break;
            }
        }
        return carro;
    }
    public Cliente getCliente(String cpf){
        Cliente cliente = null;
        for(var c : clientes){
            if (c.getCpf().equals(cpf)){
                cliente = c; break;
            }
        }
        return cliente;
    }
    public Funcionario getFuncionario(String cpf){
        Funcionario funcionario = null;
        for(var f : funcionarios){
            if (f.getCpf().equals(cpf)){
                funcionario = f; break;
            }
        }
        return funcionario;
    }
    public double getCaixaEmpresa(){
        return caixaEmpresa;
    }

    //Atualiza os membros participantes do aluguel e o caixa
    public void atualizarFinanceiro(Aluguel aluguel){
        //aumenta o caixa da empresa e atualiza a comissão do 
        //funcionário envolvido e a quantidade de alugueis do cliente
        double valor = aluguel.getValor();
        double comissao = aluguel.getComissao();
        valor -= comissao;
        aluguel.getFuncionario().adicionarComissao(comissao);
        aluguel.getCliente().adicionarAluguel((short)1);
        caixaEmpresa += valor;
        Carro carro = aluguel.getCarro();
        carro.registrarAluguel(aluguel.getDataInicio(),aluguel.getDataFim());
        editar(aluguel.getFuncionario());
        editar(aluguel.getCliente());
        editar(carro);
        atualizarBancoDeDados(arquivoFinanceiro);
    }

    //Realiza o pagamento mensal de salários e comissões
    public void realizarPagamento(){
        //atualiza caixa da empresa e zera comissões dos funcionários
        for(var f : funcionarios){
            caixaEmpresa = caixaEmpresa - f.getSalario() - f.getComissao();
            f.zerarComissao();
        }
        atualizarBancoDeDados(arquivoFuncionarios);
        atualizarBancoDeDados(arquivoFinanceiro);
    }
}

package classes;

public class Funcionario extends Pessoa implements Ordenacao {
    private double salario, comissao;
    private String senha;

    public Funcionario(double salario, double comissao, String senha, String nome, String email, String cpf, long telefone, long cep) {
        super(nome, email, cpf, telefone, cep);
        this.salario = salario;
        this.comissao = comissao;
        this.senha = senha;
    }
    
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }
    
    // setter expecífico para adicionar comissões
    public void adicionarComissao(double comissao) {
        this.comissao = comissao;
    }
    
    //utilizado para quando a comissão for paga pelo gerente
    public void zerarComissao(){
        this.comissao = 0;
    }

    @Override
    public boolean eMenor(Ordenacao outro){
        return super.getCpf().compareTo(((Funcionario)outro).getCpf())<0;
    }
}


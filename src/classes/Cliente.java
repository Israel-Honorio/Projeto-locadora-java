package classes;

public class Cliente extends Pessoa implements Ordenacao{
    private short quantidadeDeAlugueis;

    public Cliente(short quantidadeDeAlugueis, String nome, String email, String cpf, long telefone, long cep) {
        super(nome, email, cpf, telefone, cep);
        this.quantidadeDeAlugueis = quantidadeDeAlugueis;
    }

    public short getQuantidadeDeAlugueis() {
        return quantidadeDeAlugueis;
    }

    // utilizado para contabilizar a quantidade de alugueis feita pelo cliente
    public void adicionarAluguel(short quantidadeDeAlugueis) {
        this.quantidadeDeAlugueis += quantidadeDeAlugueis;
    }

    @Override
    public boolean eMenor(Ordenacao outro){
        return super.getCpf().compareTo(((Cliente)outro).getCpf())<0;
    }

    
    
}

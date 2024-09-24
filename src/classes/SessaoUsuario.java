package classes;

//classe sigleton responsável por guardar informações do funcionário logado
public class SessaoUsuario {
    private static SessaoUsuario instancia;
    private Funcionario usuarioLogado;

    private SessaoUsuario() {}

    //Esse método é responsável por retornar a única instância de SessaoUsuario
    public static SessaoUsuario getInstancia() {
        if (instancia == null) {
           instancia = new SessaoUsuario();
        }
           return instancia;
    }

    // retorna o usuário funcionário que esta guardado no atributo usuarioLogado
    public Funcionario getUsuarioLogado() {
        return usuarioLogado;
    }
    
    // modifica o usario logado, selecionando o usuário funcionário que é passado como parâmetro
    public void setUsuarioLogado(Funcionario usuario) {
        this.usuarioLogado = usuario;
    }

    public void logout() {
        usuarioLogado = null;
    }
}

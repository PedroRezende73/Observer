public class Usuario extends UsuarioObserver {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void update(String message) {
        System.out.println("Usuário " + nome + " foi notificado.");
    }
}

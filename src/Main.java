//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Chat GrupoFamilia = new Chat();
        Chat GrupoAmigos = new Chat();

        Usuario user1 = new Usuario("Teste 1");
        Usuario user2 = new Usuario("Teste 2");
        Usuario user3 = new Usuario("Teste 3");

        GrupoFamilia.addUser(user1);
        GrupoFamilia.addUser(user2);

        GrupoAmigos.addUser(user1);
        GrupoAmigos.addUser(user2);
        GrupoAmigos.addUser(user3);

        System.out.println("---CONTATOS---");
        System.out.println(user1.getNome());
        System.out.println(user2.getNome());
        System.out.println(user3.getNome());
        System.out.println("-------------");

        GrupoFamilia.sendMessage("Primeira mensagem");
        GrupoAmigos.sendMessage("Segunda Mensagem");
    }
}
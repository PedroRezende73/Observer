import java.util.ArrayList;

public class Chat {
    private ArrayList<UsuarioObserver> usuarios = new ArrayList<>();

    public void addUser(UsuarioObserver user) {
        usuarios.add(user);
    }

    public void removeUser(UsuarioObserver user) {
        usuarios.remove(user);
    }

    public void sendMessage(String message) {
        for (UsuarioObserver user : usuarios) {
            user.update(message);
        }
    }
}

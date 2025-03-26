package Ej1_Testing_JJDV;

import java.util.ArrayList;
import java.util.List;

public class Ej1_BaseDeDatos{
    private List<String> usuarios;

    public Ej1_BaseDeDatos() {
        this.usuarios = new ArrayList<>();
    }

    public boolean conectar() {
        return true;
    }

    public void agregarUsuario(String usuario) {
        if (conectar()) {
            usuarios.add(usuario);
        }
    }

    public boolean verificarUsuario(String usuario) {
        return usuarios.contains(usuario);
    }
}


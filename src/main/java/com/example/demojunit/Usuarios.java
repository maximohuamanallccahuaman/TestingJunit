package com.example.demojunit;

import java.util.ArrayList;

public class Usuarios {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public boolean crear(Usuario usuario) {
        return usuarios.add(usuario);
    }

    public boolean borrar(Usuario usuario) {
        return usuarios.remove(usuario);
    }

    public ArrayList<Usuario> obtener() {
        return usuarios;
    }
}

class UsuarioCondition {
    static boolean puedeCrearUsuario(Usuario usuario) {
        Usuarios usuarios = new Usuarios();
        return usuarios.crear(usuario);
    }
}
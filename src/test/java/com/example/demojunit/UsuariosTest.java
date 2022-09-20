package com.example.demojunit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UsuariosTest {

    @Test
    void crear() {
        Usuarios usuarios = new Usuarios();
        Usuario usuario = new Usuario();
        usuario.nombre = "pepe";

        assertEquals(true, usuarios.crear(usuario));
    }

    @Nested
    public class Solousuarioscreados {
        @Test
        @Order(1)
        void borrar() {
            Usuarios usuarios = new Usuarios();
            Usuario usuario = new Usuario();
            usuario.nombre = "pepe";
            // usuarios.crear(usuario);
            assertEquals(true, usuarios.borrar(usuario));
        }

        @Test
        @DisplayName("¿Tengo usuarios?")
        @Order(0)
        void listar() {
            Usuarios usuarios = new Usuarios();
            ArrayList<Usuario> listado = usuarios.obtener();
            System.out.println(listado.size());
            assertEquals(listado.size() > 0, listado);
        }
    }


}

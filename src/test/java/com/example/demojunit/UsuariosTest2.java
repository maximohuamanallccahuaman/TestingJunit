package com.example.demojunit;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledIf;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UsuariosTest2 {

    Usuarios usuarios = new Usuarios(); //Instanciación global
    Usuario usuario = new Usuario();

    @Test
    void crear() {
        usuario.nombre = "pepe";
        assertEquals(true, usuarios.crear(usuario));
    }

    @Nested
    @EnabledIf("UsuarioCondition#puedeCrearseUsuario")
    public class Solousuarioscreados {
        @BeforeEach
        void inicializar(){
            usuario.nombre = "pepe";
            usuarios.crear(usuario);
        }

        @Test
        void borrar() {
            assertEquals(true, usuarios.borrar(usuario));
        }

        @Test
        @DisplayName("¿Tengo usuarios?")
        void listar() {
            Usuarios usuarios = new Usuarios();
            ArrayList<Usuario> listado = usuarios.obtener();
            System.out.println("Tengo usuarios" + listado.size());
            assertNotEquals(listado.size() == 0, listado);
        }
    }


}

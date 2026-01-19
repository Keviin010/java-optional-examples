package org.app.optional.examples;

import org.app.optional.examples.models.Computador;
import org.app.optional.examples.repositorios.ComputadorRepo;
import org.app.optional.examples.repositorios.Repositorio;

import java.util.Optional;

public class RepositorioMetodosOrElseThrow {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepo();


        Computador pc = repositorio.filtrar("asusvivobook").orElseThrow(IllegalStateException::new);
        System.out.println(pc);

        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();
        System.out.println(extension);

    }
    }


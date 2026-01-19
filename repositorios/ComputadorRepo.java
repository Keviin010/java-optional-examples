package org.app.optional.examples.repositorios;

import org.app.optional.examples.models.Computador;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepo implements Repositorio<Computador> {

    private List<Computador> dataSource;

    public ComputadorRepo() {
        dataSource = new ArrayList<>();
        dataSource.add(new Computador("AsusVivoBook","X512D"));
        dataSource.add(new Computador("HpVictus","6618924"));
    }

    @Override
    public Optional<Computador> filtrar(String nombre) {
        for (Computador c: dataSource){
            if (c.getNombre().equalsIgnoreCase(nombre)){
                return Optional.of(c);
            }
        }
        return Optional.empty();
    }
}

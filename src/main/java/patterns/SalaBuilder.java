package patterns;

import entities.Sala;

public class SalaBuilder {

    private Sala sala;

    public SalaBuilder(String id, String descripcion, int numeroAsientos){
        this.sala = new Sala(id, descripcion, numeroAsientos);
    }

    public SalaBuilder descripcion(String descripcion){
        sala.setDescripcion(descripcion);
        return this;

    }

    public SalaBuilder numero(int numero){
        sala.setNumeroAsientos(numero);
        return this;

    }
    public Sala build(){
        return sala;
    }


}

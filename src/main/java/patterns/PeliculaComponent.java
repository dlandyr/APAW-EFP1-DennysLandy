package patterns;

public abstract class PeliculaComponent {

    private String genero;

    public PeliculaComponent(String genero){
        this.genero = genero;
    }

    public abstract boolean isComposite();

    public abstract void add(PeliculaComponent peliculaComponent);

    public abstract void remove(PeliculaComponent peliculaComponent);
}

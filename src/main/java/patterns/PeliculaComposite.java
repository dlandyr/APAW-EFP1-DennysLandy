package patterns;

import java.util.ArrayList;
import java.util.List;

public class PeliculaComposite extends PeliculaComponent{

    List<PeliculaComponent> peliculaComponentList;

    public PeliculaComposite(String genero){
        super(genero);
        peliculaComponentList = new ArrayList<>();
    }

    @Override
    public boolean isComposite(){ return true;}

    @Override
    public void add(PeliculaComponent peliculaComponent) {
        peliculaComponentList.add(peliculaComponent);
    }

    @Override
    public void remove(PeliculaComponent peliculaComponent) {
        peliculaComponentList.remove(peliculaComponent);
    }
}

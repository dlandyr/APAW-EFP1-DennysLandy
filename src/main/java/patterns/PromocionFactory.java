package patterns;

import entities.Promocion;
import java.util.HashMap;
import java.util.Map;

public class PromocionFactory {

    private Map<String, Promocion> promociones;

    private static PromocionFactory promocionFactory = new PromocionFactory();

    private PromocionFactory(){
        this.promociones = new HashMap<>();
    }

    public static PromocionFactory getPromocionFactory() {
        return promocionFactory;
    }

    public Promocion getPromocion(String id){
        return promociones.get(id);
    }

    public void setPromocion(Promocion promocion){
        promociones.put(promocion.getId(), promocion);
    }

    public void removePromocion(String id){
        this.promociones.remove(id);
    }
}

package ejercicioPeliculas;

import java.util.Comparator;

public class CompararPeliculas implements Comparator<Peliculas> {
	
    @Override
    public int compare(Peliculas p1, Peliculas p2) {
        return p1.getNombre().compareTo(p2.getNombre());
    }

}

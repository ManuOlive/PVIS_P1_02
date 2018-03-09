
import java.util.ArrayList;

public class PENTAGONO {

    private ArrayList<Punto> puntos;

    public PENTAGONO(Integer dimesion, Integer dimension) {
        makePentagono(0, 0, dimension, 0);
    }

    public PENTAGONO(Integer x, Integer y, Integer dimension) {
        makePentagono(x, y, dimension, 0);
    }

    public PENTAGONO(Integer x, Integer y, Integer dimension, Integer grado) {
        makePentagono(x, y, dimension, grado);
    }

    private void makePentagono(Integer x, Integer y, Integer dimension, Integer grado) {
        int gradoinicia = grado;
        ArrayList<Punto> Punto = new ArrayList<Punto>();
        for (int i = 0; i < 5; i++) {
            Double y = Math.sin(tuRadianes(gradoinicia)) * dimension;
            Double x = Math.cos(tuRadianes(gradoinicia)) * dimension;
            Punto p = new Punto(x.intValue(), y.intValue());
            gradoinicia += 72;
            puntos.add(p);
        }
    }

    public void puntos() {
        ArrayList <Punto> puntos = new ArrayList <Punto>();
        puntos = new ArrayList<Punto>();
        puntos.add(new Punto(1, 1));
        Punto p = new Punto(5, 5);
        puntos.add(p);
        Punto p2 = new Punto(0,0);
        p2.getX();
        p2.setX(0);
    }
    public void tuRadianes(Integer g){
        Integer gradoinicia=g;
    }
    public static void main(String[]args){
        PENTAGONO p = new PENTAGONO(1,2,3,4);
        System.out.println(p.puntos);
    }
}

package arrays.classes;
import java.util.ArrayList;
import java.util.stream.Stream;

interface OperacionesInterface {

    public ArrayList<Integer> getCalificaciones();
    public void setCalificaciones(int calificacion);
    final ArrayList<Integer> calificaciones = new ArrayList<Integer>();
    final ArrayList<Integer> calificacionesFiltradas = new ArrayList<Integer>();
    public ArrayList<Integer> filtrarPorPromedio( double promedio );    

}

public class Operaciones implements OperacionesInterface {

    private ArrayList<Integer> calificaciones, calificacionesFiltradas;
    
    public Operaciones( ArrayList<Integer> calificaciones) {
        System.out.println("Operaciones");
        this.calificaciones = calificaciones;
        this.calificacionesFiltradas = calificacionesFiltradas;
    }

    public double getPromedio(){
        double promedio = this.calificaciones.stream()
                                    .reduce(0, (acumulador, numero) -> acumulador + numero);

        return promedio / this.calificaciones.size();
    }


    public ArrayList<Integer> filtrarPorPromedio( double promedio){
        
        this.calificacionesFiltradas =  this.calificaciones.stream()
                                                            .filter( numero -> numero > promedio )
                                                            .collect( ArrayList::new, ArrayList::add, ArrayList::addAll );

        return this.calificacionesFiltradas;
    }


    public void setCalificaciones( int calificacion ) {

        this.calificaciones.add( calificacion );

    }

    public ArrayList<Integer> getCalificaciones() {
        return this.calificaciones;
    }
}

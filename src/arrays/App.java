package arrays;

import arrays.classes.Operaciones;

import java.util.*;
import java.util.Scanner;
import java.text.MessageFormat;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        int calificacion = 0, opcion = 0;
        boolean flag = true;
        ArrayList<Integer> calificaciones = new ArrayList<Integer>();
        Operaciones operador = new Operaciones( calificaciones );


        try  {
           

            do{

                System.out.println("Ejercicios Practica 1 \n1) Obtener Promedio \n2) Filtrar numeros mayores al promedio \n3) Ver Calificaciones \n4) ingresar Calificaciones \n5) Salir \n");
                opcion = teclado.nextInt();

                switch( opcion ){

                    case 1:
                        System.out.println("El promedio es: " + operador.getPromedio());
                        break;

                    case 2:
                        double promedio = operador.getPromedio();

                        System.out.println("Los numeros mayores al promedio son: " + operador.filtrarPorPromedio( promedio ));
                        break;

                    case 3:
                        System.out.println("Calificaciones: " + operador.getCalificaciones() + "\n");
                        break;

                    case 4:
                        System.out.println("Ingresa la calificacion");
                        calificacion = teclado.nextInt();
                        operador.setCalificaciones( calificacion );

                        break;

                    case 5:
                        System.out.println("Hasta pronto");
                        flag = false;
                        break;

                    default:
                        System.out.println("Opcion no valida");
                        break;
                }


            }while(flag);

        }catch(InputMismatchException e){

            System.out.println("Error, ingresar valortes numericos enteros " +"- "+e);
            
        }catch( Exception err ){
            throw new Error("Error personalizados", err);
        }

    }
}

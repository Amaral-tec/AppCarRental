package br.com.amaral;

import br.com.amaral.domain.*;
import br.com.amaral.factory.Car;
import java.util.ArrayList;
import java.util.List;


public class Lista {
    public static void main(String[] args) {

        List<Car> car = new ArrayList<>();


        car.add(new Convertible());
        car.add(new Luxury());
        car.add(new Standart());
        car.add(new SUV());
        car.add(new Van());

        listarCarros(car);
        listaExtrendsCarro(car);
        imprimirGeneric(car);
    }

    public static void listarCarros(List<Car> carros ){
        System.out.println("Imprimindo uma lista de carros");
        for(Car carro : carros){
            System.out.println(carro.getClass().getSimpleName());
        }
        System.out.println("");
    }

    public static void listaExtrendsCarro(List<? extends Car> carros){
        System.out.println("Imprimindo a lista de classes que extendem carro");
        for(Car carro : carros){
            System.out.println(carro.getClass().getSimpleName());
        }
        System.out.println("");
    }

    public static void imprimirGeneric(List<?> lista){
        System.out.println("Método que funcionará para imprimir lista de <qualquer coisa>");
        for(Object st : lista ){
            System.out.println("Qualquer coisa: " + st);
        }
    }
}
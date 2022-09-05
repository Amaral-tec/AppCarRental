package br.com.amaral.domain;

import br.com.amaral.factory.Car;

import java.util.ArrayList;
import java.util.List;

public class DemoGeneric {
    public static void imprimir(List<?> lista){
        for(Object st : lista ){
            System.out.println(st.getClass().getSimpleName() + " " + st);
        }
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        List<String> listaString = new ArrayList<>();
        listaString.add("STR1");
        listaString.add("STR2");
        listaString.add("STR3");
        listaString.add("STR4");
        listaString.add("STR5");
        imprimir(listaString);

        List<Integer> listaIntero = new ArrayList<>();
        listaIntero.add(1);
        listaIntero.add(2);
        listaIntero.add(3);
        listaIntero.add(4);
        listaIntero.add(5);
        imprimir(listaIntero);

        List<Car> listaCarro = new ArrayList<>();
        listaCarro.add(new Convertible());
        listaCarro.add(new Luxury());
        listaCarro.add(new Standart());
        listaCarro.add(new SUV());
        listaCarro.add(new Van());
        imprimir(listaCarro);
    }
}

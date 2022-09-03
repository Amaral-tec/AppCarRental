package br.com.amaral.factory;

import br.com.amaral.domain.SUV;
import br.com.amaral.domain.Standart;
import br.com.amaral.domain.Van;

public class WithoutContract extends Factory {

    @Override
    Car retrieveCar(String requestedGrade) {
        switch (requestedGrade) {
            case "C":
                return new Standart(88, "full", "white");
            case "D":
                return new SUV(240, "full", "black");
            case "E":
                return new Van(185, "full", "white");
            default:
                System.out.println("The requested car was unfortunately not available.");
                return null;
        }
    }
}

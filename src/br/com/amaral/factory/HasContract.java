package br.com.amaral.factory;

import br.com.amaral.domain.Convertible;
import br.com.amaral.domain.Luxury;


public class HasContract extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        switch (requestedGrade) {
            case "A":
                return new Luxury(429, "full", "blue");
            case "B":
                return new Convertible(563, "full", "gray");
            default:
                System.out.println("The requested car was unfortunately not available.");
                return null;
        }
    }
}

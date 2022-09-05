package br.com.amaral.domain;

import br.com.amaral.factory.Car;

public class Van extends Car {
    public Van(int horsePower, String fuelSource, String color) {
        super(horsePower, fuelSource, color);
    }

    public Van() {

    }
}

package br.com.amaral.dao;

import br.com.amaral.domain.*;

public interface ICarFactory {

    Standart createStandartCar();
    Convertible createConvertibleCar();
    Luxury createLuxuryCar();
    Van createVanCar();
    SUV createSUVCar();
}

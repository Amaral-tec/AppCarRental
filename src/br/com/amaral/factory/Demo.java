package br.com.amaral.factory;

import br.com.amaral.domain.Customer;

public class Demo {

    public static void main(String[] args) {
        Customer custumerOne = new Customer ("A", true);
        Factory factory = getCarFactory(custumerOne);
        Car carOne = factory.create(custumerOne.getGradeRequest());
        carOne.startEngine();
    }

    private static Factory getCarFactory(Customer customer) {
        if(customer.hasCompanyContract()) {
            return new HasContract();
        }else{
            return new WithoutContract();
        }
    }
}

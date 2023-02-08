package sda.patterns.structural.decorator;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Assemble basic car.");
    }
}

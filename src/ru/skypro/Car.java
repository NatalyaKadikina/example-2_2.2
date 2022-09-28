package ru.skypro;

public class Car extends  Trasport{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void transportService() {
        updateTyre();
        checkEngine();
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку машины");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }
}
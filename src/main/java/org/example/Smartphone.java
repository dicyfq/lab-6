package org.example;

interface GPS {
    double[] getCoordinates();
}

interface Cellular {
    void makeCall();
    void receiveCall();
}

public class Smartphone implements GPS, Cellular {
    @Override
    public double[] getCoordinates() {
        // Пример возврата координат (широта и долгота)
        return new double[]{46.4825, 30.7233};
    }

    @Override
    public void makeCall() {
        System.out.println("ВИКОНУЄТЬСЯ ВИКЛИК...");
    }

    @Override
    public void receiveCall() {
        System.out.println("ВХІДНИЙ ДЗВІНОК...");
    }
}
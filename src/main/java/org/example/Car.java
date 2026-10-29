package org.example;

public class Car implements Comparable {

    private int price;
    private int year; // рік виготовлення
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getHorsePower() { return horsePower; }
    public void setHorsePower(int horsePower) { this.horsePower = horsePower; }

    @Override
    public int compareTo(Object o) {
        Car other = (Car) o;

        // Порівнюємо ціну (менша ціна - "більше")
        if (this.price != other.price) {
            return other.price - this.price;
        }

        // Порівнюємо рік (менший за віком/більший рік - "більше")
        if (this.year != other.year) {
            return this.year - other.year;
        }

        // Порівнюємо кінські сили (більше сил - "більше")
        return this.horsePower - other.horsePower;
    }
}
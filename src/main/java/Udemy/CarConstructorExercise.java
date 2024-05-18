package Udemy;

public class CarConstructorExercise {
    private String name;
    private String model;
    private int stock;
    private char isHatchback;

    public CarConstructorExercise() {
        this("Unknown", "Unknown");
    }

    public CarConstructorExercise(String model, int stock) {
        this("Unknown", model, stock,'N');
    }

    public CarConstructorExercise(String name, char isHatchback) {
        this(name, "unknown", 10,isHatchback);
    }

    public CarConstructorExercise(String name, String model) {
        this.name = name;
        this.model = model;
    }

    //full contructor
    public CarConstructorExercise(String name, String model, int stock, char isHatchback) {
        this.name = name;
        this.model = model;
        this.stock = stock;
        this.isHatchback = isHatchback;
    }



    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getStock() {
        return stock;
    }

    public char getIsHatchback() {
        return isHatchback;
    }
}

package Udemy;

public class Main {
    public static void main(String[] args) {
        CarConstructorExercise audi = new CarConstructorExercise("audi", "a8", 30, 'N');

        CarConstructorExercise bmw = new CarConstructorExercise("bmw", "m140", 30, 'Y');

        System.out.println("Car name: " + bmw.getName() + " " +
                "model: " + bmw.getModel() + " " +
                "stock: " + bmw.getStock() + " " +
                "is hatchback: " + bmw.getIsHatchback());

        CarConstructorExercise defaultOne = new CarConstructorExercise();

        System.out.println("Car name: " + defaultOne.getName() + " " +
                "model: " + defaultOne.getModel() + " " +
                "stock: " + defaultOne.getStock() + " " +
                "is hatchback: " + defaultOne.getIsHatchback());
    }
}

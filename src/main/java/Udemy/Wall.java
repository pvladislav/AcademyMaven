package Udemy;

public class Wall {
    private double width;
    private double height;

    public Wall() {}

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width < 0 ? width : 0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double param2) {
        this.height = height < 0 ? height : 0;
    }

    public double getArea() {
        return width * height;
    }


    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}

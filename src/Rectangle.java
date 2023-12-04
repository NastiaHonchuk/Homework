public class Rectangle {

    /*  Task 2
        Создать класс Rectangle (прямоугольник), содержащий переменные длина и ширина, конструктор и методы
        для подсчета площади и периметра прямоугольника. В классе Main создать несколько обьектов класса
        Rectangle и вывести на экран площадь и периметр каждого
     */
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double areaOfTriangle() {

        return length * width;
    }

    public double perimeterOfTriangle() {

        return (length + width) * 2;
    }
    public static class Main {
        public static void main(String[] args) {
            Rectangle rec1 = new Rectangle(5.1, 4);
            Rectangle rec2 = new Rectangle(2.5, 6);
            Rectangle rec3 = new Rectangle(3.5, 9);

            System.out.println("The area of the first triangle is " + rec1.areaOfTriangle() + ", and its perimeter is " + rec1.perimeterOfTriangle());
            System.out.println("The area of the second triangle is " + rec2.areaOfTriangle() + ", and its perimeter is " + rec2.perimeterOfTriangle());
            System.out.println("The area of the third triangle is " + rec3.areaOfTriangle() + ", and its perimeter is " + rec3.perimeterOfTriangle());
        }
    }
}


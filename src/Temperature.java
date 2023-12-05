public class Temperature {
    /*                                         Homework_Lesson 19
     Создать класс Temperature (температура), содержащий метод для перевода градусов по фаренгейту в градусы цельсия
     ( celsius = 5* (fahrenheit - 32)/9). В классе Main создать несколько обьектов класса Temperature (значение
     температуры по фаренгейту должно задаваться через конструктор) и вывести результат перевода на экран
     */

    double fahrenheit;
    double celsius;


    public Temperature (double fahrenheit){
        this.fahrenheit = fahrenheit;
    }

    public double result (){
        return celsius = 5 * (fahrenheit - 32)/9;
    }

    public double result1 (){
        return Math.round(celsius = 5 * (fahrenheit - 32)/9);
    }


    public static class Main1{
        public static void main(String[] args) {

            Temperature temp1 = new Temperature(57);
            Temperature temp2 = new Temperature(100);

            //Without rounding
            System.out.println("The temperature in celsius is " + temp1.result() + "°C");
            System.out.println("The temperature in celsius is " + temp2.result() + "°C");
            System.out.println();

            // Math.round
            System.out.println("The temperature in celsius is " + temp1.result1() + "°C");
            System.out.println("The temperature in celsius is " + temp2.result1() + "°C");
            System.out.println();

            // String.format
            String formatTemp1 = String.format("%.1f", temp1.result());
            String formatTemp2 = String.format("%.1f", temp2.result());

            System.out.println("The temperature in celsius is " + formatTemp1 + "°C");
            System.out.println("The temperature in celsius is " + formatTemp2 + "°C");





        }
    }
}

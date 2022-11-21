import transport.Car;
import transport.Car.Insurance;
import  transport.Car.Key;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int currentYear=2022;
        Human Max = new Human( " Максим " ,"Минск", 1988," бренд-менеджер");
        System.out.println(Max.toString());
        Human Anna= new Human("Аня ","Москва ", 1993," методист образовательных программ");
        System.out.println(Anna.toString());
        Human Katia= new Human("Катя ","Калининград ", 1992," продакт-менеджером");
        System.out.println(Katia.toString());
        Human Artem= new Human("Артем ","Москва ", 1995," директор по развитию бизнеса");
        System.out.println(Artem.toString());
        Human Vladimir=new Human("Владимир","Казань",currentYear -21 ,"");
        System.out.println(Vladimir.toString());

        System.out.println("=========================");


        Car Lada=new Car(" Lada","Granta",2015,"России ","желтого",1.7,"автоматическая"," седан ","x111xe777",2,"летняя", new Key(),new Insurance());
        System.out.println(Lada.toString());

        Car Audi=new Car(" Audi", "A8 50 L TDI quattro",2020,"Германии ","черный",3.0,"механическая","купе","x121xe797",4,"зимняя",new Key(),new Insurance());
        System.out.println(Audi.toString());
        Car BMW=new Car(" BMW","Z8",2021,"Германии","черный ",3.0,"автоматическая","седан","x351xy136",2,"летняя",new Key(),new Insurance());
        System.out.println(BMW.toString());
        Car Kia=new Car(" Kia","Sportage",2018,"Южной Корее","красный",2.4,"механическая","купе","x1545oe199",7,"зимняя",new Key(),new Insurance());
        System.out.println(Kia.toString());
        Car Hyundai=new Car(" Hyundai","Avante",2016,"Южной Корее","оранжевый",1.6,"автоматическая","купе","x777ka131",4,"",new Key(),new Insurance());
        System.out.println(Hyundai.toString());

        System.out.println("=========================");

        Flower one=new Flower(" Роза обыкновенная ", " Голландия","",35.59);
        System.out.println(one.toString());
        Flower two=new Flower("Хризантема", "","",15,5);
        System.out.println(two.toString());
        Flower three=new Flower("Пион", " Англия","",69.9,1);
        System.out.println(three.toString());
        Flower four=new Flower("Гипсофила", " Турция","",19.5,10);
        System.out.println(four.toString());










    }
}
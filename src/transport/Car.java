package transport;

import javax.security.auth.kerberos.KerberosTicket;
import java.time.LocalDate;
import java.util.PrimitiveIterator;

public class Car {
   private String brand;
    private String model;
    private double engineVolume;
   private String color;
   private int year;
   private String country;
   private String transmission;
   private String bodyType;
   private String registrationNumber;
   private int numberOfSeats;
   private String summerOrWinterTires;
   private Key key;

    private Insurance  insurance;

   public static class Key{
       private final boolean remoteEngineStart;
       private final boolean keylessAccess;



       public Key(boolean remoteEngineStart, boolean keylessAccess) {
           this.remoteEngineStart = remoteEngineStart;
           this.keylessAccess = keylessAccess;

       }
       public Key(){
           this(false,false);
       }
       public boolean isRemoteEngineStart() {
           return remoteEngineStart;
       }

       public boolean isKeylessAccess() {
           return keylessAccess;
       }
   }
   public static class Insurance {
       private final LocalDate validityOfInsurance;
       private final double costOfInsurance;
       private final String numberOfInsurance;

       public Insurance(LocalDate validityOfInsurance, double costOfInsurance, String numberOfInsurance) {
           if (validityOfInsurance == null) {
               this.validityOfInsurance = LocalDate.now().plusDays(365);
           } else {
               this.validityOfInsurance = validityOfInsurance;
           }
           this.costOfInsurance = costOfInsurance;
           if (numberOfInsurance == null) {
               this.numberOfInsurance = "123456789";
           } else {

               this.numberOfInsurance = numberOfInsurance;
           }
       }

       public LocalDate getValidityOfInsurance() {
           return validityOfInsurance;
       }

       public double getCostOfInsurance() {
           return costOfInsurance;
       }

       public String getNumberOfInsurance() {
           return numberOfInsurance;
       }
       public void chekValidityOfInsurance(){
           if (validityOfInsurance.isBefore(LocalDate.now())||validityOfInsurance.isEqual(LocalDate.now())){
               System.out.println("нужно срочно ехать оформлять новую страховку");

           }
       }
       public void chekNumber(){
           if (numberOfInsurance.length()!=9){
               System.out.println("номер страховки некорректный");

           }
       }
       public Insurance(){
           this(null,10000,null);
   }


   }




    public Car(String brand, String model, int year, String country,
               String color, double engineVolume, String transmission,
               String bodyType, String registrationNumber, int numberOfSeats,
               String summerOrWinterTires,Key key,Insurance insurance) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (transmission==null||transmission.isBlank()||transmission.isEmpty()){
            this.transmission="default";
        }
        else {
            this.transmission=transmission;
        }
        if (bodyType==null||bodyType.isEmpty()||bodyType.isBlank()){
            this.bodyType="default";
        }
        else {
            this.bodyType=bodyType;
        }
        if (registrationNumber==null||registrationNumber.isEmpty()||registrationNumber.isBlank()){
            this.registrationNumber="проверка правильности написания номера авто (х000хх000)";
        }
        else {
            this.registrationNumber=registrationNumber;
        }
        if (numberOfSeats<2){
            this.numberOfSeats=2;
        }
        else {
            this.numberOfSeats=numberOfSeats;
        }
        if (summerOrWinterTires==null||summerOrWinterTires.isBlank()||summerOrWinterTires.isEmpty()){
            this.summerOrWinterTires="сменить шины на сезонные";
        }
        else{
            this.summerOrWinterTires=summerOrWinterTires;
        }

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = " белый ";
        } else {
            this.color = color;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (key==null){
            this.key=new Key();
        }
        else {
            this.key=key;
        }
        if (insurance==null){
            this.insurance=new Insurance();
        }
        else {
            this.insurance=insurance;
        }


    }



    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = " белый ";
        } else {
            this.color = color;
        }
    }

    public int getYear() {
return year;
    }

    public void setYear(int year) {
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getSummerOrWinterTires() {
        return summerOrWinterTires;
    }

    @Override
    public String toString() {
        return
                "" + brand  +
                        " " + model  +
                        "," + year+
                        " год выпуска, сборка в " + country +" "+
                        color +" цвета "+
                        ", объем двигателя- " + engineVolume +
                        " л.,"+" коробка передач -"+transmission+", "+
                        " тип  кузова - "+ bodyType+", регистрационный номер - "+
                        registrationNumber+", количество мест -  "+ numberOfSeats+
                        ", тип резины - "+summerOrWinterTires+ ", "+(getKey().remoteEngineStart?"обычный":"дистанционный"+" запуск, ")+
                        " "+(getKey().keylessAccess?", ключевой":"безключевой"+"доступ")+", "+
                       " " + (" срок действия страховки"+getInsurance().validityOfInsurance)+(", номер страховки "+getInsurance().numberOfInsurance)+", стоимость страховки "+getInsurance().costOfInsurance;
    }



}

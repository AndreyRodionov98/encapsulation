public class Flower {
    String name;
    String flowerColor;
    String country;
    double cost;
    int lifeSpan;

    public Flower(String name, String country, String flowerColor, double cost, int lifeSpan) {
        this.name = name;
        this.country = country;
        this.cost = cost;
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
        if (flowerColor == null||flowerColor.isEmpty()||flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (country == null || country.isBlank() || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }

    }
    public Flower(String name, String country, String flowerColor, double cost){
        this( name,  country,flowerColor, cost,3);
    }


    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor==null ) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isBlank() || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    @Override
    public String toString() {
        return "" + name  +
                ", страна происхождения - " + country  +
                ", цвет- " + flowerColor +
                ", стоимость - " + cost +" срок стояния - "+ lifeSpan;
    }
}

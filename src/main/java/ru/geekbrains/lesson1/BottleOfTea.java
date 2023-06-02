public class BottleOfTea extends Product {
   private double volume;
   private string color; 

public double getVolume() {
 return volume;   
}
public double setVolume(double volume){
    this.volume=volume;
}
public String getColor(){
return color;
}
public String setColor(string color){
    this.color=color;
}
public BottleOfTea(String brand, String name, double price, double volume, string color){
    super(brand,name,price);
    this.volume=volume;
    this.color=color;
}
@Override
public String displayInfo(){
    return String.format("[Чай] %s-%s-%f [объем: %f] [цвет: %s]", brand, name, price, volume, color);
}
}
package electronics;

import javax.xml.namespace.QName;

public class device {

    String brand;
    int model;
    double price;
    String type;


    public device(String brand,int model,double price,String type){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.type=type;

    }
    public String toString(){
        return brand + " " + model + " " + price + " " +type;
    }
    public void call(){
        System.out.println("You can make long distance call with this " +type);
    }
    public void text(){
        System.out.println("We can do a voice text with this new "+brand);
    }
    public void facetime(){
        System.out.println
                ("It does have the feature to facetime with multiple "+ brand +model+"'s");
    }

}

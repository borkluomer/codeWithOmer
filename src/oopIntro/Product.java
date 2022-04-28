package oopIntro;

public class Product {

    //this below is a constructor
    //either you create something inside or not this constructor always will work and run

    //Attribute
    int id;
    String name;
    double unitPrice;
    String detail;


    public Product(){
        System.out.println("I am working");
    }

    public Product(int id,String name, double unitPrice, String detail){

        this();
        this.id=id;
        this.name=name;
        this.unitPrice=unitPrice;
        this.detail=detail;
    }




}

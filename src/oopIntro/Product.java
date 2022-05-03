package oopIntro;

public class Product {

    //this below is a constructor
    //either you create something inside or not this constructor always will work and run

    //Attribute
    //encapsulation here !!!!!
    private int id;
    private String name;
    private double unitPrice;
    private String detail;
    private double discount;
    private double unitPriceAfterDiscount;

    public Product(){
        System.out.println("I am working");
    }



    public Product(int id,String name, double unitPrice, String detail,
                   double discount,double unitPriceAfterDiscount) {
        super();
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        this.discount = discount;
        this.unitPriceAfterDiscount=unitPriceAfterDiscount;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitPriceAfterDiscount() {
        return this.unitPrice-(this.unitPrice*this.discount/100);
    }

    public void setUnitPriceAfterDiscount(double unitPriceAfterDiscount) {
        this.unitPriceAfterDiscount = unitPriceAfterDiscount;
    }




    }








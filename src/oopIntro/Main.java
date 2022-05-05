package oopIntro;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //creating an example, creating a reference here, instance!!!
        Product product1 = new Product(1,"Lenova V14",15000,
                "16 Gb Ram",10.0,14400);
        //creating a new product here

        //IN PROGRAMMING LANGUAGE THE RULE NUMBER 1!!!!!!!
        //DO NOTTTTT REPEAT YOURSELF........

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Lenovo V15");
        product2.setDetail("16 Gb Ram");
        product2.setDiscount(10);
        product2.setUnitPrice(16000);

        System.out.println(product2.getUnitPriceAfterDiscount());

        Category category5= new Category();
        category5.setId(5);
        category5.setName("Drink");

        Category category4= new Category();
        category4.setId(4);
        category4.setName("Food");

        System.out.println(category5.getName() + "!");
        System.out.println(category4.getName() + "!");

        System.out.println("---------------------------------");


        Product product3 = new Product();

        Product [] products = { product1, product2 };

        for ( Product product: products ) {
            System.out.println( product.getName() );
        }

        System.out.println( products.length );

        Category category = new Category();
        category.getId();
        category.getName();

        Category category2 = new Category();
        category2.getName();
        category2.getId();



        ProductManager productManager=new ProductManager();
        productManager.addToCart(product1);

        productManager.addToCart(product2);








    }
}

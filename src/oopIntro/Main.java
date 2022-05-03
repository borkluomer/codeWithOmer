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

        System.out.println("---------------------------------");


        Product product3 = new Product();



        Product [] products = { product1, product2, product3 };


        for ( Product product: products ) {
            System.out.println( product.getName() );
        }

        System.out.println( products.length );

        Category category = new Category();
        category.id=1;
        category.name="Computer";

        Category category2 = new Category();
        category.id=2;
        category.name="Home/Farm";

        ProductManager productManager=new ProductManager();
        productManager.addToCart(product1);

        productManager.addToCart(product2);

        productManager.addToCart(product3);






    }
}

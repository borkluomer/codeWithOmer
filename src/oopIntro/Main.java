package oopIntro;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //creating an example, creating a reference here, instance!!!
        Product product1 = new Product(1,"Lenova V14",15000,"16 Gb Ram");
        //creating a new product here

        //IN PROGRAMMING LANGUAGE THE RULE NUMBER 1!!!!!!!
        //DO NOTTTTT REPEAT YOURSELF........

        Product product2 = new Product();
        product2.id =2;
        product2.name= "Lenovo V15";
        product2.unitPrice =16000;
        product2.detail="32 GB Ram";

        Product product3 = new Product();
        product3.id =3;
        product3.name= "Hp 5";
        product3.unitPrice =10000;
        product3.detail="8 GB Ram";


        Product [] products = { product1, product2, product3 };


        for ( Product product: products ) {
            System.out.println( product.name );
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

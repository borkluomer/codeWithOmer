package electronics;

public class tv extends device{

    public tv(String brand,int model,double price,String type){
        super(brand, model, price, type);

    }

    public static void main(String[] args) {
        device tv1=new device("Sony",1,5999,"LED");
        System.out.println(tv1);

        device tv2= new device("Samsung",2,3000,"PLASMA");
        System.out.println(tv2);
    }


}

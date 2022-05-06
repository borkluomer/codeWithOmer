package electronics;

public class phone extends device{

    public phone(String brand, int model, double price, String type) {
        super(brand, model, price, type);


    }

    public static void main(String[] args) {

        device phone = new device("IPHONE",13,1499,"cellPhone");

        System.out.println(phone);
        phone.facetime();
        phone.call();
        phone.text();
        phone.toString();
    }


}

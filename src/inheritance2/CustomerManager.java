package inheritance2;

public class CustomerManager {

    public void add(Logger logger){
        //adding a customer adding code here!
        System.out.println("Costumer added");
        DatabaseLogger logger1 = new DatabaseLogger();
        logger.log();
    }
}

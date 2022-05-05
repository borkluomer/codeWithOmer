package inheritance;

public class CustomerManager {

    public void add(Customer customer){

        System.out.println(customer.customerNumber+ " saved.");
    }

    //this is bulk inserting !!!!PAY ATTENTION
    //im going to create a array here
    // when there is array there is always a for so lets create a for each
    public void addMultiple(Customer [] customers){

        for (Customer customer : customers){
            add(customer);
        }
    }




}
// SOLID -- Open Closed Principle !!!!

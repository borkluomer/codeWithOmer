package inheritance;

public class Main {
    public static void main(String[] args) {

        individualCustomer omer = new individualCustomer();
        omer.customerNumber="12345";

        CorporateCustomer total = new CorporateCustomer();
        total.customerNumber="78910";

        unionCustomer union1= new unionCustomer();
        union1.customerNumber="99999";

        CustomerManager customerManager= new CustomerManager();

        Customer [] customers = {omer,total,union1};

        customerManager.addMultiple(customers);



    }
}

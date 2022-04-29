package CustomerManager;

import CustomerManager.CustomerManager;

public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager=new CustomerManager();
        CustomerManager customerManager1=new CustomerManager();

        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();


        customerManager1.Add();
        customerManager1.Update();
        customerManager1.Remove();

        customerManager=customerManager1; //basically we equalized the both of the customers
        //so your first customer and second one on your list is same now!!!
        //so the question is where did the first costumer you created go???
        //WENT TO YOUR GARBAGE COLLECTOR!!!!! because you created a new one by equalizing it! on line 17

        int number11=10;
        int number22 = 20;
        number22=number11;
        number11=30;
        System.out.println(number22); //let's guess what the print-out will be on the terminal side?
        //the answer is 10!!!!
        //always remember the HEAP AND STACK!!!
        //basically your 20 is gone became 10 and we re-assigned it to 30

        int [] numbers1 = new int[]{1,2,3};
        int [] numbers2 = new int[]{4,5,6}; // this went to garbage collector basically
        numbers2=numbers1;
        numbers1[0]=10; // we're asking the index 0 ==10




    }
}

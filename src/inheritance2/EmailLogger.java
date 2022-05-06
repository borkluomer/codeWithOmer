package inheritance2;

public class EmailLogger extends Logger{

    //its like you crush this code with the Override :)
    @Override
    public void log(){
        System.out.println("Email is sent");

    }
}

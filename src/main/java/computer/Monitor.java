package computer;

public class Monitor implements VGA{

    @Override
    public void print(String message){
        System.out.println("===================== Monitor VGA =====================");
        System.out.println(message);
        System.out.println("===================== Monitor VGA =====================");
    }

}
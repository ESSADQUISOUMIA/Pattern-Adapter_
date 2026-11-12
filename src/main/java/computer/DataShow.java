package computer;

public class DataShow implements VGA{

    @Override
    public void print(String message){
        System.out.println("===================== DataShow  VGA =====================");
        System.out.println(message);
        System.out.println("===================== DataShow VGA =====================");
    }

}

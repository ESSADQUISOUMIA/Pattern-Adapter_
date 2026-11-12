import adapter.VgaHdmiAdapter;
import computer.*;

public class Main {
    public static void main(String[] args) {

        PC pc = new PC();

        pc.setVga(new Monitor());
        pc.print("Hello Monitor");

        pc.setVga(new DataShow());
        pc.print("Hello DataShow");

        pc.setVga(new VgaHdmiAdapter(new TV()));
        pc.print("Hello TV");

    }
}
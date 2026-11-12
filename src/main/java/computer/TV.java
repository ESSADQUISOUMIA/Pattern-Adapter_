package computer;

import java.util.Arrays;

public class TV implements HDMI{

    @Override
    public void parse(byte[] message){
        System.out.println("===================== TV HDMI =====================");
        System.out.println(Arrays.toString(message));
        System.out.println("===================== TV HDMI =====================");
    }
}

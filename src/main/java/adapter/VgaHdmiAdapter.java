package adapter;

import computer.HDMI;
import computer.VGA;

public class VgaHdmiAdapter implements VGA{

    private HDMI hdmi;

    public VgaHdmiAdapter(HDMI hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void print(String message){
        byte[] newMessage = message.getBytes();
        System.out.println("=====================  VGA to HDMI =====================");
        hdmi.parse(newMessage);
        System.out.println("=====================  VGA to HDMI =====================");
    }

    public void setHdmi(HDMI hdmi){
        this.hdmi = hdmi;
    }

}

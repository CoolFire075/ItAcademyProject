package PracticeOOP;

import java.util.Arrays;

public class Notebook {
    Hdd[] hddArray;
    Cpu cpu;
    OperatingSystem operatingSystem;
    Ram[] ramArray;
    char[] stickersArray;


    public Notebook(Hdd[] hddArray, Cpu cpu, OperatingSystem operatingSystem, Ram[] ramArray, char[] stickersArray) {
        this.hddArray = hddArray;
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
        this.ramArray = ramArray;
        this.stickersArray = stickersArray;
    }

    public void setStickersArray(char[] stickersArray) {
        this.stickersArray = stickersArray;
    }

    public char[] getStickersArray() {
        return stickersArray;
    }

    public void setHddArray(Hdd[] hddArray) {
        this.hddArray = hddArray;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setRamArray(Ram[] ramArray) {
        this.ramArray = ramArray;
    }

    public Hdd[] getHddArray() {
        return hddArray;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public Ram[] getRamArray() {
        return ramArray;
    }

    @Override
    public String toString() {
        String message = "Notebook:"
                + "\nCpu model: " + getCpu().getModel()
                + "; core amount: " + getCpu().getCoreAmount()
                + "; frequency: " + getCpu().getFrequency()
                + "\nOperating version name: " + getOperatingSystem().getName()
                + "; version: " + getOperatingSystem().getVersion()
                + "\nChars: " + Arrays.toString(stickersArray)
                + ("Hdd: " + Arrays.toString(hddArray));

        return message;
    }
}
package PracticeOOP;

public class Notebook {
    Hdd[] hddArray;
    Cpu cpu;
    OperatingSystem operatingSystem;
    Ram[] ramArray;

    public Notebook(Hdd[] hddArray, Cpu cpu, OperatingSystem operatingSystem, Ram[] ramArray) {
        this.hddArray = hddArray;
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
        this.ramArray = ramArray;
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
}
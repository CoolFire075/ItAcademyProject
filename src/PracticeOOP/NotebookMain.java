package PracticeOOP;

import java.util.Arrays;

public class NotebookMain {
    public static void main(String[] args) {

        char[] stickersArray = new char[]{'а', 'б', 'в', 'г', 'д', 'е'};
        Hdd hdd = new Hdd(13, 124);
        Hdd hdd2 = new Hdd(15, 136);
        Hdd hdd3 = new Hdd(17, 248);
        Hdd[] hddArray = new Hdd[]{hdd, hdd2, hdd3};
        Cpu cpu = new Cpu("MackBook", 8, 2.44);
        OperatingSystem operatingSystem = new OperatingSystem("M3Pro", 2023);
        Ram ram = new Ram(18, "SDD");
        Ram ram2 = new Ram(22, "HDD");
        Ram[] ramArray = new Ram[]{ram, ram2};
        Notebook notebook = new Notebook(hddArray, cpu, operatingSystem, ramArray, stickersArray);

        Cpu cpu2 = new Cpu("i9", 9, 20.5);
        notebook.setCpu(cpu2);
        OperatingSystem operatingSystem2 = new OperatingSystem("Ubuntu", 16.04);
        notebook.setOperatingSystem(operatingSystem2);
        System.out.println(notebook);
    }
}
package PracticeOOP;

public class NotebookMain {
    public static void main(String[] args) {


        Hdd hdd = new Hdd(13, 124);
        Hdd hdd2 = new Hdd(15, 136);
        Hdd hdd3 = new Hdd(17, 248);
        Hdd[] hddArray = new Hdd[]{hdd, hdd2, hdd3};
        Cpu cpu = new Cpu("MackBook", 8, 2.44);
        OperatingSystem operatingSystem = new OperatingSystem("M3Pro", 2023);
        Ram ram = new Ram(18, "SDD");
        Ram ram2 = new Ram(22, "HDD");
        Ram[] ramArray = new Ram[]{ram, ram2};
        Notebook notebook = new Notebook(hddArray, cpu, operatingSystem, ramArray);

        Cpu cpu2 = new Cpu("i9", 9, 20.5);
        notebook.setCpu(cpu2);
        OperatingSystem operatingSystem2 = new OperatingSystem("Ubuntu", 16.04);
        notebook.setOperatingSystem(operatingSystem2);
        printNotebook(notebook);
    }


    public static void printNotebook(Notebook notebook) {
        System.out.println("Notebook:"
                + "\nCpu model: " + notebook.getCpu().getModel()
                + "; core amount: " + notebook.getCpu().getCoreAmount()
                + "; frequency: " + notebook.getCpu().getFrequency()
                + "\nOperating version name: " + notebook.getOperatingSystem().getName()
                + "; version: " + notebook.getOperatingSystem().getVersion());

        for (int i = 0; i < notebook.getHddArray().length; i++) {
            System.out.println("Hdd [" + i + "] size = " + notebook.getHddArray()[i].getSize()
                    + "\nHdd [" + i + "] speed = " + notebook.getHddArray()[i].getSpeed());
        }
        for (int j = 0; j < notebook.getRamArray().length; j++) {
            System.out.println("Ram [" + j + "] model = " + notebook.getRamArray()[j].getModel()
                    + "\nRam [" + j + "] size = " + notebook.getRamArray()[j].getSize());
        }
    }
}


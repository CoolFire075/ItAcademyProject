package PracticeOOP;

public class OperatingSystem {
    String name;
    double version;

    public OperatingSystem(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public double getVersion() {
        return version;
    }
}

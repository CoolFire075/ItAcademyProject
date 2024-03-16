package PracticeOOP;

public class Cpu {
    String model;
    int coreAmount;
    double frequency;

    public Cpu(String model, int coreAmount, double frequency) {
        this.model = model;
        this.coreAmount = coreAmount;
        this.frequency = frequency;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCoreAmount(int coreAmount) {
        this.coreAmount = coreAmount;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public String getModel() {
        return model;
    }

    public int getCoreAmount() {
        return coreAmount;
    }

    public double getFrequency() {
        return frequency;
    }

//    @Override
//    public String toString() {
//
//    }
}

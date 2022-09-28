package ru.skypro;

public abstract class Trasport {
    private String modelName;
    private int wheelsCount;

    public Trasport(String modelName,int wheelsCount){
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public abstract void updateTyre();
    public abstract void transportService();

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}

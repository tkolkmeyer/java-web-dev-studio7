package org.launchcode.studio7;

public abstract class BaseDisc {

    private String name;
    private int spinRate;
    private int capacity;
    private String contents;
    private String discType;

    public BaseDisc(String name, int spinRate, int capacity, String contents, String discType) {
        this.name = name;
        this.spinRate = spinRate;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
    }


    @Override
    public String toString() {
        return "BaseDisc{" +
                "name='" + name + '\'' +
                ", spinRate=" + spinRate +
                ", capacity=" + capacity +
                ", contents='" + contents + '\'' +
                ", discType='" + discType + '\'' +
                '}';
    }
}




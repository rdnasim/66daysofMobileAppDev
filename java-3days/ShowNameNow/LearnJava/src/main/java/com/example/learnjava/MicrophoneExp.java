package com.example.learnjava;

public class MicrophoneExp {
    String name;
    String color;
    int model;

    public MicrophoneExp(){

    }

    public MicrophoneExp(String name, String color, int model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void turnOff(){
        System.out.println(this.name + " Turn Off.");
    }
    public void turnOn(){
        System.out.println(this.name + " Turn On.");
    }
    public void setVolume(){
        System.out.println(this.name + " Setting volume.");
    }

    public String showDescription(){
        return "Microphone name: " + this.name + ", model: " + this.model + ", color: "
            + this.color;
    }
}

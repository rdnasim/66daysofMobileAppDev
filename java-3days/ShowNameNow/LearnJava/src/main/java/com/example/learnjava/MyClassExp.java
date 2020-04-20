package com.example.learnjava;

public class MyClassExp {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 6, 8};
        System.out.println(myArray[1]);

        String[] names = {"Riadul", "Islam", "nasim", "Riadul Islam", "Islam Nasim"};
        for (int i = 0; i < names.length; i++){
            System.out.println("Name: " + names[i]);
        }

        System.out.println(names[1]);


        /*int a = 12;
        String myString = "Hello there";
        boolean isEmpty = myString.isEmpty();

        if (!isEmpty){
            System.out.println(myString);
        }else {
            System.out.println("Empty");
        }

         */


        /* EmployeeExp employeeExp = new EmployeeExp();
        employeeExp.setFirstName("Riadul Islam");
        employeeExp.setLastName("Nasim");
        employeeExp.setAge(26);
        employeeExp.setId(2030);

        System.out.println(employeeExp.getFirstName()+ " " + employeeExp.getLastName() +
                ", and his age " + employeeExp.getAge() + ", Employee ID " + employeeExp.getId());
         */



        /* PersonExp nasim = new PersonExp("Riadul Islam", "Nasim", 23);
        System.out.println(nasim.getAge());

        MicrophoneExp microphoneExp = new MicrophoneExp("Agenda", "Black", 11772);
        microphoneExp.name = "Agenda";
        microphoneExp.color = "Black";
        microphoneExp.model = 11772;

        microphoneExp.setModel(77112);
        microphoneExp.setColor("Deep Black");
        microphoneExp.setName("New Agenda");

        System.out.println("New Mic: " + microphoneExp.getModel());

        MicrophoneExp gHMic = new MicrophoneExp("gHMic", "Red", 73294);
        gHMic.name = "gHMic";
        gHMic.color = "Red";
        gHMic.model = 73294;

        System.out.println("Name: " + microphoneExp.name + ", " + "Color: " + microphoneExp.color);

        microphoneExp.turnOn();
        microphoneExp.turnOff();
        microphoneExp.setVolume();

        System.out.println(microphoneExp.showDescription());

        MicrophoneExp newMic = new MicrophoneExp("NewMic", "Green", 721);
        MicrophoneExp otherMic = new MicrophoneExp();

        otherMic.setColor("Other Mic White");

        System.out.println(otherMic.getColor());
        */
    }

}


package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Nazim";
	int age = 21;
	int temperature = 30;
	if (age > 20 && age < 45) {
	    if (temperature > 30 || temperature < -20) {
            System.out.println( name+ " может идти гулять");
        }else {
            System.out.println( name+ " лучше остатся дома");
        }
    }else {
        System.out.println( name+ " Лучше остатся дома");
    }
	String secondName = "Taalaibekov";
	int age2 = 21;
	int temperature2 = 20;
	if (age2 < 20 && temperature2 > 0 && temperature2 < 28) {
        System.out.println(secondName + " Можно идти гулять");
    }else  {
        System.out.println(secondName + " лучше оставайся дома");
    }
	String thirdName ="Taalaibekovich";
        int age3 = 46;
        int temperature3 = -15;
        if (age3 > 45 && temperature3 < -10 && temperature3 < 25) {
            System.out.println(thirdName + " остатся дома");
        }else {
            System.out.println(thirdName + "работает");
        }
    }
}

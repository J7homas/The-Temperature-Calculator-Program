package JavaPractice;

import java.util.Scanner;

class question7{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter your desired temperature : ");
        double temp = scanner.nextDouble();

        System.out.println(" Enter 'F' for Fahrenheit and 'C' for Celsius : ");
        char symbole = scanner.next().charAt(0);

        double numf = temp*9/5+32;

        double numc = (temp - 32)*9/5;

        if(symbole == 'F' || symbole == 'f'){
            System.out.println(symbole + " " + temp + " = " + numf + " Its hot. ");
        } else if(symbole == 'C' || symbole == 'c'){
            System.out.println(symbole + " " + temp + " = " + numc + " Its cold. ");
        } else {
            System.out.println("Invalid Input!");
        }
        
        scanner.close();
    }
}
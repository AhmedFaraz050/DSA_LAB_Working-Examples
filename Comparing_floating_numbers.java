/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danis
 */

    import java.util.Scanner;
public class Comparing_floating_numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st floating number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter 2nd floating number: ");
        float num2 = sc.nextFloat();
        if (Math.round(num1*1000)==Math.round(num2*1000)){
            System.out.println("The numbers are equal up to three decimal places");
        }else{
            System.out.println("The numbers are not equal up to three decimal places");
        }
    }
}


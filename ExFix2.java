/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exfix.pkg2;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ExFix2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        double bruto = 0;
        double tax = 0;
        double porcentageValue = 0;
        Scanner din = new Scanner(System.in);
        
        
        System.out.println("Insert name: ");
        name = din.nextLine();
        System.out.println("Inser grass: ");
        bruto = din.nextDouble();
        
        System.out.println("Inser tax: ");
        tax = din.nextDouble();
        
        double liquido = bruto - tax;
        
        System.out.println(name + ", " + liquido);
        System.out.println("Tax: " + tax);
        
        System.out.print("Inser the porcentage: ");
        porcentageValue = din.nextDouble();
        
        double porcentage = porcentageValue / 100;
        double resultPorcentage = liquido * porcentage;
        double liquidoDescontado = liquido - resultPorcentage;
        
        System.out.println(name + " com $ " + liquidoDescontado + " de renda líquida");
        
        
        din.close();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_melvinrivas;

import java.util.Scanner;

/**
 *
 * @author l3306
 */
public class Lab6P1_MelvinRivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int retorno =0;
        
        while (retorno==0){
        int menu = menuprincipal();
        switch (menu) {
            case 1: {
                
                
                
                System.out.print("Deseas volver al menu 0.Si o 1.No: ");
                retorno = input.nextInt();
                break;
            }
            case 2: {
                
                System.out.print("Ingrese Un tamaño mayor o igual que 5: ");
                int  tamaño  = input.nextInt();
                
                
                System.out.print("Deseas volver al menu 0.Si o 1.No: ");
                retorno = input.nextInt();
                break;
            }
            case 3: {
                
                Tablero();
                
                
                System.out.print("Deseas volver al menu 0.Si o 1.No: ");
                retorno = input.nextInt();
                break;
            }
            case 4: {
                System.out.println("Bye bye");
                retorno = 1;
                break;
            }
            
            default: {
                System.out.println("Su respuesta es invalida");
                break;
            }
        }
        
        } 
    }
    
    public static int menuprincipal  () {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("1. Rotacion de conjuntos");
        System.out.println("2. Trabajo honesto :) ");
        System.out.println("3. Plantas vs Zombies");
        System.out.println("4. Salir ");
        System.out.print("Que deseas realizar: ");
        int  menu= input.nextInt();
        
        return menu;
        
    }
    public static void Tablero () {
        
        char posicion1 [] = new char [20];
        char posicion2 [] = new char [20];
        char posicion3 [] = new char [20];
        posicion1 [19] = 'Z';
        posicion2 [19] = 'Z';
        posicion3 [19] = 'Z';
        
        for (int i = 0; i < 20; i++) {
            System.out.print("["+posicion1[i]+"]");
        }
        System.out.println("");
        for (int i = 0; i < 20; i++) {    
            System.out.print("["+posicion2[i]+"]");
            }
        System.out.println("");
        for (int i = 0; i < 20; i++) {
      
            System.out.print("["+posicion3[i]+"]");
            
        }
        System.out.println("");
        
    }
    
}

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
        
        Scanner input = new Scanner(System.in);
        
        char posicion1 [] = new char [20];
        char posicion2 [] = new char [20];
        char posicion3 [] = new char [20];
        posicion1 [19] = 'Z';
        posicion2 [19] = 'Z';
        posicion3 [19] = 'Z';
        int girasoles= 25;
        
        while  (posicion1[0]!='Z' && posicion2[0]!='Z' && posicion3[0]!='Z' ){
        
            System.out.println("Sus girasoles son: "+girasoles);
            System.out.print("A: ");
            for (int i = 0; i < 20; i++) {
                System.out.print("["+posicion1[i]+"]");
            }
            System.out.println("");
            System.out.print("B: ");
            for (int i = 0; i < 20; i++) {    
                System.out.print("["+posicion2[i]+"]");
            }
            System.out.println("");
            System.out.print("C: ");
            for (int i = 0; i < 20; i++) {
      
                System.out.print("["+posicion3[i]+"]");    
            }
            System.out.println("");
            
            System.out.println("1. Agregar planta");
            System.out.println("2. No hacer nada");
            int  turnoj = input.nextInt();
            
            switch (turnoj) {
                case 1: {
                    System.out.println("Donde desea poner la planta (Ejemplo: 1:0) ");
                    String planta = input.nextLine();
                    planta=input.nextLine();
                    int columna = planta.charAt(0);
                    if (columna==49) {
                        columna=columna-48;
                    }else if (columna==50){
                        columna=columna-48;
                    }else if (columna==51){
                        columna=columna-48;
                    }else {
                    System.out.println("Los numeros ingresados no son validos");
                    }
                    
                    System.out.println(columna);
                    //1:10
                    
                    String fila = planta.substring(2);
                    int fila2 = Integer.parseInt(fila);
                    System.out.println(fila2);
                    if(girasoles>=50){
                    switch (columna) {
                        case 1: {
                            posicion1[fila2]='P';
                            break;
                        }
                        case 2: {
                            posicion2[fila2]='P';
                            
                            break;
                        }
                        case 3: {
                            posicion3[fila2]= 'P';
          
                            break;
                        }
                    }
                    girasoles= girasoles - 50;
                    }else{
                        System.out.println("No tiene girasoles suficientes");
                    }
                }
                case 2: {
                    System.out.println("Decidistes no hacer nada");
                    break;
                }
                case 3: {
                    
                    break;
                }
                default: {
                    
                    break;
                }
            }
            girasoles = girasoles +25;
            
        }
            
        }
        
    }



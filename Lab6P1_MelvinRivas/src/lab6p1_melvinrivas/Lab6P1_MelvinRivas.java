/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_melvinrivas;

import java.util.Random;
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
                
                System.out.print("Ingrese generacion del numero ");
                int medida = input.nextInt();

                if (5 > medida) {
                    System.out.println("No puede ser menor que 5 >:( ");
                } else {
                    piramidemalhecha(medida);
                    
                System.out.print("Deseas volver al menu 0.Si o 1.No: ");
                retorno = input.nextInt();
                   
                }
    
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
        Random random = new Random();
        
        //inicio todo los 3 arrays 
        //los zombies y el contador para la plantas (girasoles)
        char posicion1 [] = new char [20];
        char posicion2 [] = new char [20];
        char posicion3 [] = new char [20];
        char ultimo1 = posicion1 [19] = 'Z';
        char ultimo2 = posicion2 [19] = 'Z';
        char ultimo3 = posicion3 [19] = 'Z';
        int girasoles= 25;
        
        while  (posicion1[0]!='Z' && posicion2[0]!='Z' && posicion3[0]!='Z' ){
            
            //aca hago el dibujo de los carriles de los zombies 
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
            //salto de linea para que no salga pegado
            
            //menu de acciones para el jugador 
            System.out.println("1. Agregar planta");
            System.out.println("2. No hacer nada");
            int  turnoj = input.nextInt();
            
            //switch para determinar que quiere hacer el jugador
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
                        //uso tabla ascii para decidir en que carril va a poner la planta
                    }else {
                    System.out.println("Los numeros ingresados no son validos");
                    }//por si puno un valor que no sea 1,2,3
                    
                    String fila = planta.substring(2);
                    int fila2 = Integer.parseInt(fila);
                    System.out.println(fila2);
                    //usamos integer.parseInt para combertir la cadena a numeros y poder
                    //entrar al swtich
                    if(girasoles>=50){
                    //validamos que tenga suficiente dinero (girasoles)
                    //para poder plantar
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
                        }//planta el girasol
                    }
                    girasoles= girasoles - 50;//se le resta por la compra
                    }else{
                        System.out.println("No tiene girasoles suficientes");
                    }//por si no le alcanza le tire validacion
                }
                case 2: {
                    System.out.println("Decidistes no hacer nada");
                    break;
                }
                default: {
                    System.out.println("Numero invalido");
                    break;//por si puso un numero que no era
                }
            }
            //ccon el random decimos cual de los 3 zombies se va a mover 
            int dado= random.nextInt(3);
            System.out.println(dado);
            switch (dado) {
                case 0: {
                   
                    for (int i = 0; i < posicion1.length; i++) {
                       ultimo1 = posicion1[i];
                       if(ultimo1 == 90){
                           posicion1[i-1]='Z';
                       } 
                    }
                    break;
                }
                case 1: {
                    
                    for (int i = 0; i < posicion3.length; i++) {
                       ultimo1 = posicion3[i];
                       if(ultimo1 == 90){
                           posicion3[i-1]='Z';
                       }
                    }
                    
                    break;
                }
                case 2: {
                    
                     for (int i = 0; i < posicion3.length; i++) {
                       ultimo1 = posicion3[i];
                       if(ultimo1 == 90){
                           posicion3[i-1]='Z';
                       }
                    }
                    
                    break;
                }
            }
            girasoles = girasoles +25;
            // al finalizar todo le damos 25 girasoles mas al jugador
        }
            if (posicion1[0]=='Z' || posicion2[0]=='Z' || posicion3[0]=='Z'){
                System.out.println("Los zombies te comieron el cerebro");
                System.out.println("Game over");
            }else{
                System.out.println("Has ganado enhorabuena");
            }
    }
    
    
    public static void piramidemalhecha(int medida) {
     for (int i = 0; i < medida; i++) {
            int[] fila = Fila(i);
            String filaString = fila2 (fila);
            //nos imprime la fila 
            System.out.println(filaString);
        }
    }

    // esto lo que hace es calcular para la piramide
    public static int[] Fila(int fila) {
        int[] resultado1 = new int[fila + 1];
        resultado1[0] = 1;

        
        for (int i = 1; i < fila; i++) {
           resultado1[i] = resultado1[i - 1] * (fila - i + 1) / i;
        }
        //con esto calculamos la fila 
        resultado1[fila] = 1;

        return resultado1;
    }

    // con esto hago el traigulo de asteriscos pero ahora con numeros
    public static String fila2(int[] fila) {
        String resultado2 = "";

        for (int i : fila) {
            resultado2 += i + " ";
        }

        return resultado2;
    }
    
        
    }



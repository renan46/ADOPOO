///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package aula8;
//
//import java.util.Scanner;
//
///**
// *
// * @author Renan
// */
//
//public class Menu{
//            Scanner entrada = new Scanner(System.in);
//            Scanner entrada1 = new Scanner(System.in);
//            Scanner entrada2 = new Scanner(System.in);
//            Scanner entrada3 = new Scanner(System.in);
//            Scanner entrada4 = new Scanner(System.in);
//            Animal oA = new Animal("cachorro", "pluto", 6);
//            Animal oA1 = new Animal("Elefante", "dumbo", 2);
//            Animal oA2 = new Animal("gato", "tom", 5);
//            Animal oA3 = new Animal("cachorro", "bidu", 1);
//            Animal oA4 = new Animal("rato", "jerry", 4);
//            Animal oA5 = new Animal("ave", "donald", 5);
//            Loja oL = new Loja(4);
//            Animal loja[] = new Animal[7];
//            
//            
//            
//            
//    public void mostrarMenu(){
//            loja[0]=oA;
//            loja[1]=oA1;
//            loja[2]=oA2;
//            loja[3]=oA3;
//            loja[4]=oA4;
//            loja[5]=oA5;
//             
//            System.out.println("Digite A operação que deseja fazer");
//            System.out.println("1 - Inserir Animal");
//            System.out.println("2 - Mostrar animal pelo nome");
//            System.out.println("3 - Alterar animal");
//            System.out.println("4 - Excluir animal");
//            int enter = entrada.nextInt();
//            
//            switch(enter){
//                case 1:
//                    inserirAnimal();
//            }
//            
//    }
//    
//    public void inserirAnimal(){
//                    loja[0]=oA;
//                    loja[1]=oA1;
//                    loja[2]=oA2;
//                    loja[3]=oA3;
//                    loja[4]=oA4;
//                    loja[5]=oA5;
//                    oL.mostrarLoja();
//                    System.out.println("Digite a raça do animal");
//                    String b = entrada2.nextLine();
//                    System.out.println("Digite o nome do animal");
//                    String c = entrada3.nextLine();
//                    System.out.println("Digite a idade do animal");
//                    int d = entrada4.nextInt();
//                    
//                    Animal oA6 = new Animal(b, c, d);
//                    loja[3] = oA6;
//                    oL.inserirAnimal(3, oA6);
//                    oL.mostrarLoja();
//    }
//    
//    public void mostrarAnimalPeloNome(){
//        
//    }
//    public void alterarAnimalPeloNome(){
//        
//    }
//    
//    public void excluirAnimal(){
//        
//    }
//}

package aula8;

import java.util.Scanner;

public class Main {
        
	public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            Scanner entrada1 = new Scanner(System.in);
            Scanner entrada2 = new Scanner(System.in);
            Scanner entrada3 = new Scanner(System.in);
            Scanner entrada4 = new Scanner(System.in);
		// TODO Auto-generated method stub
            Animal oA = new Animal("cachorro", "pluto", 6);
            Animal oA1 = new Animal("Elefante", "dumbo", 2);
            Animal oA2 = new Animal("gato", "tom", 5);
            Animal oA3 = new Animal("cachorro", "bidu", 1);
            Animal oA4 = new Animal("rato", "jerry", 4);
            Animal oA5 = new Animal("ave", "donald", 5);

            Animal loja[] = new Animal[7];
            loja[0]=oA;
            loja[1]=oA1;
            loja[2]=oA2;
            loja[3]=oA3;
            loja[4]=oA4;
            loja[5]=oA5;

            /*for(int i=0; i<loja.length; i++) {
                    loja[i].mostrarAnimal();
                    }*/



            Loja oL = new Loja(4);
            oL.inserirAnimal(0, oA);
            oL.inserirAnimal(1, oA1);
            oL.inserirAnimal(2, oA2);


            //String b = "teste";
            //String c ="novo";
            //int d = 3;
            //Animal oA6 = new Animal(b, c, d);
            //                    loja[3] = oA6;
            //                    oL.inserirAnimal(3, oA6);
            //oL.alterarAnimal(0, oA5);
            //oL.mostrarLoja();
            //oL.excluirAnimal(2);
            //oL.mostrarLoja();
            //oL.buscarAnimal("dumbo");
            
            
            //------------------------------------------------------
//            Menu menu = new Menu();
//            menu.mostrarMenu();
            
            
            System.out.println("Digite A operação que deseja fazer");
            System.out.println("1 - Inserir Animal");
            System.out.println("2 - Mostrar animal pelo nome");
            System.out.println("3 - Alterar animal");
            System.out.println("4 - Excluir animal");
            
            int enter = entrada.nextInt();
            
            switch(enter){                
                case 1:
                    System.out.println("Digite a raça do animal");
                    String b = entrada2.nextLine();
                    System.out.println("Digite o nome do animal");
                    String c = entrada3.nextLine();
                    System.out.println("Digite a idade do animal");
                    int d = entrada4.nextInt();
                    
                    Animal oA6 = new Animal(b, c, d);
                    loja[3] = oA6;
                    oL.inserirAnimal(3, oA6);
                    oL.mostrarLoja();
                    break;
                case 2:
                    System.out.println("Digite o nome do animal que deseja ver? ");
                    String nome = entrada1.nextLine();
                    oL.buscarAnimal(nome);
                    break;
                case 3:
                    System.out.println("Digite os dados do animal que deseja trocar ");
                    System.out.println("Digite a raça do animal");
                    String e = entrada2.nextLine();
                    System.out.println("Digite o nome do animal");
                    String f = entrada3.nextLine();
                    System.out.println("Digite a idade do animal");
                    int g = entrada4.nextInt();
                    Animal oA7 = new Animal(e, f, g);
                    loja[3] = oA7;
                    //oL.inserirAnimal(3, oA7);
                    oL.mostrarLoja();
                    System.out.println("Agora digite o nome do animal que deseja substituir");
                    String h = entrada2.nextLine();
                    
                    
                    switch(h){
                        case "pluto":
                            oL.alterarAnimal(0, oA7);
                            oL.mostrarLoja();
                            System.out.println("Animal alterado com sucesso");
                            break;
                        case "dumbo":
                            oL.alterarAnimal(1, oA7);
                            oL.mostrarLoja();
                            System.out.println("Animal alterado com sucesso");
                            break;
                        case "tom":
                            oL.alterarAnimal(2, oA7);
                            oL.mostrarLoja();
                            System.out.println("Animal alterado com sucesso");
                            break;
                            default:
                            System.out.println("Animal não existe");
                            
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome do animal que deseja excluir");
                    oL.mostrarLoja();
                    String i = entrada2.nextLine();
                    switch(i){
                        case "pluto":
                            oL.excluirAnimal(0);
                            System.out.println("Animal excluido com sucesso");
                            oL.mostrarLoja();
                            break;
                        case "dumbo":
                            oL.excluirAnimal(1);
                            System.out.println("Animal excluido com sucesso");
                            oL.mostrarLoja();
                            break;   
                        case "tom":
                            oL.excluirAnimal(2);
                            System.out.println("Animal excluido com sucesso");
                            oL.mostrarLoja();
                            break;
                        default:
                            System.out.println("posição invalida");
                    }       
            }                          
	}

                                     
	}

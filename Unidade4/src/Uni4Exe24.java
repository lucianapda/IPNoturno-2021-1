import java.util.Scanner;

import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

public class Uni4Exe24 {
    public static void main(String[] args) {
        /*Uni4Exe24.java - Dados 3 valores, escreva um algoritmo que os informe em uma 
        determinada ordem a partir de um menu de opções:

        se opção = 1, escreva os 3 valores em ordem crescente
        se opção = 2, escreva os 3 valores em ordem decrescente
        se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio 
        */

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor 1: ");
        int valor1 = teclado.nextInt();
        System.out.print("Digite o valor 2: ");
        int valor2 = teclado.nextInt();
        System.out.print("Digite o valor 3: ");
        int valor3 = teclado.nextInt();

        System.out.print("Informe a opção desejada: \n1 (decrescente), 2 (crescente), 3 (maior no meio): ");
        int opcao = teclado.nextInt();


        switch (opcao) {
            case 1:
                if (valor1 > valor2 && valor1 > valor3) {
                    System.out.println(valor1);

                    if (valor2 > valor3) {
                        System.out.println(valor2);
                        System.out.println(valor3);
                    } else {
                        System.out.println(valor3);
                        System.out.println(valor2);
                    }

                } else {
                    if (valor2 > valor1 && valor2 > valor3) {
                        System.out.println(valor2);

                        if (valor1 > valor3)  {
                            System.out.println(valor1);
                            System.out.println(valor3);
                        } else {
                            System.out.println(valor3);
                            System.out.println(valor1);
                        }

                    } else {
                        System.out.println(valor3);

                        if (valor1 > valor2) {
                            System.out.println(valor1);
                            System.out.println(valor2);
                        } else {
                            System.out.println(valor2);
                            System.out.println(valor1);
                        }
                    }
                }
                break; //utilizado para sair do bloco switch
            case 2:
                //Crescente:
                //Menor:
                if (valor1 < valor2 && valor1 < valor3) {
                    System.out.println(valor1);
                } else {
                    if (valor2 < valor1 && valor2 < valor3) {
                        System.out.println(valor2);
                    } else {
                        System.out.println(valor3);
                    }
                }

                //Meio:
                if ((valor1 > valor2 && valor1 < valor3) || (valor1 > valor3 && valor1 < valor2)) { //5 4 6 | 5 6 4
                    System.out.println(valor1);
                } else {
                    if ((valor2 > valor1 && valor2 < valor3) || (valor2 > valor3 && valor2 < valor1)) {
                        System.out.println(valor2);
                    } else {
                        System.out.println(valor3);
                    }
                }

                //Maior:
                if (valor1 > valor2 && valor1 > valor3) {
                    System.out.println(valor1);
                } else {
                    if (valor2 > valor1 && valor2 > valor3) {
                        System.out.println(valor2);
                    } else {
                        System.out.println(valor3);
                    }
                }
                break; //utilizado para sair do bloco switch
            case 3:
                //Meio maior
                if (valor1 > valor2 && valor1 > valor3) {
                    System.out.println(valor2);
                    System.out.println(valor1);
                    System.out.println(valor3);
                } else {
                    if (valor2 > valor1 && valor2 > valor3) {
                        System.out.println(valor1);
                        System.out.println(valor2);
                        System.out.println(valor3);
                    } else {
                        System.out.println(valor1);
                        System.out.println(valor3);
                        System.out.println(valor2);
                    }
                }
                break; //utilizado para sair do bloco switch

            default:
                System.out.println("Opção inválida");
        }


      /*  if (opcao == 1) {
            //Decrescente:
            //Identificar o maior valor
            //Quando identifiquei o maior valor, eliminei o valor maior e comparei os outros dois
            if (valor1 > valor2 && valor1 > valor3) {
                System.out.println(valor1);

                if (valor2 > valor3) {
                    System.out.println(valor2);
                    System.out.println(valor3);
                } else {
                    System.out.println(valor3);
                    System.out.println(valor2);
                }

            } else {
                if (valor2 > valor1 && valor2 > valor3) {
                    System.out.println(valor2);

                    if (valor1 > valor3)  {
                        System.out.println(valor1);
                        System.out.println(valor3);
                    } else {
                        System.out.println(valor3);
                        System.out.println(valor1);
                    }

                } else {
                    System.out.println(valor3);

                    if (valor1 > valor2) {
                        System.out.println(valor1);
                        System.out.println(valor2);
                    } else {
                        System.out.println(valor2);
                        System.out.println(valor1);
                    }
                }
            }


        } else {
            if (opcao == 2) {
                //Crescente:
                //Menor:
                if (valor1 < valor2 && valor1 < valor3) {
                    System.out.println(valor1);
                } else {
                    if (valor2 < valor1 && valor2 < valor3) {
                        System.out.println(valor2);
                    } else {
                        System.out.println(valor3);
                    }
                }

                //Meio:
                if ((valor1 > valor2 && valor1 < valor3) || (valor1 > valor3 && valor1 < valor2)) { //5 4 6 | 5 6 4
                    System.out.println(valor1);
                } else {
                    if ((valor2 > valor1 && valor2 < valor3) || (valor2 > valor3 && valor2 < valor1)) {
                        System.out.println(valor2);
                    } else {
                        System.out.println(valor3);
                    }
                }

                //Maior:
                if (valor1 > valor2 && valor1 > valor3) {
                    System.out.println(valor1);
                } else {
                    if (valor2 > valor1 && valor2 > valor3) {
                        System.out.println(valor2);
                    } else {
                        System.out.println(valor3);
                    }
                }
            } else {
                //Meio maior
                if (valor1 > valor2 && valor1 > valor3) {
                    System.out.println(valor2);
                    System.out.println(valor1);
                    System.out.println(valor3);
                } else {
                    if (valor2 > valor1 && valor2 > valor3) {
                        System.out.println(valor1);
                        System.out.println(valor2);
                        System.out.println(valor3);
                    } else {
                        System.out.println(valor1);
                        System.out.println(valor3);
                        System.out.println(valor2);
                    }
                }
            }
        }
        */


        teclado.close();
    }
}

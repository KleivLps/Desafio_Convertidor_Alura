package org.alura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConseguirValor consulta = new ConseguirValor();

        int opcion = 0;
        while (opcion != 12) {


            System.out.println(

                            "--------------------------------------------------------------" + "\n" +
                            "| ****************** CONVERSOR DE MONEDAS ****************** |" + "\n" +
                            "| ---------------------------------------------------------- |" + "\n" +
                            "| 1.-  Dólar => Soles                                        |" + "\n" +
                            "| 2.-  Soles => Dólar                                        |" + "\n" +
                            "| 3.-  Dólar => Bolivares                                    |" + "\n" +
                            "| 4.-  Bolivares => Dólar                                    |" + "\n" +
                            "| 5.-  Dólar => Pesos Mexicanos                              |" + "\n" +
                            "| 6.-  Pesos Mexicanos => Dólar                              |" + "\n" +
                            "| 7.-  Dólar => Pesos Argentinos                             |" + "\n" +
                            "| 8.-  Pesos Argentinos => Dólar                             |" + "\n" +
                            "| 9.-  Dólar => Pesos Chilenos                               |" + "\n" +
                            "| 10.- Pesos Chilenos => Dólar                               |" + "\n" +
                            "| 11.- Convertir otra moneda                                 |" + "\n" +
                            "| 12.- Salir                                                 |" + "\n" +
                            "--------------------------------------------------------------" + "\n\n" +
                            "Elija una opcion válida: ");

            opcion=lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    TranformarDivisas.convertir("USD","PEN", consulta, lectura);
                    break;
                case 2:
                    TranformarDivisas.convertir("PEN","USD", consulta, lectura);
                    break;
                case 3:
                    TranformarDivisas.convertir("USD","VED",consulta,lectura);
                    break;
                case 4:
                    TranformarDivisas.convertir("VED","USD",consulta,lectura);
                    break;
                case 5:
                    TranformarDivisas.convertir("USD","MXN",consulta,lectura);
                    break;
                case 6:
                    TranformarDivisas.convertir("MXN","USD",consulta,lectura);
                    break;
                case 7:
                    TranformarDivisas.convertir("USD","ARS",consulta,lectura);
                    break;
                case 8:
                    TranformarDivisas.convertir("ARS","USD",consulta,lectura);
                    break;
                case 9:
                    TranformarDivisas.convertir("USD","CLP",consulta,lectura);
                    break;
                case 10:
                    TranformarDivisas.convertir("CLP","USD",consulta,lectura);
                    break;
                case 11:
                    TranformarDivisas.convertirOtraMoneda(consulta,lectura);
                    break;
                case 12:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta, por favor elija una opcion valida");
                    break;
            }
        }while (opcion !=12);
    }
}
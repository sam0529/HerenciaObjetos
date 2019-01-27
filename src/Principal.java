
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author masuel
 */
public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double lado = 0;
        int nn, nm;
        boolean llave = true;

        do {
            if (lado == 0) {
                System.out.print("Medida de un lado: ");
                lado = leer.nextDouble();
            }

            System.out.print("\n----- CUADRADO -----\n"
                    + "1.Calcular area\n"
                    + "2.Calcular perimetro\n"
                    + "----- CUBO -----\n"
                    + "3.Calcular volumen\n"
                    + "4.Calcular perimetro\n"
                    + "----- OTROS -----\n"
                    + "5.Cancelar\n"
                    + "6.Salir"
                    + "\n"
                    + "Ingrese el calculo a realizar: ");
            nn = leer.nextInt();
            Cuadrado c = new Cuadrado(lado);
            Cubo b = new Cubo(lado);
            if (nn == 1) {
                System.out.println("\nEl Area del cuadrado es: " + c.calcularArea());
                System.out.print("1.Regresar al menu\n"
                        + "2.Salir\n"
                        + "Ingrese el calculo a realizar: ");
                nm = leer.nextInt();
                if (nm == 1) {
                    lado = lado;
                }
                if (nm == 2) {
                    lado = 0;
                }
            }
            if (nn == 2) {
                System.out.println("\nEl perimetro del cuadrado es: " + c.calcularPerimetro());
                System.out.print("1.Regresar al menu\n"
                        + "2.Salir\n"
                        + "Ingrese el calculo a realizar: ");
                nm = leer.nextInt();
                System.out.println(nn + " asd");
                if (nm == 1) {
                    lado = lado;
                }
                if (nm == 2) {
                    lado = 0;
                }
            }
            if (nn == 3) {
                System.out.println("\nEl volumen del cubo es: " + b.calcularVolumen());
                System.out.print("1.Regresar al menu\n"
                        + "2.Salir\n"
                        + "Ingrese el calculo a realizar: ");
                nm = leer.nextInt();
                if (nm == 1) {
                    lado = lado;
                }
                if (nm == 2) {
                    lado = 0;
                }
            }
            if (nn == 4) {
                System.out.println("\nEl perimetro del cubo es: " + b.calcularPerimetro());
                System.out.print("1.Regresar al menu\n"
                        + "2.Salir\n"
                        + "Ingrese el calculo a realizar: ");
                nm = leer.nextInt();
                if (nm == 1) {
                    lado = lado;
                }
                if (nm == 2) {
                    lado = 0;
                }
            }
            if (nn == 5) {
                lado = 0;
            }
            if (nn == 6) {
                llave = false;
            }

        } while (llave);
        System.out.println("Adios!");
    }
}

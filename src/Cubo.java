
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author masuel
 */
public class Cubo extends Cuadrado {

    public double lado;

    public Cubo(double lado) {
        super(lado);
        this.lado = lado;
    }

    public double calcularVolumen() {
        return Math.pow(this.lado, 3);
    }

    public double calcularPerimetro() {
        return this.lado * 12;
    }
}

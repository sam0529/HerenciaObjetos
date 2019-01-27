
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author masuel
 */
public class Cuadrado {

    public double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return this.lado * this.lado;
    }

    public double calcularPerimetro() {
        return this.lado * 4;
    }
}

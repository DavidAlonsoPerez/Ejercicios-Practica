/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author David
 */
public class Cuadrado extends Shape2 {
    public Cuadrado(double size) {
        super(size);
        }
    public double area() {
        double size = getSize() ;
        return size*size;
    }
}

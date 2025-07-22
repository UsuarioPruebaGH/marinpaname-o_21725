/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marinpaname.o_21725;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Grados Celsius a Farhenheit: "+celsius_a_farhenheit()+" F");
        System.out.println("Grados Celsius a Kelvin: "+celsius_a_kevin()+" k");
        System.out.println("Grados Celsius a Rankine: "+celsius_a_rankine()+" R");
        System.out.println("Grados Farhenheit a Celsius: "+farhenheit_a_celsius()+" C");
    }
    
    public static double celsius_a_farhenheit(){
        double grados_celsius = 50.0;
        return ((grados_celsius * 9)/5) + 32;
    }
    
    public static double celsius_a_kevin(){
        double grados_centigrados = 50.0;
        return grados_centigrados + 273.15;
    }
    
    public static double celsius_a_rankine(){
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9)/5) + 491.67;
    }
    public static double farhenheit_a_celsius(){ 
        double grados_centigrados = 30.0;
        return (((grados_centigrados - 32) *5)+/9) + 273.15;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meotdoposicionfalsa;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class MeotdoPosicionFalsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iteracion = 0;
        
        System.out.println("Ingrese el punto A de desde donde desea evaluar la raiz: ");
        double A = sc.nextDouble();
        
        System.out.println("Ingrese el punto B hasta donde desea evaluar la raiz: ");
        double B = sc.nextDouble();
        
        System.out.println("Ingrese el numero de iteraciones: ");
        double It = sc.nextInt();
        
        System.out.println("------FUNCION--------");
        System.out.println("Ingrese el valor del primer termino ");
        double a = sc.nextDouble();
        System.out.println("Ingrese el valor de su exponente (si no tiene ingrese 1)");
        double ae = sc.nextDouble();
        System.out.println("Ingrese el valor del segundo termino (si no tiene ingrese 0)");
        double b = sc.nextDouble();
        System.out.println("Ingrese el valor de su exponente (si no tiene ingrese 1)");
        double be = sc.nextDouble();
        System.out.println("Ingrese el valor del tercer termino (si no tiene ingrese 0)");
        double c = sc.nextDouble();
        System.out.println("Ingrese el valor de su exponente (si no tiene ingrese 1)");
        double ce = sc.nextDouble();
        System.out.println("Ingrese el valor del termino independiente (si no tiene ingrese 0)");
        double d = sc.nextDouble();
        
        double fA = 0, fB = 0, C = 0, fC = 0, Error = 9999;
        double XmAnterior = 0;
        
        
        while(iteracion <= It){
            
            XmAnterior = C;
            
            fA = a * (Math.pow(A, ae)) + b * (Math.pow(A, be)) + c * (Math.pow(A, ce)) + d;
            fB = a * (Math.pow(B, ae)) + b * (Math.pow(B, be)) + c * (Math.pow(B, ce)) + d;
            
            C = ((A*fB)-(B*fA))/(fB-fA);
            
            fC = a * (Math.pow(C, ae)) + b * (Math.pow(C, be)) + c * (Math.pow(C, ce)) + d;;
            
            Error = Math.abs((C - XmAnterior)/C);
            
            System.out.println("Iteracion: " + iteracion +
                    "\t\tA: " + A + "\t\tfA: " + fA + "\t\tB: " + B + "\t\tfB: " + fB + "\t\tC: " + C + "\t\tfC: " + fC + "\t\tError: " + Error);
            
            if(fA * fC >= 0){
                A = C;
                fA = fC;
            }else if(fA * fC < 0){
                B = C;
                fB = fC;
            }
            iteracion++;
        }
    }
    
}

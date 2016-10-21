/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg16;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Problema16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //IMPRESION DEL NUMERO MAS GRANDE DE TRES NUMEROS INGRESADOS POR EL USUARIO
        double numero1, numero2, numero3;
        numero1 = solicitarNumero("primer numero:");
        numero2 = solicitarNumero("segundo numero:");
        numero3 = solicitarNumero("tercer numero:");
        mostrarRespuesta(numero1, numero2, numero3);
    }
    
    //ESCANEO DE LOS TRES NUMEROS INGRESADOS POR EL USUARIO
    public static double solicitarNumero(String dato){
        double numero;
        System.out.println("Ingresa el " + dato);
        Scanner entradaNumero = new Scanner(System.in);
        numero = entradaNumero.nextDouble();
        return numero;
    }
    
    /*CALCULO E IMPRESION DEL NUMERO MAYOR DE
    LOS TRES NUMEROS INGRESADOS POR EL USUARIO
    */
    public static void mostrarRespuesta(double numero1, double numero2, double numero3){
        double mayor;
        if(numero1>numero2){
            mayor = numero1;
            if(mayor>numero3){
                mayor = numero1;
            }else{
                mayor = numero3;
            }
        }else{
            mayor = numero2;
            if(mayor>numero3){
                mayor = numero2;
            }else{
                mayor = numero3;
            }
        }
        System.out.println("El numero mayor de los tres numero ingresados es: " + mayor);
    }
}

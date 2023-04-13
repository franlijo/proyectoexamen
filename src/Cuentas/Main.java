/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cuentas;

/**
 *
 * @author fran
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    operativa_cuenta(null);
    }
    
    public static void operativa_cuenta(java.lang.Float cuenta) {
        CCuenta Micuenta;
        double saldoActual;
        Micuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = Micuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            Micuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            Micuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

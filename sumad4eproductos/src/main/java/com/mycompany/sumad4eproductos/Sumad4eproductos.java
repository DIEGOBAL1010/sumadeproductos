package com.mycompany.sumad4eproductos;
import java.util.Scanner;
public class Sumad4eproductos {
public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Float iva,neto,art,cost,tot;
        System.out.print("ingresa cantidad de articulos: ");
        art=leer.nextFloat();
        System.out.print("ingresa cantidad de precio: ");
        cost=leer.nextFloat();
        tot=art*cost;
        iva=tot*16/100;
        neto=tot+iva;
        System.out.print("el total a pagar es: "+neto);
    }
}

package Exercicio01042024;

public class Exercicio128 {

    public static void main(String[] args) {
        
        double salario  = 5967.35;

        if  (salario <= 1200) {
            System.out.println("isento");
        } else if (salario >= 1201 && salario <= 5000) {
            System.out.printf("10%");
            
        } else if (salario >5001 && salario <= 10000) {
            System.out.println("15%");

        } else if (salario > 10001) {
            System.out.println("20%");
        }
    } 
}

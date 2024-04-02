package Exercicio01042024;

public class Exercicio122 {

    public static void main(String[] args) {
        
        int num1 = 37; 
        int num2 = 13; 

        double mod = (num1 % num2);

        System.out.println("O mod de 37 de 13 é: " + mod);

    //div 

    int num3 = 41;
    int num4 = 7; 

    double div  = (double) num3 / num4; 
    System.out.printf("A divisão de 41 por 7 é %.2f", div);    


        //div e mod 

        int num5 = 11; int num6 = 3; int num7 = 2; 

        double divmod = (num5 / num6 % num7); 
        System.out.println("\n\nO valor da variável divmod é: " + divmod);  

        //moddiv 

        double moddiv = (num5 % num6 / num7);
        System.out.println("\n \n O valor da variavel moddiv é: " + moddiv);
    
    }
    } 

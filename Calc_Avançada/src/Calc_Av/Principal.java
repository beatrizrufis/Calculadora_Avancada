package Calc_Av;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bem Vindo a Calculadora!");
        double a = 0, aux = 0;
        Scanner input = new Scanner(System.in);
        Calculo c = new Calculo();
        String equação = input.nextLine();
        String vet[] = equação.split(" ");
        
        switch (vet[1]){
            case ("+"):
                aux = (c.Soma(Double.parseDouble(vet[0]), Double.parseDouble(vet[2])));
            break;
            case ("-"):
                aux = (c.Subtracao(Double.parseDouble(vet[0]), Double.parseDouble(vet[2])));
            break;
            case ("*"):
               aux = (c.Multiplicacao(Double.parseDouble(vet[0]), Double.parseDouble(vet[2])));
            break;
            case ("/"):
                aux = (c.Divisao(Double.parseDouble(vet[0]), Double.parseDouble(vet[2])));
            break;
            case ("v"):
                aux = (c.Raiz_Quadrada(Double.parseDouble(vet[0])));
            break;
            case ("^"):
                aux = (c.Exponencial(Double.parseDouble(vet[0]), Double.parseDouble(vet[2])));
            break;
            case ("%"):
                aux = (c.Porcentagem(Double.parseDouble(vet[0]), Double.parseDouble(vet[2])));
            break;
            case("l"):
                aux = (c.Logaritmo(Double.parseDouble(vet[0]), Double.parseDouble(vet[2])));
            break;
            default:
                System.out.println("erro");
            break;
        }
        System.out.println("= " +aux);
        do{
            vet[0] = String.valueOf(c.getResult());
            vet[1] = input.next(); 
            vet[2] = input.next(); 
            switch (vet[1]){
            case ("+"):
                aux = (c.Soma(c.getResult(), Double.parseDouble(vet[2])));
            break;
            case ("-"):
                aux = (c.Subtracao(c.getResult(), Double.parseDouble(vet[2])));
            break;
            case ("*"):
               aux = (c.Multiplicacao(c.getResult(), Double.parseDouble(vet[2])));
            break;
            case ("/"):
                aux = (c.Divisao(c.getResult(), Double.parseDouble(vet[2])));
            break;
            case ("v"):
                aux = (c.Raiz_Quadrada(c.getResult()));
            break;
            case ("^"):
                aux = (c.Exponencial(c.getResult(), Double.parseDouble(vet[2])));
            break;
            case ("%"):
                aux = (c.Porcentagem(c.getResult(), Double.parseDouble(vet[2])));
            break;
            case("l"):
                aux = (c.Logaritmo(c.getResult(), Double.parseDouble(vet[2])));
            break;
            default:
                System.out.println("erro");
            break;
            }
        System.out.println("= "+aux);
        }while (a!=1);
    }
}

    


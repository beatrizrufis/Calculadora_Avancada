package Calc_Av;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bem Vindo a Calculadora!");
        Scanner input = new Scanner(System.in);
        Calculo c = new Calculo();
        String equação = input.nextLine();
        String vet[] = equação.split(" ");
    
        if((vet[1]).equals("+")){
            System.out.println(c.Soma(Double.parseDouble(vet[0]), Double.parseDouble(vet[2])));
        }else{
            if((vet[1].equals("-"))){
                System.out.println(c.Subtracao(Double.parseDouble(vet[0]), Double.parseDouble(vet[2])));
            }else{
                if((vet[1].equals("v"))){
                    //raiz cubica
                    System.out.println(c.Raiz_Cubica(Double.parseDouble(vet[0])));
                    //raiz quadrada
                    System.out.println(c.Raiz_Quadrada(Double.parseDouble(vet[0])));
		}else{
                     if((vet[1].equals("*"))){
			     System.out.println(c.Multiplicacao(Double.parseDouble(vet[0]), Double.parseDouble(vet[2])));		
                    }else{
			if((vet[1].equals("%"))){
				System.out.printls(c.Porcentagem(Double.parseDouble(vet[0], Double.parseDouble(vet[2])));
			}
            	    }
        	}
}

    


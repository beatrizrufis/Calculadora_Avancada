package Calc_Av;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bem Vindo a Calculadora!");
        double a = 0, aux = 0;
        Scanner input = new Scanner(System.in);
        Calculo c = new Calculo();
        String equação = input.nextLine();
        if(equação.length()>5){
            System.out.println("Erro! \nPor favor, faça somente uma operação por vez:");
            equação = input.nextLine();
        }
        String vet[] = equação.split(" ");
        String ss;
        try{
            Double.parseDouble(vet[0]);
        }catch(NumberFormatException art){
            System.out.println("Erro, por favor insira números:");
                vet[0] = input.next(); 
                vet[1] = input.next(); 
                vet[2] = input.next(); 
        }
        try{
            Double.parseDouble(vet[2]);
        }catch(NumberFormatException art){
            System.out.println("Erro, por favor insira números:");
                vet[0] = input.next(); 
                vet[1] = input.next(); 
                vet[2] = input.next(); 
        }
    do{//primeira ida     
        ss = "3";
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
                System.out.println("Erro operador invalido:");
                System.out.println("Tente novamente: ");
                ss = "50";
            break;
            }
        if((ss).equals("50")){
            vet[0] = input.next(); 
            vet[1] = input.next(); 
            vet[2] = input.next(); 
            try{
            Double.parseDouble(vet[0]);
                }catch(NumberFormatException art){
                    System.out.println("Erro, por favor insira números:");
                        vet[0] = input.next(); 
                        vet[1] = input.next(); 
                        vet[2] = input.next(); 
                }
                try{
                    Double.parseDouble(vet[2]);
                }catch(NumberFormatException art){
                    System.out.println("Erro, por favor insira números:");
                        vet[0] = input.next(); 
                        vet[1] = input.next(); 
                        vet[2] = input.next(); 
                }
        }
    }while((ss).equals("50"));
       System.out.println("= " +aux);
    do{//segunda ida
        vet[1] = input.next(); 
        vet[2] = input.next(); 
        do{
            ss = "3";
            vet[0] = String.valueOf(c.getResult());
            try{
                Double.parseDouble(vet[2]);
            }catch(NumberFormatException art){
                System.out.println("Erro, por favor insira números:");
                    vet[1] = input.next(); 
                    vet[2] = input.next(); 
            }
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
                System.out.println("Erro operador invalido:");
                System.out.println("Tente o operador novamente: ");
                ss = "50";
            break;
            }
        if((ss).equals("50")){
            vet[1] = input.next(); 
            vet[2] = input.next(); 
        }
    }while((ss).equals("50"));
    System.out.println("= "+aux);
    }while (a!=1);
    }
}

    


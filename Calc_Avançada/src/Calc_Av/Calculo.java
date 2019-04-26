package Calc_Av;
public class Calculo {
    private double result;
    
    public double Soma(double a, double b){
        this.result = a + b;
        return this.result;
    }
    
    public double Subtracao(double a, double b){
	this.result = a - b;
        return this.result;
    }

    public double Multiplicacao(double a, double b){
	   this.result = a * b;
            return this.result;
    }

    public double Divisao(double a, double b){
	    this.result = a / b;
            return this.result;
    }
    
    public double Raiz_Quadrada(double a){
        this.result = java.lang.Math.sqrt(a);
        return this.result;
    }

    public double Porcentagem(double a, double b){
	    this.result = a*b/100;
            return this.result;
	}
    public double Logaritmo(double a, double b){
	this.result = Math.log(a)/Math.log(b);
	return this.result;
    }
    public double Exponencial(double a, double b){
        this.result = Math.pow(a, b);
        return this.result;
    }
    public double getResult(){
        return this.result;
    }
	 
}

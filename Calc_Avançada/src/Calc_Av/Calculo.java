package Calc_Av;
public class Calculo {
    public double Soma(double a, double b){
        double result = a + b;
        return result;
    }
    
    public double Subtracao(double a, double b){
	double result = a - b;
        return result;
    }

    public double Multiplicacao(double a, double b){
	    double result = a * b;
	    return result;
    }

    public double Divisao(double a, double b){
	    double result = a / b;
	    return result;
    }
    
    public double Raiz_Quadrada(double a){
        double result;
        result = java.lang.Math.sqrt(a);
        return result;
    }

    public double Porcentagem(double a, double b){
	    double result;
	    result = a*b/100;
	    return result;
	}
    public double Logaritmo(double a, double b){
    	double result;
	result = Math.log(a)/Math.log(b);
	return result;
    }

	 
}

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
    
    public double Raiz_Quadrada(double a){
        double result;
        result = java.lang.Math.sqrt(a);
        return result;
    }
    
    public double Raiz_Cubica(double a){
        double result;
        result = java.lang.Math.cbrt(a);
        return result;
    }
}

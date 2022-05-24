public class Calculadora{
    public double suma(double a, double b){
        return a+b;
    }
    public double resta(double a, double b){
        return a-b;
    }
    public double multiplica(double a, double b){
        return a*b;
    }
    public double division(double a, double b){
        return a/b;
    }
    public double raiz(Double X) {
        for (double i = 1; i < X; ++i) {
            double p = i * i;
            if (p == X) {
                // perfect square
                return i;
            }
            if (p > X) {
                // found left part of decimal
                return raiz(X, i - 1, i);
            }
        }
        return Double.NaN;
    }    
    private double raiz(double X, double low, double high) {
        double mid = (low + high) / 2;
        double p = mid * mid;
        // uncomment below line to see how we reach the final answer
        // System.out.println(low + " " + high + " " + mid + " " + p);
    
        if (p == X || (Math.abs(X - p) < 0.001)) {
            return mid;
        }
        if (p < X) {
            return raiz(X, mid, high);
        }
        return raiz(X, low, mid);
    }
}
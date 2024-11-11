public class Euro extends Moneda {
    
    private final double valorPeso =  0.046;
    private final double valorDolar = 0.94;
    private final double valorLibra = 1.14;
    private final double valorSol = 0.27;

    public Euro(String paisOrigen){
        this.paisOrigen = paisOrigen;
    }
    
    public double getValorDolar(double valor) {
        return valor * valorDolar;
    }

    public double getValorLibra(double valor) {
        return valor * valorLibra;
    }

    public double getValorPeso(double valor) {
        return valor * valorPeso;
    }

    public double getValorSol(double valor) {
        return valor * valorSol;
    }

    @Override
    public void getPaisOrigen() {
       System.out.println("El nombre de tu pais es: " + paisOrigen);    
    }
}

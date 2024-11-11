public class SolPeurano extends Moneda {
    private final double valorPeso = 0.19;
    private final double valorDolar = 3.77;
    private final double valorEuro = 4.00;
    private final double valorLibra = 4.55;

    public SolPeurano(String paisOrigen){
        this.paisOrigen = paisOrigen;
    }
    
    public double getValorDolar(double valor) {
        return valor * valorDolar;
    }

    public double getValorEuro(double valor) {
        return valor * valorEuro;
    }

    public double getValorPeso(double valor) {
        return valor * valorPeso;
    }

    public double getValorLibra(double valor) {
        return valor * valorLibra;
    }
    @Override
    public void getPaisOrigen() {
       System.out.println("El nombre de tu pais es: " + paisOrigen);    
    }
}
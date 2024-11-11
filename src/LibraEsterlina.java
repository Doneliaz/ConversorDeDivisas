public class LibraEsterlina extends Moneda{
    private final double valorPeso = 0.038;
    private final double valorDolar = 0.77;
    private final double valorEuro = 0.83;
    private final double valorSol = 0.21;

    public LibraEsterlina(String paisOrigen){
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

    public double getValorSol(double valor) {
        return valor * valorSol;
    }

    @Override
    public void getPaisOrigen() {
       System.out.println("El nombre de tu pais es: " + paisOrigen);    
    }
    
}

public class PesoMexicano extends Moneda{
    
    private final double valorLibra = 24.13;
    private final double valorDolar = 20.13;
    private final double valorEuro = 21.50;
    private final double valorSol = 5.34;

    public PesoMexicano(String paisOrigen){
        this.paisOrigen = paisOrigen;
    }
    
    public double getValorDolar(double valor) {
        return valor * valorDolar;
    }

    public double getValorEuro(double valor) {
        return valor * valorEuro;
    }

    public double getValorLibra(double valor) {
        return valor * valorLibra;
    }

    public double getValorSol(double valor) {
        return valor * valorSol;
    }

    @Override
    public void getPaisOrigen() {
       System.out.println("El nombre de tu pais es: " + paisOrigen);    
    }
    
}

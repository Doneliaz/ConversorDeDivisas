public class DolarEstadounidense extends Moneda {
    private final double valorPeso = 0.050;
    private final double valorLibra = 1.21;
    private final double valorEuro = 1.07;
    private final double valorSol = 0.27;

    public DolarEstadounidense(String paisOrigen){
        this.paisOrigen = paisOrigen;
    }
    
    public double getValorLibra(double valor) {
        return valor * valorLibra;
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

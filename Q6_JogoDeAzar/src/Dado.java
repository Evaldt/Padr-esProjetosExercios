import java.util.Random;

public class Dado implements IDado{
    
    private int lados; 
    private int valorJogada; //guarda resul da ultima rolagem, comeca em 0 por padrao 
    private final Random random; //criar numero aleatorios 

    public Dado(int lados) {
        this.lados = lados;
        this.random = new Random();
    }

    //metodo que 'joga o dado'
    public void rolar() {
        valorJogada = random.nextInt(lados) + 1;//gera numero aleatorio entre 1 a n
    }
    //só devolve o valor que já foi sorteado.
    public int getValor() {
        return valorJogada;
    }
    
}

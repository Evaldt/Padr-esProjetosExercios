import java.util.ArrayList;
import java.util.List;

public class DadoComHistorico extends DadoDecorator {
    private final List<Integer> historico = new ArrayList<>();
    
    public DadoComHistorico(IDado dado){
        super(dado); //como estou extend da classe esse super é da classe dadodecorator
    }

    public void rolar(){
        super.rolar();
        historico.add(getValor());
    }

    public List<Integer> getHistorico(){
        return historico;
    }
}

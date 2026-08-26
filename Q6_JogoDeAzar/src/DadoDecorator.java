public abstract class DadoDecorator implements IDado{
    protected IDado dado; //protected pois vou precisas esse atributo na classe historico 

    public DadoDecorator(IDado dado){
        this.dado = dado;
    }

    public void rolar(){
        dado.rolar();
    }

    public int getValor(){
        return dado.getValor();
    }
    
}

public class Matricula implements Validador {
    public boolean valida(Tipo tipo, String valor){
        Inteiro inteiroValida = new Inteiro();
        if (!inteiroValida.valida(Tipo.INTEIRO,valor)){
            return false;
        }else{
            int sum = 0;
            for(int i=0;i<valor.length()-1;i++){
                sum += Character.getNumericValue(valor.charAt(i));
            }
            int verificador = sum%10;
            if (verificador == Character.getNumericValue(valor.charAt(valor.length()-1))){
                return true;
            }
        }
        return false;
    }
}

public class App {
    public static void main(String[] args) {
       /* 
        Dado d6 = new Dado(6);
        Dado d20 = new Dado(20);
        d6.rolar();
        d20.rolar();
        System.out.println("D6: " + d6.getValor());
        System.out.println("D20: " + d20.getValor());
         */

        IDado d6 = new Dado(6);
        DadoComHistorico d6ComHistorico = new DadoComHistorico(d6);

        d6ComHistorico.rolar();
        d6ComHistorico.rolar();
        d6ComHistorico.rolar();

        System.out.println("Histórico: " + d6ComHistorico.getHistorico());
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        LogSimples log = LogSimples.getInstance();
        log.log("Mensagem de alerta 1");
        log.log("Mensagem de alarme 23");
        log.log("Mensagem de PANICO!!");

        Log logColchetes = new LogColchetes(log);
        logColchetes.log("mensagem com colchetes");

        Log logMaiusculas = new LogMaiusculas(log);
        logMaiusculas.log("mensagem em maiusculas");

        Log logNiveis = new LogNiveis(log, 1);
        logNiveis.log("mensagem com nivel");

        Log logDecorado = new LogColchetes(new LogMaiusculas(new LogNiveis(log, 1)));
        logDecorado.log("mensagem de teste");

        for(String m:log){
            System.out.println(m);
        }
    }
}

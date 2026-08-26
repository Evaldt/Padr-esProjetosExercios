public class LogNiveis extends LogDecorator {
      private int nivel;
      public LogNiveis(Log log, int nivel) { 
        super(log); 
        this.nivel = nivel; 
    }

      @Override
      public void log(String m) {
          wrapped.log("Nível" + nivel + ":" + m);
      }
  }
public class LogMaiusculas extends LogDecorator {
      public LogMaiusculas(Log log) { super(log); }

      @Override
      public void log(String m) {
          wrapped.log(m.toUpperCase());
      }
  }
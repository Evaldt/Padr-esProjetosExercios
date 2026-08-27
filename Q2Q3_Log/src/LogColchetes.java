public class LogColchetes extends LogDecorator {
      public LogColchetes(Log log) { super(log); }

      @Override
      public void log(String m) {
          wrapped.log("[" + m + "]");
      }
  }
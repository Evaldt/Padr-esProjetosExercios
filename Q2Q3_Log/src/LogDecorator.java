public abstract class LogDecorator implements Log {
    protected Log wrapped;
    public LogDecorator(Log log) { 
        this.wrapped = log;
    }
}

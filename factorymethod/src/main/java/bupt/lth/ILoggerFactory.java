//日志记录器工厂接口：抽象工厂
public interface ILoggerFactory {
    ILogger createLogger();
    ILogger creatLogger(String args);
    ILogger creatLogger(Object object);
}

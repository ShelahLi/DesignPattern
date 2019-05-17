//文件日志记录器工厂类：具体工厂
public class FileLoggerFactory implements ILoggerFactory {

    public ILogger createLogger() {
        //创建文件日志记录器实例
        ILogger logger = new FileLogger();
        //创建文件，代码省略
        return logger;
    }
    public ILogger creatLogger(String args) {
        //使用args来创建文件
        //创建数据库日志记录器对象
        ILogger logger = new DatabaseLogger();
        return logger;
    }

    public ILogger creatLogger(Object object) {
        //使用封装在Object中的参数来创建文件
        //创建数据库日志记录器对象
        ILogger logger = new DatabaseLogger();
        return logger;
    }
}

//数据库日志记录器工厂类：具体工厂
public class DatabaseLoggerFactory extends AbstractFactory implements ILoggerFactory {

    public ILogger createLogger() {
        //连接数据库，代码省略
        //创建数据库日志记录器对象
        ILogger logger = new DatabaseLogger();
        return logger;
    }

    public ILogger creatLogger(String args) {
        //使用args作为连接字符串类连接数据库
        //创建数据库日志记录器对象
        ILogger logger = new DatabaseLogger();
        return logger;
    }

    public ILogger creatLogger(Object object) {
        //使用封装在Object中的参数作为连接字符串类连接数据库
        //创建数据库日志记录器对象
        ILogger logger = new DatabaseLogger();
        return logger;
    }
}

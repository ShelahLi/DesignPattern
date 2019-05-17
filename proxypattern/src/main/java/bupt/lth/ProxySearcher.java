//代理查询类
public class ProxySearcher implements Search {
    private RealSearcher realSearcher = new RealSearcher();
    private AccessValidator validator;
    private Logger logger;
    public String DoSearch(String userId, String key) {
        if(this.validate(userId)){
            String result = realSearcher.DoSearch(userId, key);
            this.log(userId);
            return result;
        }else {
            return null;
        }

    }
    //创建验证对象并调用其Validate方法，实现身份认证
    public boolean validate(String userId){
        validator = new AccessValidator();
        return validator.validate(userId);
    }
    //创建日志对象并调用其log方法记录日志
    public void log(String userId){
        logger = new Logger();
        logger.log(userId);
    }
}

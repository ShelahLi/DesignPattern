import java.lang.System;
//身份验证类，业务类，它提供Validate()来实现身份的验证
public class AccessValidator {
    //模拟实现登录验证
    public  boolean validate(String userId){

       System.out.println("在数据库中认证用户" + userId + "是否是合法用户");
       if (userId.equals("lth")){
           System.out.println("登陆成功");
           return true;
       }else {
           System.out.println("登录失败");
           return false;
       }

    }
}

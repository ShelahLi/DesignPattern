package bupt.lth.log;

import java.io.Serializable;
//抽象命令类，由于需要将命令写入文件，因此它实现了Serializable接口
public abstract class AbstractCommand implements Serializable {
        protected String name;//命令名称
        protected String args;//命令参数
        protected ConfigOperator configOperator;//维持对接收者对象的引用

        public  AbstractCommand(String name){
            this.name = name;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConfigOperation(ConfigOperator configOperator) {
        this.configOperator = configOperator;
    }

    //声明两个抽象方法execute
    public abstract void execute(String args);
    public abstract void execute();

}

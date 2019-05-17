package bupt.lth.log;

import bupt.lth.log.AbstractCommand;

//修改命令类：具体命令
public class ModifyCommand extends AbstractCommand {

    public ModifyCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.modify(args);
    }

    @Override
    public void execute() {
        configOperator.modify(args);
    }
}

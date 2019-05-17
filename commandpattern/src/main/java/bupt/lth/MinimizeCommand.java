package bupt.lth;

public class MinimizeCommand extends Command{
    private WindowHandler windowHandler;
    public MinimizeCommand(){
        this.windowHandler = new WindowHandler();
    }

    @Override
    public void execute() {
        windowHandler.minimize();
    }

    @Override
    public int execute(int value) {
        return 0;
    }

    @Override
    public int undo() {
        return 0;
    }
}

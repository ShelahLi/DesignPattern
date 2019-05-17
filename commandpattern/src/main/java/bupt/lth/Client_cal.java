package bupt.lth;

public class Client_cal {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Command command;
        command = new ConcreteCommand();

        calculator.setCommand(command);
        calculator.compute(10);
        calculator.compute(5);
        calculator.compute(10);
        calculator.undo();
        calculator.undo();



    }
}

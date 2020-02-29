package dev.ananda.oopatterns.behavioral.Interpreter.sample1;

public class MainApp {
    private InterpreterEngine engine;

    public MainApp(InterpreterEngine engine) {
        this.engine = engine;
    }

    public int interpret(String input) {
        Expression expression = null;

        if(input.contains("add")){
            expression = new AddExpression(input);
        } else if(input.contains("multiply")){
            expression = new MultiplyExpression(input);
        }
        int result = expression.interpret(engine);
        System.out.println(input);
        return result;
    }

    public static void main(String[] args) {
        MainApp app = new MainApp(new InterpreterEngine());

        System.out.println("Result: "+app.interpret("add 73 and 9232"));
        System.out.println("Result: "+app.interpret("multiply "+app.interpret("add 1 and 2")
                + " and 64"));
    }
}

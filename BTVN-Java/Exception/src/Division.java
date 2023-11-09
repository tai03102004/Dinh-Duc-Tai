public class Division extends BinaryExpression {
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")" ;
    }

    public double evaluate() {
        return left.evaluate() / right.evaluate();
    }
}

public class OperationExpression implements Expression {

    private Expression left;
    private Expression right;
    private Operator operator;

    public OperationExpression(Expression left, Expression right, Operator operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    /*
Mi hat method pti unenanq parseExpression orinak vorn vor petq a henc recurcive ashxati,
 da pti veradardzni Expression u ynduni String expression. Dzaxic gnum enq aj, gtnum enq arajin + kam -y,
 henc ed gtnelu pahin ed mer ekac expression-y bajanum enq 2 masi ed plyus kam minus-ic dzax u aj,
 heto mi hat dzaxi hamar enq ed mer parseExpression-y kanchum mi hat aji hamar.
 U verjum veradardznum enq Expression type-i OperatorExpression, u dra calculate-y talis a result-y.
 Amen rec.-i jamanak mi hat OperationExpression enq sarqum vori leftn u right-y eli recurcive kanchum enq.
 U sa anum enq enqan qani der indexOf + kam - gtnum enq, henc chenq gtnum
 veradardznum enq ValueExpression ( mi hatik tiv eli ).
*/

    public Expression parseExpression(String s) {
        if (!s.contains("+") && !s.contains("-")) {
            return new ValueExpression(Integer.parseInt(s));
        } else {
            int a = s.indexOf("+");
            ValueExpression right = new ValueExpression(Integer.parseInt(s.substring(0, a)));
            String left = s.substring(a);
            return parseExpression(left);
        }
    }


    @Override
    public double calculate() {
        return 0;
    }
}

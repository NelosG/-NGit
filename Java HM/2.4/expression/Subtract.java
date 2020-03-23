package expression;

import expression.exceptions.ArithmeticMyException;
import expression.generic.RIBiD.R;

public class Subtract<T extends Number> extends Binary<T> {

    public Subtract(CommonExpression<T> var1, CommonExpression<T> var2) {
        super(var1, var2);
    }

    @Override
    protected T calc(R<T> r, T a, T b) {
        if (a == null || b == null) return null;
        T res;
        try {
            res = r.sub(a, b);
        } catch (ArithmeticMyException e) {
            return null;
        }
        return res;
    }
}

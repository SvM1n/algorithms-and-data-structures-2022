package mirea.practice.task5;

public interface Calculable<T> {
    default T add(T lhs, T rhs) {
        if (rhs instanceof Integer) {
            return (T) Integer.valueOf((int) rhs + (int) lhs);
        }
        if (rhs instanceof Double) {
            return (T) Double.valueOf((double) rhs + (double) lhs);
        }
        //и другие типы
        return lhs;
    }

    default T multiply(T lhs, T rhs) {
        if (rhs instanceof Integer) {
            return (T) Integer.valueOf((int) rhs * (int) lhs);
        }
        if (rhs instanceof Double) {
            return (T) Double.valueOf((double) rhs * (double) lhs);
        }
        //и другие типы
        return lhs;
    }
}
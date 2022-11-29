package mirea.practice.tasks1to3;

import java.io.Serializable;

public class GeneralClass<T extends String, V extends Animal & Serializable, K extends Number> {
    T firstParameter;
    V secondParameter;
    K thirdParameter;

    public GeneralClass(T firstParameter, V secondParameter, K thirdParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
        this.thirdParameter = thirdParameter;
    }

    public T getFirstParameter() {
        return firstParameter;
    }

    public V getSecondParameter() {
        return secondParameter;
    }

    public K getThirdParameter() {
        return thirdParameter;
    }

    public String getTypes() {
        return "firstParameter class " + firstParameter.getClass().getName()
            + ",\nSecondParameter class: " + secondParameter.getClass().getName()
            + ",\nThirdParameter class: " + thirdParameter.getClass().getName();
    }
}

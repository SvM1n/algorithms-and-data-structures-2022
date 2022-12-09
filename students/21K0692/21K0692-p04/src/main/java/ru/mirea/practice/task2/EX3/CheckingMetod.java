package EX2.EX3;

import java.lang.reflect.Method;

public class CheckingMetod {
    public final static int PUBLIC_STATIC_MODIFIER_NUMBER = 9;
    private String name;
    private int parameterCount;
    private boolean isStatic;

    public CheckingMetod() {
    }

    public CheckingMetod(String name) {
        this.name = name;
    }

    public CheckingMetod(String name, int parameterCount) {
        this(name);
        this.parameterCount = parameterCount;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatic() {
        return isStatic;
    }
    public void setStatic(boolean isStatic) {
        this.isStatic = isStatic;
    }

    public int getParameterCount() {
        return parameterCount;
    }
    public void setParameterCount(int parameterCount) {
        this.parameterCount = parameterCount;
    }

    public boolean isContainedIn(Class<?> c) {
        for (Method method : c.getMethods()) {
            if (method.getName().equals(getName()) &&
                    method.getParameterCount() == getParameterCount()) {
                setStatic(method.getModifiers() == PUBLIC_STATIC_MODIFIER_NUMBER);
                return true;
            }
        }
        return false;
    }
}

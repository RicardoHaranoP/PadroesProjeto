package org.yourcompany.yourproject.GoF;

public class SingletonLazyHolder {
    private static class Holder {
        private static final SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return Holder.instancia;
    }
}
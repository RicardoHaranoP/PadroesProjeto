package org.yourcompany.yourproject.Strategy;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("movendo-se defensivamente");
    }
}
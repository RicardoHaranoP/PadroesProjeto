/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

import org.yourcompany.yourproject.Facade.Facade;
import org.yourcompany.yourproject.GoF.SingletonEager;
import org.yourcompany.yourproject.GoF.SingletonLazy;
import org.yourcompany.yourproject.GoF.SingletonLazyHolder;
import org.yourcompany.yourproject.Strategy.Comportamento;
import org.yourcompany.yourproject.Strategy.ComportamentoAgressivo;
import org.yourcompany.yourproject.Strategy.ComportamentoDefensivo;
import org.yourcompany.yourproject.Strategy.ComportamentoNormal;
import org.yourcompany.yourproject.Strategy.Robo;
/**
 *
 * @author 10969836996
 */
public class Singleton {

    public static void main(String[] args) {

        // Singleton:
        SingletonLazy lazy = SingletonLazy.getInstancia();
        SingletonEager eager = SingletonEager.getInstancia();
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazy);
        System.out.println(eager);
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy:
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        //Facade:
        Facade facade = new Facade();
        facade.migrarCliente("João", "123456789");
    }
}

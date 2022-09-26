package org.martin.designpatters.creational.prototype;

/**
 * @author victor.martingil
 **/
public class PrototypeMain {

    public static void main (String[] args) {

        CuentaImpl cuenta = new CuentaImpl();
        cuenta.setMonto(12.12);
        CuentaImpl cuentaClonada = (CuentaImpl) cuenta.clonar();

        if (cuentaClonada != null) {
            System.out.println("La cuenta ha sido clonada con un monto de " + cuentaClonada.getMonto());
        }

    }

}

package org.martin.designpatters.creational.prototype;

import lombok.Data;

/**
 * @author victor.martingil
 **/
@Data
public class CuentaImpl implements ICuenta {

    private double monto;

    @Override
    public ICuenta clonar() {
        CuentaImpl cuenta = null;

        try {
            cuenta = (CuentaImpl) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return cuenta;
    }
}

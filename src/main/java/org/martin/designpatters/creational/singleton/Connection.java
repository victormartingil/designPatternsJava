package org.martin.designpatters.creational.singleton;

/**
 * @author victor.martingil
 **/
public class Connection {

    private static Connection instance;

    // We create a private constructor to avoid
    // We cannot create new object with this constructor. Check next method.
    private Connection(){}

    //To create a new instance, due the constructor is private, we build the following method
    // With this, we avoid to instantiate more than once one object from this Class.
    // Must be static, because we need call this method before instantiate any object.
    public static Connection getInstance(){
        if (instance == null) {
            instance = new Connection();
        }
        return instance;
    }
    
}

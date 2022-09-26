package org.martin.designpatters.creational.builder;

import org.martin.designpatters.creational.builder.model.Builder;
import org.martin.designpatters.creational.builder.model.Person;

/**
 * @author victor.martingil
 **/
public class BuilderMain {

    public static void main (String[] args){

        Builder builder = new Builder();

        builder.setName("Paco");
        builder.setAddress("Madrid");
        builder.setAge(34);
        Person person = builder.build();

        System.out.println(person);


    }

}

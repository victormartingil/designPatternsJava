package org.martin.designpatters.creational.builder.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author victor.martingil
 **/

@Data
@AllArgsConstructor
 @NoArgsConstructor
public class Person {

    private String name;
    private String address;
    private int age;

}

package org.martin.designpatters.creational.builder.model;

/**
 * @author victor.martingil
 **/
public class Builder {

    private Person person;

    public Builder(){
        person = new Person();
    }

    public Builder setName(String name) {
        person.setName(name);
        return this;
    }

    public Builder setAddress(String address) {
        person.setAddress(address);
        return this;
    }

    public Builder setAge(int age) {
        person.setAge(age);
        return this;
    }

    public Person build() {
        return person;
    }

}

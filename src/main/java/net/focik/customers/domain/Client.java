package net.focik.customers.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
abstract class Client {

    protected int id;
//    protected String firstName;
//    private String lastName;
    protected Address address;
    protected List<String> phoneList;
    protected String mail;
    protected String info;
    protected ClientType customerType;

}

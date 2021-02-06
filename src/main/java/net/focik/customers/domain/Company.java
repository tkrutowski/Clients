package net.focik.customers.domain;

import net.focik.customers.domain.Client;

class Company extends Client implements IClient {
    private String name;
    private String nip;
    private String fax;
}

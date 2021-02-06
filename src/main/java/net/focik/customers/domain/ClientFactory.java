package net.focik.customers.domain;

import net.focik.customers.domain.dto.ClientCalendarDto;
import net.focik.customers.infrastructure.dto.AddressDbDto;
import net.focik.customers.infrastructure.dto.ClientDbDto;
import org.springframework.stereotype.Component;

@Component
class ClientFactory {


    ClientCalendarDto createClientCalendarDto(ClientDbDto client){
        ClientCalendarDto dto = new ClientCalendarDto();
        dto.setId(client.getId());
        dto.setFullName(client.getLastName() + " " + client.getFirstName());
        dto.setPhone(client.getPhoneNo());
        dto.setMail(client.getMail());

        return dto;
    }

    ClientDbDto createClientDbDto(Client client){
        ClientDbDto dbDto = null;

       if(client.getClass() == Customer.class)
          dbDto = createClientDbDtoFromCustomer((Customer) client);

        if(client.getClass() == Company.class)
           dbDto = createClientDbDtoFromCompany((Company) client);

        return dbDto;
    }

    private ClientDbDto createClientDbDtoFromCompany(Company company) {
        return null;
    }

    private ClientDbDto createClientDbDtoFromCustomer(Customer customer) {
//        ClientDbDto dto=new ClientDbDto();
//        dto.setLastName("Krutowski");
//        dto.setAddress(new AddressDbDto(1,"Pobiedziska","Armii Poznań 39", "62-010"));
//        dto.setFirstName("Tomasz");
//        dto.setClientType(ClientType);
    return null;
    }
}

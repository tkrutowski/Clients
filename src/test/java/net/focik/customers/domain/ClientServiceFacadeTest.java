package net.focik.customers.domain;

import lombok.extern.java.Log;
import net.focik.customers.CustomersApplication;
import net.focik.customers.domain.dto.ClientCalendarDto;
import net.focik.customers.infrastructure.dto.AddressDbDto;
import net.focik.customers.infrastructure.dto.ClientDbDto;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

@ExtendWith(SpringExtension.class)
//@SpringBootTest(classes = CustomersApplication.class)
@SpringBootTest

class ClientServiceFacadeTest {

    @Autowired
    ClientServiceFacade clientServiceFacade;

    @Test
    @Disabled("Not implemented yet")
    void addClient() {
    }

    @Test
    void getClientById() {
        //when
        Long id = clientServiceFacade.addClient(createDto());
        //given
        ClientCalendarDto result = clientServiceFacade.getClientCalendarById(id);

        //then
        Assertions.assertEquals(id,result.getId());
    }

    private ClientDbDto createDto(){
        ClientDbDto dto=new ClientDbDto();
        dto.setLastName("Krutowski");
        dto.setAddress(new AddressDbDto(1l,"Pobiedziska","Armii Poznań 39", "62-010"));
        dto.setFirstName("Tomasz");
        dto.setClientType("CUSTOMER");
        dto.setPhoneNo("662-26-26-62");
        return dto;
    }
}
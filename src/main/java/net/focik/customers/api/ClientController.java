package net.focik.customers.api;

import lombok.AllArgsConstructor;
import net.focik.customers.domain.ClientServiceFacade;
import net.focik.customers.domain.dto.ClientCalendarDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
class ClientController {

    private ClientServiceFacade clientService;

//    @PostMapping
//    public Long addAuthor(@RequestBody Author author){
//        return clientService.addAuthor(author);
//    }

    @GetMapping("/client/{id}")
    ClientCalendarDto findClient(@PathVariable Long id){
        int i=0;
        return clientService.getClientCalendarById(id);
    }

}

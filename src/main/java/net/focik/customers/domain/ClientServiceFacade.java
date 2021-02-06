package net.focik.customers.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import net.focik.customers.domain.dto.ClientCalendarDto;
import net.focik.customers.infrastructure.dto.ClientDbDto;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientServiceFacade {

    //@Qualifier("inMemoryClientRepositoryAdapter")
    private IClientRepository clientRepository;
//    private IClientService clientService;
    private ClientFactory clientFactory;


    public Long addClient(ClientDbDto clientDbDto) {
int i=0;
         return clientRepository.add(clientDbDto);
    }

    public ClientCalendarDto getClientCalendarById(Long id){
        int i=0;
        Optional<ClientDbDto> byId = clientRepository.findById(id);

        return clientFactory.createClientCalendarDto(byId.get());
    }
}

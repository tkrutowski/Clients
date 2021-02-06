package net.focik.customers.infrastructure.inMemory;

import lombok.extern.java.Log;
import net.focik.customers.domain.IClientRepository;
import net.focik.customers.infrastructure.dto.ClientDbDto;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Optional;

@Component
//@Primary
@Log
class InMemoryClientRepositoryAdapter implements IClientRepository {
    private HashMap<Long, ClientDbDto> clients = new HashMap<>();


    @Override
    public Long add(ClientDbDto client) {
    log.info("Try add into inMemoryDb clientDbDto: "+client.toString());
        if(client == null)
            throw new NullPointerException("ClientDbDto cannot be null");
        Long id = clients.size() + 1l;
        client.setId(id);
        clients.put(id,client);
        log.info("Succssec id_client = " + id);
        return id;
    }

    @Override
    public Optional<ClientDbDto> findById(Long id) {
        return Optional.ofNullable(clients.get(id));
    }
}

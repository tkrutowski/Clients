package net.focik.customers.domain;

import net.focik.customers.infrastructure.dto.ClientDbDto;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface IClientRepository {
    Long add(ClientDbDto client);

    Optional<ClientDbDto> findById(Long id);
//
//    List<Client> findAll();
//
//    void delete(Long id);
//
//    Optional<Client> edit(Client author);
//
//    Optional<Client> findByNip(String nip);
}

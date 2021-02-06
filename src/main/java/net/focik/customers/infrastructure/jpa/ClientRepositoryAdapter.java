package net.focik.customers.infrastructure.jpa;

import lombok.AllArgsConstructor;
import net.focik.customers.domain.IClientRepository;
import net.focik.customers.infrastructure.dto.ClientDbDto;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
@Primary
class ClientRepositoryAdapter  implements IClientRepository {

    private IClientDtoRepository clientDtoRepository;

    @Override
    public Long add(ClientDbDto client) {
        return null;
    }

    @Override
    public Optional<ClientDbDto> findById(Long id) {
        return Optional.empty();
    }
}

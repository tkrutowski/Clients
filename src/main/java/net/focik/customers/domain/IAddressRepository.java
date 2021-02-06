package net.focik.customers.domain;

import net.focik.customers.infrastructure.dto.AddressDbDto;
import net.focik.customers.infrastructure.dto.ClientDbDto;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface IAddressRepository {

    Long add(AddressDbDto dto);

    Optional<AddressDbDto> findById(Long id);
}

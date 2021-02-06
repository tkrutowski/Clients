package net.focik.customers.infrastructure.jpa;

import net.focik.customers.infrastructure.dto.ClientDbDto;
import org.springframework.data.jpa.repository.JpaRepository;

interface IClientDtoRepository extends JpaRepository<ClientDbDto, Long > {
}

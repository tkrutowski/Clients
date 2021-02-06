package net.focik.customers.infrastructure.jpa;

import net.focik.customers.infrastructure.dto.AddressDbDto;
import org.springframework.data.jpa.repository.JpaRepository;

interface IAddressDtoRepository extends JpaRepository<AddressDbDto, Long> {
}

package net.focik.customers.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import net.focik.customers.domain.ClientType;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
//
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//@Entity
//@Table(name = "userbooks")
public class ClientCalendarDto {
    private Long id;
    private String fullName;
    private String phone;
    private String mail;
}

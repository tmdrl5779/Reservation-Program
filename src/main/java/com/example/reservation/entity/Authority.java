package com.example.reservation.entity;

import lombok.*;
import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Table(name = "authority")
@NoArgsConstructor
public class Authority {

    @Id
    @Column(name = "authority_name", length = 50)
    private String authorityName;

    @OneToMany(mappedBy = "authority")
    private Set<UserAuthority> userAuthorities;
}

package com.example.reservation.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Table(name = "user_authority")
@NoArgsConstructor
public class UserAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "authority_name")
    private Authority authority;

}

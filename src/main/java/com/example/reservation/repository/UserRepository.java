package com.example.reservation.repository;

import com.example.reservation.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @EntityGraph(attributePaths = "userAuthorities") //Eager 조회로 authorities정보를 같이 가져옴
    Optional<User> findOneWithUserAuthoritiesByUsername(String username); //User 정보를 가져올때 권한 정보도 같이 가져옴

}

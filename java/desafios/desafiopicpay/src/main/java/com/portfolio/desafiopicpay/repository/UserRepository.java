package com.portfolio.desafiopicpay.repository;


import com.portfolio.desafiopicpay.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findUserByDocument(String document);
    Optional<User> findUserById(String id);

}

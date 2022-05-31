package com.antra.springboot.security.springbootsecurityjwt.repository;

import com.antra.springboot.security.springbootsecurityjwt.user.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}

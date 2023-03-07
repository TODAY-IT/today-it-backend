package com.juju.todayit.repository.user;

import com.juju.todayit.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

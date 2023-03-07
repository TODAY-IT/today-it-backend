package com.juju.todayit.supplement.repository;

import com.juju.todayit.domain.user.userinfo.UserSupplementStandard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface SupplementRepository extends JpaRepository<UserSupplementStandard, Long> {

}

package com.juju.todayit.supplement.repository;

import com.juju.todayit.domain.daily.DailySupplement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface DailySupplementRepository extends JpaRepository<DailySupplement, Long> {

  Optional<DailySupplement> findByDate(LocalDate date);
}

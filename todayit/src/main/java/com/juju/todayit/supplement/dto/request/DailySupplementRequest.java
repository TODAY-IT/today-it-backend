package com.juju.todayit.supplement.dto.request;

import com.juju.todayit.domain.daily.DailySupplement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DailySupplementRequest {
  private long userId;
  private String supplementName;
  private LocalDate date;
}

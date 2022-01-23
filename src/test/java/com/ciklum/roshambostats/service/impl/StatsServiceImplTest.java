package com.ciklum.roshambostats.service.impl;

import com.ciklum.roshambostats.model.Stats;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class StatsServiceImplTest {

  @InjectMocks
  @Autowired
  private static StatsServiceImpl statsService;

  @Mock
  private Stats stats;

  @Test
  void incrementTotalRoundsPlayed() {
    when(stats.getTotalRoundsPlayed()).thenReturn(new AtomicInteger());
    statsService.incrementTotalRoundsPlayed();
    verify(this.stats, times(1))
        .getTotalRoundsPlayed();
  }

  @Test
  void incrementP2Wins() {
    when(stats.getTotalWinsP2()).thenReturn(new AtomicInteger());
    statsService.incrementP2Wins();
    verify(this.stats, times(1))
        .getTotalWinsP2();
  }

  @Test
  void incrementDraws() {
    when(stats.getTotalDraws()).thenReturn(new AtomicInteger());
    statsService.incrementDraws();
    verify(this.stats, times(1))
        .getTotalDraws();
  }

  @Test
  void incrementP1Wins() {
    when(stats.getTotalWinsP1()).thenReturn(new AtomicInteger());
    statsService.incrementP1Wins();
    verify(this.stats, times(1))
        .getTotalWinsP1();
  }
}
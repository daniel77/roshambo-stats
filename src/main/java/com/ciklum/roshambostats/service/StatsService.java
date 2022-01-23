package com.ciklum.roshambostats.service;

import com.ciklum.roshambostats.model.Stats;

public interface StatsService {
  void incrementTotalRoundsPlayed();

  void incrementP2Wins();

  void incrementDraws();

  void incrementP1Wins();

  Stats getStats();
}

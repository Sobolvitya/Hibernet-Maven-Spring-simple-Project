package com.vitya.service;

import com.vitya.model.Coach;
import com.vitya.model.Country;
import com.vitya.model.Player;
import com.vitya.model.Team;

import java.util.List;

/**
 * Created by Vitya on 30.05.2016.
 */
public interface FootballService {

    Team findById(int id);
    
    List<Team> findAllTeams();

    List<Coach> findAllCoachs();

    List<Country> findAllCountry();

    List<Team> findTeamTrainCoachById(int id);

    List<Player> findAllPlayers();

    List<Player> findPlayersByTeamId (int id);

}

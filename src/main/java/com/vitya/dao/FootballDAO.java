package com.vitya.dao;

import com.vitya.model.*;

import java.util.List;

/**
 * Created by Vitya on 29.05.2016.
 */
public interface FootballDAO {

    Team findTeamById(int id);

    Coach findCoachById(int id);

    Player findPlayerById(int id);

    Agent findAgentById(int id);

    List<Team> findAllTeams();

    List<Coach> findAllCoach();

    List<Team> findTeamTrainCoachById(int id);

    List<Player> findPlayersByTeamId(int id);

    List<Country> findAllCountry();

    List<Player> findAllPalyers();


}

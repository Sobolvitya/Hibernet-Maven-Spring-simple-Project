package com.vitya.service;


import com.vitya.dao.FootballDAO;
import com.vitya.model.Coach;
import com.vitya.model.Country;
import com.vitya.model.Player;
import com.vitya.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Vitya on 30.05.2016.
 */
@Service("footballService")
@Transactional
public class FootballServiceImpl implements FootballService {

    @Autowired
    private FootballDAO dao;


    public Team findById(int id) {
        return dao.findTeamById(id);
    }


    public List<Team> findAllTeams() {
        return dao.findAllTeams();
    }

    @Override
    public List<Coach> findAllCoachs() {
        return dao.findAllCoach();
    }

    @Override
    public List<Country> findAllCountry() {
        return dao.findAllCountry();
    }

    @Override
    public List<Team> findTeamTrainCoachById(int id) {
        return dao.findTeamTrainCoachById(id);
    }

    @Override
    public List<Player> findAllPlayers() {
        return dao.findAllPalyers();
    }

    @Override
    public List<Player> findPlayersByTeamId(int id) {
        return dao.findPlayersByTeamId(id);
    }
}

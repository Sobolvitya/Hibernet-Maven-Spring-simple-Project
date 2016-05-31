package com.vitya.dao;

import com.vitya.model.*;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Vitya on 30.05.2016.
 */

@Repository("footballDao")
public class FootballDAOIml extends AbstractDao<Integer> implements FootballDAO {
    @Override
    public Team findTeamById(int id) {
        return (Team) getSession().get(Team.class, id);
    }


    @Override
    public Coach findCoachById(int id) {
        return (Coach) getSession().get(Coach.class, id);
    }

    @Override
    public Player findPlayerById(int id) {
        return (Player) getSession().get(Player.class, id);
    }

    @Override
    public Agent findAgentById(int id) {
        return (Agent) getSession().get(Agent.class, id);
    }

    @Override
    public List<Team> findAllTeams() {
        Criteria criteria = getSession().createCriteria(Team.class );
        return (List<Team>) criteria.list();
    }

    @Override
    public List<Coach> findAllCoach() {
        Criteria criteria = getSession().createCriteria(Coach.class );
        return (List<Coach>) criteria.list();
    }

    @Override
    public List<Team> findTeamTrainCoachById(int id) {
        Criteria criteria = getSession().createCriteria(Team.class);
        criteria.add(Restrictions.like("id", id));
        return (List<Team>)criteria.list();
    }

    @Override
    public List<Player> findPlayersByTeamId(int id) {
        Criteria criteria = getSession().createCriteria(Player.class);
        criteria.add(Restrictions.like("team.id",id));
        return (List<Player>)criteria.list();
    }

    @Override
    public List<Country> findAllCountry() {
        Criteria criteria = getSession().createCriteria(Country.class );
        return (List<Country>) criteria.list();
    }

    @Override
    public List<Player> findAllPalyers() {
        Criteria criteria = getSession().createCriteria(Player.class );
        return (List<Player>) criteria.list();
    }
}

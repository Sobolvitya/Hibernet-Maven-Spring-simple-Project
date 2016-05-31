package com.vitya.controll;

/**
 * Created by Vitya on 28.05.2016.
 */

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import com.vitya.model.Coach;
import com.vitya.model.Country;
import com.vitya.model.Player;
import com.vitya.model.Team;
import com.vitya.service.FootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
@RequestMapping("/")
public class AppController {


   // EmployeeService service;
    @Autowired
    FootballService service;

    @Autowired
    MessageSource messageSource;



    @RequestMapping(value = { "/", "/listTeams" }, method = RequestMethod.GET)
    public String listTeams(ModelMap model) {

        List<Team> teams = service.findAllTeams();
        model.addAttribute("teams", teams);
        return "allteams";
    }

    @RequestMapping(value = { "/coachs", "/listCoachs" }, method = RequestMethod.GET)
    public String listCocah(ModelMap model) {

        List<Coach> coachs = service.findAllCoachs();
        model.addAttribute("coachs", coachs);
        return "allcoachs";
    }

    @RequestMapping(value = { "/findteam{id}"}, method = RequestMethod.GET)
    public String findTeamTrainCoachById(@PathVariable int id,ModelMap model) {

        List<Team> teams = service.findTeamTrainCoachById(id);
        model.addAttribute("teams", teams);
        return "allteams";
    }

    @RequestMapping(value = { "/findplayers{id}"}, method = RequestMethod.GET)
    public String findPlayersByTeamID(@PathVariable int id,ModelMap model) {

        List<Player> players = service.findPlayersByTeamId(id);
        model.addAttribute("players", players);
        return "allplayers";
    }


    @RequestMapping(value = { "/countrys", "/listCountry" }, method = RequestMethod.GET)
    public String listCountry(ModelMap model) {

        List<Country> countrys = service.findAllCountry();
        model.addAttribute("countrys", countrys);
        return "allcountry";
    }


    @RequestMapping(value = { "/players", "/listPlayers" }, method = RequestMethod.GET)
    public String findPlayers(ModelMap model) {

        List<Player> players = service.findAllPlayers();
        model.addAttribute("players", players);
        return "allplayers";
    }



}

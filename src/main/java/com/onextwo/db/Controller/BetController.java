package com.onextwo.db.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.onextwo.db.Entity.Bet;
import com.onextwo.db.Service.BetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BetController {

    @Autowired
    private BetService betService;

    @PostMapping("/addBet")
    public Bet postDetails(@RequestBody Bet bet) {
        return betService.saveDetails(bet);
    }

    @PostMapping("/addBets")
    public List<Bet> postListDetails(@RequestBody String bets) throws JsonProcessingException {
//        System.out.println(bets);
        return betService.saveListDetails(bets);
    }

}

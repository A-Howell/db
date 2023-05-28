package com.onextwo.db.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.onextwo.db.BetsHolder;
import com.onextwo.db.Entity.Bet;
import com.onextwo.db.Repository.BetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BetService {

    @Autowired
    private BetRepo betRepo;

    public Bet saveDetails(Bet bet) {
        return betRepo.save(bet);
    }

    public List<Bet> saveListDetails(String json) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        BetsHolder betsHolder = objectMapper.readValue(json, new TypeReference<BetsHolder>(){});
        System.out.println("This is a test " + betsHolder.getBets());

//        System.out.println(json);
//        List<Bet> bets = objectMapper.readValue(json, new TypeReference<List<Bet>>(){});


//        return null;
        return betRepo.saveAll(betsHolder.getBets());
    }

}

package com.onextwo.db;

import com.onextwo.db.Entity.Bet;

import java.util.ArrayList;
import java.util.List;

public class BetsHolder {

    private List<Bet> bets = new ArrayList<Bet>();

    public BetsHolder() {

    }

    public BetsHolder(List<Bet> bets) {
        this.bets = bets;
    }

    public List<Bet> getBets() {
        return bets;
    }

    public void setBetsList(List<Bet> bets) {
        this.bets = bets;
    }
}

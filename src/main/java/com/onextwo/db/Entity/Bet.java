package com.onextwo.db.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bet_DB")

public class Bet {
    public Bet() {

    }

    public Bet(int id, int numbets, String game, float stake, float returns, int clientid, String date) {
        this.id = id;
        this.numbets = numbets;
        this.game = game;
        this.stake = stake;
        this.returns = returns;
        this.clientid = clientid;
        this.date = date;
    }

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "NUMBETS")
    private int numbets;

    @Column(name = "GAME")
    private String game;

    @Column(name = "STAKE")
    private float stake;

    @Column(name = "RETURNS")
    private float returns;

    @Column(name = "CLIENTID")
    private int clientid;

    @Column(name = "DATE")
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumbets() {
        return numbets;
    }

    public void setNumbets(int numbets) {
        this.numbets = numbets;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public float getStake() {
        return stake;
    }

    public void setStake(float stake) {
        this.stake = stake;
    }

    public float getReturns() {
        return returns;
    }

    public void setReturns (float returns) {
        this.returns = returns;
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

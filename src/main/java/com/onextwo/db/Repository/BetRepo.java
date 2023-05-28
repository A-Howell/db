package com.onextwo.db.Repository;

import com.onextwo.db.Entity.Bet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BetRepo extends JpaRepository<Bet,Integer> {
}

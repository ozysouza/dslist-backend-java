package com.desouza.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.desouza.dslist.entities.Game;;

public interface GameRepository extends JpaRepository<Game, Long>{

}

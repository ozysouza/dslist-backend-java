package com.desouza.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.desouza.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

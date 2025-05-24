package com.desouza.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.desouza.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

    @Modifying
    @Query(value = """
            UPDATE tb_belonging SET position = :newPosition
            WHERE list_id = :listId AND game_id = :gameId
            """, nativeQuery = true)
    void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);

}

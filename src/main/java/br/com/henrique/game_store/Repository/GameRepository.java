package br.com.henrique.game_store.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.henrique.game_store.Model.Game;

public interface GameRepository extends CrudRepository<Game,Integer>{
    
}

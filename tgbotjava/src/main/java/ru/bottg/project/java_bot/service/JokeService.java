package ru.bottg.project.java_bot.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.bottg.project.java_bot.model.Joke;

import java.util.List;

public interface JokeService {

    Page<Joke> findAll(Pageable pageable);

    Joke getRandomJoke();

    Joke findById(Long id);

    Joke save(Joke joke);

    Joke update(Long id, Joke joke);

    void delete(Long id);

    List<Joke> getTopPopularJokes(int limit);
}
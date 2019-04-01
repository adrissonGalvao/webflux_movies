package br.com.webflux_movies.webflux_movies.repositoy

import br.com.webflux_movies.webflux_movies.model.Movie
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MovieRepository: ReactiveCrudRepository<Movie,String>
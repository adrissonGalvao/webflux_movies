package br.com.webflux_movies.webflux_movies

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebfluxMoviesApplication

fun main(args: Array<String>) {
	runApplication<WebfluxMoviesApplication>(*args)
}

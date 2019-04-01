package br.com.webflux_movies.webflux_movies.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Filme não encontrado!")
object NotFoundException : RuntimeException()
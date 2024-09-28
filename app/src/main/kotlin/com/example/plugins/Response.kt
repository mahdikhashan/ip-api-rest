package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.*

fun Application.configureResponse() {
  install(ContentNegotiation) {
    json(Json {
      prettyPrint = true
      isLenient = true
    })
  }
}

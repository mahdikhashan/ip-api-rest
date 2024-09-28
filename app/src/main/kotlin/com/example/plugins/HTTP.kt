package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.plugins.forwardedheaders.*
import io.ktor.server.response.*

fun Application.configureHTTP() {
  install(ForwardedHeaders)
  install(XForwardedHeaders)
}

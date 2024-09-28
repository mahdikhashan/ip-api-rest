package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.plugins.forwardedheaders.*

fun Application.configureHTTP() {
  install(ForwardedHeaders)
  install(XForwardedHeaders) {
    // get the first ip address
    useFirstProxy()
  }
}

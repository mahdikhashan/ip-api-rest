package com.example.routes

import io.ktor.server.application.*
import io.ktor.server.plugins.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getIPRoute() {
  get("/") {
    val remoteHost = call.request.local.remoteHost
    val serverHost = call.request.local.serverHost
    val originRemoteHost = call.request.origin.remoteHost
    val originServerHost = call.request.origin.serverHost
    call.respondText("remoteHost: $remoteHost, originRemoteHost: $originRemoteHost\n" +
        "serverHost: $serverHost, originServerHost: $originServerHost"
    )
  }
}

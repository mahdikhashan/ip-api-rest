package com.example.routes

import com.example.models.IPDTO
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getIPRoute() {
  get("/") {
    // https://stackoverflow.com/questions/67054276/how-to-get-client-ip-with-ktor
    val ip = call.request.origin.remoteAddress
    val ipResponse = IPDTO(ip)

    if (call.request.queryParameters["format"] == "json") {
      call.respond(ipResponse)
    }

    call.respondText(ip, ContentType.Any, HttpStatusCode(200, "Successful"))
  }
}

package com.example

import com.example.plugins.*
import io.ktor.server.application.*
import io.ktor.server.netty.EngineMain

fun main(args: Array<String>): Unit = EngineMain.main(args)

fun Application.module() {
  configureHTTP()
  configureMonitoring()
  configureRouting()
  configureResponse()
}

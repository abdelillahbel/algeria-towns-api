package dev.devunion

import dev.devunion.plugins.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureTemplating()
    configureSerialization()
    configureHTTP()
    configureSecurity()
    configureRouting()
}


fun Routing.configureRouting() {
    route("/algeria-towns") {
        get {
            val townsList = TOWNS.flatMap { it.split("\n") }
            call.respond(townsList)
        }
    }
}


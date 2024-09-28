val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
  application
  kotlin("jvm") version "2.0.20"
  kotlin("plugin.serialization") version "2.0.0"
  id("io.ktor.plugin") version "2.3.12"
}

application {
  mainClass.set("io.ktor.server.netty.EngineMain")
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("io.ktor:ktor-server-forwarded-header-jvm")
  implementation("io.ktor:ktor-server-call-logging-jvm")
  implementation("io.ktor:ktor-server-core-jvm")
  implementation("io.ktor:ktor-server-netty-jvm")
  implementation("ch.qos.logback:logback-classic:$logback_version")
  testImplementation("io.ktor:ktor-server-test-host-jvm")
  implementation("io.ktor:ktor-server-content-negotiation:$ktor_version")
  implementation("io.ktor:ktor-serialization-kotlinx-json:$ktor_version")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
}
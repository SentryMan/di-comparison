plugins {
    kotlin("jvm").version("2.3.0-Beta2")
    application
}

application {
    mainClass = "io.heapy.avaje.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.avaje:avaje-inject:12.5-RC1")
    annotationProcessor("io.avaje:avaje-inject-generator:12.5-RC1")
}

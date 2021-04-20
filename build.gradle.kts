/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    java
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("org.slf4j:slf4j-api:1.7.30")
    implementation("org.apache.logging.log4j:log4j-api:2.11.0")
    implementation("org.apache.logging.log4j:log4j-core:2.13.2")
    implementation("com.microsoft.bot:bot-integration-spring:4.6.0-preview8")
    implementation ("org.postgresql:postgresql:42.2.10")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.4.0")
    runtimeOnly("com.h2database:h2")
    testImplementation("junit:junit:4.13.1")
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.4.0")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.7.0")
}

group = "io.swcode.teams.bot"
version = "1.0.0"
description = "io.swcode.teams.bot:mrkrabs"
java.sourceCompatibility = JavaVersion.VERSION_1_8

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

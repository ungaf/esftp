plugins {
    kotlin("jvm") version "1.8.0"
    `java-library`
}

group = "me.leepsky"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.sshd:sshd-core:2.9.0")
    implementation("org.apache.sshd:sshd-sftp:2.9.0")
    implementation("com.github.marschall:memoryfilesystem:2.5.0")
    implementation("org.slf4j:slf4j-api:1.6.1")
    implementation("org.slf4j:slf4j-simple:1.6.1")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

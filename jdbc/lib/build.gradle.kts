plugins {
    `java-library`
  
}

repositories {
    mavenCentral()
}

dependencies {
    // JUnit
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.10.2")

    // Apache Commons Math3
    api("org.apache.commons:commons-math3:3.6.1")

    // Guava
    implementation("com.google.guava:guava:32.1.2-jre")

    // MySQL + Flyway
    implementation("com.mysql:mysql-connector-j:8.3.0")
    implementation("org.flywaydb:flyway-core:10.11.1")
    implementation("org.flywaydb:flyway-mysql:10.11.1")

    // Lombok
    compileOnly("org.projectlombok:lombok:1.18.32")
    annotationProcessor("org.projectlombok:lombok:1.18.32")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
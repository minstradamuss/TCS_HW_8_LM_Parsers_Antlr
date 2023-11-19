plugins {
    id("java")
    kotlin("jvm") version "1.9.0"
    antlr
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.antlr:antlr4-runtime:4.13.1")
    antlr("org.antlr:antlr4:4.13.1")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}


tasks.getByName("compileKotlin").dependsOn("generateGrammarSource")
tasks.getByName("compileTestKotlin").dependsOn("generateTestGrammarSource")

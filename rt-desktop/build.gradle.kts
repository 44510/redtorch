plugins {
    id("application")
    id("org.openjfx.javafxplugin") version "0.0.13"
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

javafx {
    version = "16"
    modules = listOf("javafx.controls", "javafx.fxml")
}

application {
    mainClass.set("xyz.redtorch.desktop.RedTorchDesktopApplicationKt")
}

dependencies {
    implementation(project(":rt-common"))

    implementation("org.springframework.boot:spring-boot-starter-undertow")
    implementation("org.springframework.boot:spring-boot-starter-websocket") {
        exclude("org.springframework.boot","spring-boot-starter-tomcat")
    }
    implementation("org.apache.zookeeper:zookeeper:${rootProject.extra.get("zookeeperVersion")}")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
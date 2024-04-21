plugins {
    kotlin("multiplatform") version "1.9.23"
}

group = "com.yt8492"
version = "1.0.0"

repositories {
    mavenCentral()
}

kotlin {
    js {
        browser {
            webpackTask {
                cssSupport {
                    enabled.set(true)
                }
                mainOutputFileName.set("main.js")
            }
            runTask {
                cssSupport {
                    enabled.set(true)
                }
                mainOutputFileName.set("main.js")
            }
            binaries.executable()
        }
    }

    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
    }
}

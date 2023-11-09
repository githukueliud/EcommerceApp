
buildscript {

    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }

    }
    dependencies {
        classpath ("com.android.tools.build:gradle:7.0.3")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        classpath ("com.google.gms:google-services:4.4.0")
        //safe args

        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.0")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.38.1")
    }
}




// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}


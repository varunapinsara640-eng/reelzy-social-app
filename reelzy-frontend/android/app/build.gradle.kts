plugins {
    id("com.android.application")
    // START: FlutterFire Configuration
    id("com.google.gms.google-services")
    // END: FlutterFire Configuration
    id("kotlin-android")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.shorts_app"
    compileSdk = 36 // Plugins වලට අවශ්‍ය පරිදි SDK 36 දක්වා වැඩි කළා
    ndkVersion = flutter.ndkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17 // Java target එක 17 දක්වා වැඩි කළා
        targetCompatibility = JavaVersion.VERSION_17
        isCoreLibraryDesugaringEnabled = true
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString() // Kotlin JVM target එකත් 17 කළා
    }

    defaultConfig {
        // TODO: Specify your own unique Application ID (https://android.com).
        applicationId = "com.example.shorts_app"
        // You can update the following values to match your application needs.
        // For more information, see: https://flutter.dev.
        minSdk = flutter.minSdkVersion
        targetSdk = 36 // Target SDK එක 36 ලෙස වෙනස් කළා
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        release {
            // TODO: Add your own signing config for the release build.
            // Signing with the debug keys for now, so `flutter run --release` works.
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

dependencies {
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.1.4")
}

flutter {
    source = "../.."
}

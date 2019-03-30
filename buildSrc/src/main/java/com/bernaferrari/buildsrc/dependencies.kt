package com.bernaferrari.buildsrc

object Versions {
    val ktlint = "0.29.0"
}

object Android {
    val minSdk = 21
    val targetSdk = 28
    val compileSdk = 28
    val versionCode = 1
    val versionName = "0.1"
}

object Libs {
    val androidGradlePlugin = "com.android.tools.build:gradle:3.5.0-alpha09"
    val dexcountGradlePlugin = "com.getkeepsafe.dexcount:dexcount-gradle-plugin:0.8.6"
    val playPublisherPlugin = "com.github.triplet.gradle:play-publisher:2.1.0"

    val mvRx = "com.airbnb.android:mvrx:0.7.2"

    val threeTenAndroid = "com.jakewharton.threetenabp:threetenabp:1.2.0"

    val gravitySnapHelper = "com.github.rubensousa:gravitysnaphelper:2.0"

    val materialDialogs = "com.afollestad.material-dialogs:core:2.6.0"
    val jsEvaluator = "com.github.evgenyneu:js-evaluator-for-android:5.0.0"
    val logger = "com.orhanobut:logger:2.2.0"
    val okHttp = "com.squareup.okhttp3:okhttp:3.14.0"

    val rxLint = "nl.littlerobots.rxlint:rxlint:1.7.3"
    val jsoup = "org.jsoup:jsoup:1.11.3"

    val timber = "com.jakewharton.timber:timber:4.7.1"

    val stetho = "com.facebook.stetho:stetho:1.5.0"

    val tmdbJava = "com.uwetrottmann.tmdb2:tmdb-java:2.0.1"

    val appauth = "net.openid:appauth:0.7.1"

    val junit = "junit:junit:4.12"
    val robolectric = "org.robolectric:robolectric:4.2"
    val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:2.1.0"

    val discreteScrollView = "com.yarolegovich:discrete-scrollview:1.4.9"

    object Google {
        val material = "com.google.android.material:material:1.1.0-alpha04"
        val firebaseCore = "com.google.firebase:firebase-core:16.0.7"
        val crashlytics = "com.crashlytics.sdk.android:crashlytics:2.9.9"
        val firebaseFirestore = "com.google.firebase:firebase-firestore:17.1.5"
        val gmsGoogleServices = "com.google.gms:google-services:4.2.0"
        val fabricPlugin = "io.fabric.tools:gradle:1.27.1"
    }

    object Kotlin {
        private const val version = "1.3.21"
        val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:$version"
        val reflect = "org.jetbrains.kotlin:kotlin-reflect:$version"
        val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
    }

    object Coroutines {
        private const val version = "1.1.1"
        val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        val rx2 = "org.jetbrains.kotlinx:kotlinx-coroutines-rx2:$version"
        val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
    }

    object AndroidX {
        val appcompat = "androidx.appcompat:appcompat:1.0.2"
        val browser = "androidx.browser:browser:1.0.0"
        val webkit = "androidx.webkit:webkit:1.0.0"
        val palette = "androidx.palette:palette:1.0.0"
        val recyclerview = "androidx.recyclerview:recyclerview:1.0.0"
        val emoji = "androidx.emoji:emoji:1.0.0"
        val media = "androidx.media:media:1.0.1"
        val dynamicAnimation = "androidx.dynamicanimation:dynamicanimation:1.0.0"

        object Navigation {
            private const val version = "2.0.0"
            val navigationUi = "androidx.navigation:navigation-ui-ktx:$version"
            val navigationFragment = "androidx.navigation:navigation-fragment-ktx:$version"
        }

        object Fragment {
            private const val version = "1.0.0"
            val fragment = "androidx.fragment:fragment:$version"
            val fragmentKtx = "androidx.fragment:fragment-ktx:$version"
        }

        object Test {
            val core = "androidx.test:core:1.1.0"
            val runner = "androidx.test:runner:1.1.1"
            val rules = "androidx.test:rules:1.1.1"

            val espressoCore = "androidx.test.espresso:espresso-core:3.1.1"
        }

        val archCoreTesting = "androidx.arch.core:core-testing:2.0.0"

        object Paging {
            private const val version = "2.1.0"
            val common = "androidx.paging:paging-common:$version"
            val runtime = "androidx.paging:paging-runtime:$version"
            val runtimeKtx = "androidx.paging:paging-runtime-ktx:$version"
            val rxjava2 = "androidx.paging:paging-rxjava2:$version"
        }

        val preference = "androidx.preference:preference:1.1.0-alpha04"

        val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.0-alpha3"

        val coreKtx = "androidx.core:core-ktx:1.0.1"

        object Lifecycle {
            private const val version = "2.0.0"
            val extensions = "androidx.lifecycle:lifecycle-extensions:$version"
            val reactive = "androidx.lifecycle:lifecycle-reactivestreams:$version"
            val compiler = "androidx.lifecycle:lifecycle-compiler:$version"
        }

        object Room {
            private const val version = "2.1.0-alpha05"
            val common = "androidx.room:room-common:$version"
            val runtime = "androidx.room:room-runtime:$version"
            val roomktx = "androidx.room:room-ktx:$version"
            val rxjava2 = "androidx.room:room-rxjava2:$version"
            val compiler = "androidx.room:room-compiler:$version"
        }

        object Work {
            private const val version = "2.0.0"
            val runtimeKtx = "androidx.work:work-runtime-ktx:$version"
        }
    }

    object RxJava {
        val rxJava = "io.reactivex.rxjava2:rxjava:2.2.8"
        val rxKotlin = "io.reactivex.rxjava2:rxkotlin:2.3.0"
        val rxAndroid = "io.reactivex.rxjava2:rxandroid:2.1.1"
        val rxRelay = "com.jakewharton.rxrelay2:rxrelay:2.1.0"
        val rxkPrefs = "com.afollestad:rxkprefs:1.2.5"
    }

    object Dagger {
        private const val version = "2.21"
        val dagger = "com.google.dagger:dagger:$version"
        val androidSupport = "com.google.dagger:dagger-android-support:$version"
        val compiler = "com.google.dagger:dagger-compiler:$version"
        val androidProcessor = "com.google.dagger:dagger-android-processor:$version"
    }

    object Glide {
        private const val version = "4.9.0"
        val glide = "com.github.bumptech.glide:glide:$version"
        val compiler = "com.github.bumptech.glide:compiler:$version"
    }

    object Retrofit {
        private const val version = "2.5.0"
        val retrofit = "com.squareup.retrofit2:retrofit:$version"
        val retrofit_rxjava_adapter = "com.squareup.retrofit2:adapter-rxjava2:$version"
        val gsonConverter = "com.squareup.retrofit2:converter-gson:$version"
    }

    object OkHttp {
        val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:3.13.1"
    }

    object Epoxy {
        private const val version = "3.3.0"
        val epoxy = "com.airbnb.android:epoxy:$version"
        val paging = "com.airbnb.android:epoxy-paging:$version"
        val dataBinding = "com.airbnb.android:epoxy-databinding:$version"
        val processor = "com.airbnb.android:epoxy-processor:$version"
    }

    object AssistedInject {
        private const val version = "0.3.2"
        val annotationDagger2 = "com.squareup.inject:assisted-inject-annotations-dagger2:$version"
        val processorDagger2 = "com.squareup.inject:assisted-inject-processor-dagger2:$version"
    }
}

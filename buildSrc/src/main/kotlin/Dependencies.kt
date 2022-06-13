object Dependencies {

    private const val NAV_VERSION = "2.4.2"
    private const val RETROFIT_VERSION = "2.9.0"
    private const val MOSHI_VERSION = "1.13.0"
    private const val KOIN_VERSION = "3.2.0"
    private const val ESPRESSO_VERSION = "3.4.0"
    const val DETEKT_VERSION = "1.20.0"

    object AndroidX {
        const val CORE_KTX = "androidx.core:core-ktx:1.8.0"
        const val APP_COMPAT = "androidx.appcompat:appcompat:1.4.2"
        const val NAV_FRAGMENT_KTX = "androidx.navigation:navigation-fragment-ktx:$NAV_VERSION"
        const val NAV_UI_KTX = "androidx.navigation:navigation-ui-ktx:$NAV_VERSION"
        const val ESPRESSO_IDLING = "androidx.test.espresso:espresso-idling-resource:$ESPRESSO_VERSION"
    }

    object UI {
        const val MATERIAL_DESIGN = "com.google.android.material:material:1.6.1"
    }

    object DI {
        const val KOIN = "io.insert-koin:koin-android:$KOIN_VERSION"
    }

    object DataSource {
        const val RETROFIT = "com.squareup.retrofit2:retrofit:$RETROFIT_VERSION"
        const val RETROFIT_CONVERTER = "com.squareup.retrofit2:converter-moshi:$RETROFIT_VERSION"
        const val RETRO_MOCK = "co.infinum:retromock:1.1.1"
        const val MOSHI = "com.squareup.moshi:moshi:$MOSHI_VERSION"
        const val MOSHI_KOTLIN = "com.squareup.moshi:moshi-kotlin:$MOSHI_VERSION"
        const val MOSHI_KOTLIN_CODEGEN = "com.squareup.moshi:moshi-kotlin-codegen:$MOSHI_VERSION"
    }

    object UnitTest {
        const val KOIN = "io.insert-koin:koin-test:$KOIN_VERSION"
        const val JUNIT = "junit:junit:4.13.2"
        const val ROBOLECTRIC = "org.robolectric:robolectric:4.8.1"
        const val CORE_KTX = "androidx.test:core-ktx:1.4.0"
        const val CORE_TESTING = "androidx.arch.core:core-testing:2.1.0"
        const val ANDROID_EXT_JUNIT = "androidx.test.ext:junit-ktx:1.1.3"
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:$ESPRESSO_VERSION"
        const val ESPRESSO_INTENTS = "androidx.test.espresso:espresso-intents:$ESPRESSO_VERSION"
        const val MOCKK = "io.mockk:mockk:1.12.3"
        const val MOCK_WEB_SERVER = "com.squareup.okhttp3:mockwebserver:4.9.3"
        const val COROUTINES_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.2"
    }

    object Classpath {
        const val GRADLE = "com.android.tools.build:gradle:7.2.1"
        const val KOTLIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.0"
        const val NAVIGATION = "androidx.navigation:navigation-safe-args-gradle-plugin:$NAV_VERSION"
        const val DETEKT = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:$DETEKT_VERSION"
        const val KTLINT = "org.jlleitschuh.gradle:ktlint-gradle:10.3.0"
        const val KOVER = "org.jetbrains.kotlinx:kover:0.5.0"
    }

    object Plugin {
        const val DETEKT = "io.gitlab.arturbosch.detekt"
        const val KTLINT = "org.jlleitschuh.gradle.ktlint"
    }
}

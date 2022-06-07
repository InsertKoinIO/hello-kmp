
object Versions {
    const val koin = "3.2.0"
    const val koinAnnotaions = "1.0.0-beta-3"
}

object Deps {

    object Koin {
        const val core = "io.insert-koin:koin-core:${Versions.koin}"
        const val test = "io.insert-koin:koin-test:${Versions.koin}"
        const val android = "io.insert-koin:koin-android:${Versions.koin}"
        const val annotations = "io.insert-koin:koin-annotations:${Versions.koinAnnotaions}"
        const val kspCompiler = "io.insert-koin:koin-ksp-compiler:${Versions.koinAnnotaions}"
    }
}

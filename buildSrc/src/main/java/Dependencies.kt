
object Versions {
    const val koin = "3.4.3"
    const val koinAnnotations = "1.2.2"
}

object Deps {

    object Koin {
        const val core = "io.insert-koin:koin-core:${Versions.koin}"
        const val test = "io.insert-koin:koin-test:${Versions.koin}"
        const val android = "io.insert-koin:koin-android:${Versions.koin}"
        const val annotations = "io.insert-koin:koin-annotations:${Versions.koinAnnotations}"
        const val kspCompiler = "io.insert-koin:koin-ksp-compiler:${Versions.koinAnnotations}"
    }
}

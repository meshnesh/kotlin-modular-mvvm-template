package dependencies

/**
 * Project annotation processor dependencies, makes it easy to include external binaries or
 * other library modules to build.
 */
object AnnotationProcessorsDependencies {
    const val DAGGER_COMPILER = "com.google.dagger:dagger-compiler:${BuildDependenciesVersions.DAGGER}"
    const val DAGGER_ANDROID_PROCESSOR = "com.google.dagger:dagger-android-processor:${BuildDependenciesVersions.DAGGER}"
    const val DATABINDING = "com.android.databinding:compiler:${BuildDependenciesVersions.DATA_BINDING}"
    const val ROOM = "androidx.room:room-compiler:${BuildDependenciesVersions.ROOM}"
    const val AUTO_SERVICE = "com.google.auto.service:auto-service:${BuildDependenciesVersions.AUTO_SERVICE}"
}

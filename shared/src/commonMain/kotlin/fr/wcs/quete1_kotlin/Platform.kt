package fr.wcs.quete1_kotlin

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
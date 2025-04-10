package com.stewemetal.cmppreviews

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
package com.harbourspace.unsplash.ui.data

data class UnsplashSearch(
    val results: List<UnsplashItem>,
    val total: Int,
    val total_pages: Int
)
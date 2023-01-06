package com.fuh.newsapp.presentation.home

sealed class HomeScreenSideEvent {
    object GetHeadlines : HomeScreenSideEvent()
}
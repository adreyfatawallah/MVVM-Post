package com.example.adrey.mvvmposts.base

import android.arch.lifecycle.ViewModel
import com.example.adrey.mvvmposts.injection.component.DaggerViewModelInjector
import com.example.adrey.mvvmposts.injection.component.ViewModelInjector
import com.example.adrey.mvvmposts.injection.module.NetworkModule
import com.example.adrey.mvvmposts.ui.post.PostListViewModel

abstract class BaseViewModel : ViewModel() {

    private val injector: ViewModelInjector = DaggerViewModelInjector
            .builder()
            .networkModule(NetworkModule)
            .build()

    init {
        inject()
    }

    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}
package com.example.auth.core.base

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel : ViewModel() {
    val compositeDisposable = CompositeDisposable()
    
    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }
}
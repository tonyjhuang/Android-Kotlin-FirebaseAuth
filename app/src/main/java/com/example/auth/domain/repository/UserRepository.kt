package com.example.auth.domain.repository

import com.google.firebase.auth.FirebaseUser
import io.reactivex.Completable

interface UserRepository {
    fun login(email: String, password: String): Completable
    
    fun createAccount(email: String, password: String): Completable
    
    fun currentUser(): FirebaseUser?
}
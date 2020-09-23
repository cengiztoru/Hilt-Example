package com.tsoftmobile.hiltexample.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.tsoftmobile.hiltexample.data.model.User


/**
 * Created by Cengiz TORU on 22/09/2020.
 * cengiz.toru@tsoft.com.tr
 */
class MainViewModel @ViewModelInject constructor(private val repository: MainRepository) :
    ViewModel() {
    fun getUsers(): LiveData<List<User>> {
        return repository.getUsers()
    }

}
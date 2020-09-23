package com.tsoftmobile.hiltexample.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.tsoftmobile.hiltexample.data.model.User
import com.tsoftmobile.hiltexample.util.SharedHelper
import javax.inject.Inject


/**
 * Created by Cengiz TORU on 22/09/2020.
 * cengiz.toru@tsoft.com.tr
 */
class MainRepository @Inject constructor(private val sharedHelper: SharedHelper) {

    /**
     * For example MainRepository need an instance of SharedPreferences or
     * a retrofit instance.
     * */

    fun getUsers(): LiveData<List<User>> {

        /** you can use incoming instance like below*/
//        sharedHelper.getString(key,"defaultValue")

        /** For simple example I'll use mock data 👍 */
        val users = ArrayList<User>()
        users.add(User(1, "Tsoft", "Mobile", 17))
        users.add(User(2, "Tsoft", "Mobile", 17))
        users.add(User(3, "Tsoft", "Mobile", 17))
        users.add(User(4, "Tsoft", "Mobile", 17))
        users.add(User(5, "Tsoft", "Mobile", 17))
        users.add(User(6, "Tsoft", "Mobile", 17))
        users.add(User(7, "Tsoft", "Mobile", 17))
        users.add(User(8, "Tsoft", "Mobile", 17))
        users.add(User(9, "Tsoft", "Mobile", 17))
        users.add(User(10, "Tsoft", "Mobile", 17))

        val liveData = MutableLiveData<List<User>>()
        liveData.postValue(users)
        return liveData
    }
}
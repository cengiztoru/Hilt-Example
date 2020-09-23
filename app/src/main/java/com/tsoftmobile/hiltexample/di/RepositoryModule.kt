package com.tsoftmobile.hiltexample.di

import android.content.Context
import com.tsoftmobile.hiltexample.ui.main.MainRepository
import com.tsoftmobile.hiltexample.util.SharedHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext


/**
 * Created by Cengiz TORU on 22/09/2020.
 * cengiz.toru@tsoft.com.tr
 */

/**
 * This class is HiltModule class. This class responsible to providing dependecies for repositories
 * */
@InstallIn(ApplicationComponent::class)
@Module
object RepositoryModule {

    //Injecting pre-defined context to SharedHelper Class
    @Provides
    fun providesSharedHelper(@ApplicationContext context: Context) = SharedHelper(context)

    @Provides
    fun providesMainRepository(sharedHelper: SharedHelper) = MainRepository(sharedHelper)

}
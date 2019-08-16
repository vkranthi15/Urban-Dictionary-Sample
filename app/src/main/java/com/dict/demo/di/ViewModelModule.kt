package com.dict.demo.di

import android.arch.lifecycle.ViewModel
import com.dict.demo.ui.dictionary.NewsListViewModel
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import kotlin.reflect.KClass

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
internal annotation class ViewModelKey(val value: KClass<out ViewModel>)

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(NewsListViewModel::class)
    abstract fun bindCryptoListViewModel(viewModel: NewsListViewModel) : ViewModel
}
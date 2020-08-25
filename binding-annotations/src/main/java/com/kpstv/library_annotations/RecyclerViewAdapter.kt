package com.kpstv.library_annotations

import androidx.annotation.LayoutRes
import kotlin.reflect.KClass

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class RecyclerViewAdapter(@LayoutRes val layoutId: Int, val dataSetType: KClass<*> = Any::class)
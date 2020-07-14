package com.example.mybutterknife

import android.app.Activity

object Binding {
    fun bind(activity: Activity){
        activity.javaClass.declaredFields.forEach {
            val annotation = it.getAnnotation(BindView::class.java)
            if (annotation != null) {
                it.isAccessible = true
                it.set(activity, activity.findViewById(annotation.value))
                it.isAccessible = false
            }
        }
    }
}
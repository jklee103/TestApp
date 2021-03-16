package com.example.architecterapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var sharedPreferences: SharedPreferences

    @Inject
    lateinit var activityName:String

    private lateinit var component: MainActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        component = (application as App).getAppComponent()
            .mainActivityComponentBuilder()
            .setModule(MainActivityModule())
            .setActivity(this)
            .build()
        component.inject(this)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, MainFragment())
            .commit()
    }
    fun getComponent(): MainActivityComponent{
        return component
    }
}
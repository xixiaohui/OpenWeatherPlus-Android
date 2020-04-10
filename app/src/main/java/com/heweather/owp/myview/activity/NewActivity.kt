package com.heweather.owp.myview.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.heweather.owp.databinding.ActivityNewBinding
import com.heweather.owp.view.activity.SplashActivity

class NewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_new)

        binding = ActivityNewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            startActivity(Intent(this, SplashActivity::class.java))
        }
    }


}

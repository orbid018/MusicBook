package com.example.musicbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.musicbook.databinding.ActivityMainBinding
import com.example.musicbook.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySubBinding
    private lateinit var title: TitleFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.jennybutton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container, jennyFragment())
                addToBackStack(null)
                commit()
            }
        }
        binding.zisubutton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container, zisuFragment())
                addToBackStack(null)
                commit()
            }
        }
        binding.rozebutton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container, rozeFragment())
                addToBackStack(null)
                commit()
            }
        }
        binding.lisabutton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container, lisaFragment())
                addToBackStack(null)
                commit()
            }
        }

    }
}
package com.example.calculatorlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculatorlayout.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity(){
    private lateinit var binding : ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
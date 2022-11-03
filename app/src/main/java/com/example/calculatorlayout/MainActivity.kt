package com.example.calculatorlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.example.calculatorlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var counter=0
        var step=1
        var incrementMessage = Toast.makeText(applicationContext, "", Toast.LENGTH_SHORT)
        var decrementMessage = Toast.makeText(applicationContext, "", Toast.LENGTH_SHORT)

        binding.incrementButton.setOnClickListener{
            counter += step
            decrementMessage.cancel()
            incrementMessage.cancel()
            incrementMessage = Toast.makeText(applicationContext, counter.toString() + " + " + step + " = " + counter, Toast.LENGTH_SHORT)
            binding.counter.text = counter.toString()
            incrementMessage.show()
        }
        binding.decrementButton.setOnClickListener{
            counter -= step
            incrementMessage.cancel()
            decrementMessage.cancel()
            decrementMessage = Toast.makeText(applicationContext, counter.toString() + " - " + step + " = " + counter, Toast.LENGTH_SHORT)
            binding.counter.text = counter.toString()
            decrementMessage.show()

        }

        binding.counterStep.addTextChangedListener{
            if(binding.counterStep.text.isEmpty()){
                step = 1
            }else{
                step = binding.counterStep.text.toString().toInt()
            }
        }
    }
}
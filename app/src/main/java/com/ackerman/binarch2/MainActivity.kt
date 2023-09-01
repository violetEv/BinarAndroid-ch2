package com.ackerman.binarch2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.ackerman.binarch2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // private var tvHelloWorld : TextView? = null

    //1. Declare binding and initiate as lazy
    private var binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //2. change layout name into binding root
        setContentView(binding.root)
        setTextHello()
    }

    private fun setTextHello() {
        // Old way

        //tvHelloWorld = findViewById(R.id.tv_hello_world)
        //tvHelloWorld?.text = "text text text" // Setter
        //Toast.makeText(this, tvHelloWorld?.text, Toast.LENGTH_SHORT).show() //getter

        //View binding
        binding.tvHelloWorld.text = "text text text"

        //context in android
        // Application context -> whole app context
        // Activity context -> Di activity mana
    }
}

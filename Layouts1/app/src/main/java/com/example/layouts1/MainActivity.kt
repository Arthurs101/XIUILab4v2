package com.example.layouts1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.layouts1.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Calculate.setOnClickListener{ calculateTip() }
    }
    fun calculateTip () { //calcular la propina
        val stringInTextField = binding.costOfService.text.toString()
        val cost = stringInTextField.toDouble()
        val selectedId = binding.TipsGroup.checkedRadioButtonId
        val tipPercentage = when (selectedId) { //obtener la opción de servicio escogida
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15
        }
        var tip = tipPercentage * cost
        val roundUp = binding.RoundSwitch.isChecked  //verificar si está activada la opción de redondeo
        if (roundUp) {
            tip = kotlin.math.ceil(tip)
        }
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip) //darle formato de moneda, por ejemplo $20.00
        binding.messenger.text = getString(R.string.propina) + formattedTip//mostrar el resultado
    }
}
package com.pedroesparrago.androidmastercurso.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.pedroesparrago.androidmastercurso.R
import com.pedroesparrago.androidmastercurso.imccalculator.ImcCalculatorActivity.Companion.IMC_KEY

class RersultIMCActivity : AppCompatActivity() {

    private lateinit var tvResult:TextView
    private lateinit var tvIMC:TextView
    private lateinit var tvDescription:TextView
    private lateinit var btnRecalculate:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rersult_imcactivity)

        val result = intent.extras?.getFloat(IMC_KEY) ?: -1.0

        initComponents()
        initUI(result as Float)
        initListeners()
    }

    private fun initListeners() {
        btnRecalculate.setOnClickListener { onBackPressed() }
    }

    private fun initUI(result: Float) {
        tvIMC.text = result.toString()
        when(result){
            in 0.00..18.50 ->{  //Bajo peso
                tvResult.text = getString(R.string.tittle_bajo_peso)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_bajo))
                tvDescription.text = getString(R.string.descrition_bajo_peso)
            }
            in 18.51..24.99 ->{ //Peso normal
                tvResult.text = getString(R.string.tittle_peso_normal)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_normal))
                tvDescription.text = getString(R.string.descrition_peso_normal)
            }
            in 25.00..29.99 ->{ //Sobrepeso
                tvResult.text = getString(R.string.tittle_sobrepeso)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.sobrepeso))
                tvDescription.text = getString(R.string.descrition_sobrepeso)
            }
            in 30.00..99.00 ->{ //Obesidad
                tvResult.text = getString(R.string.tittle_obecidad)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.obesidad))
                tvDescription.text = getString(R.string.descrition_obecidad)
            }
            else ->{ //error
                tvIMC.text = getString(R.string.error)
                tvResult.text = getString(R.string.error)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.obesidad))
                tvDescription.text = getString(R.string.error)
            }
        }
    }

    private fun initComponents(){
        tvIMC = findViewById(R.id.tvIMC)
        tvResult = findViewById(R.id.tvResult)
        tvDescription = findViewById(R.id.tvDescription)
        btnRecalculate = findViewById(R.id.btnRecalculate)
    }
}
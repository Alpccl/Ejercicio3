package com.example.ejercicio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.Toast
import com.example.ejercicio3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.Btone.setOnClickListener {
            binding.textView.text = ordenarpalabras().toString()
        }

        binding.Bttwo.setOnClickListener {
            binding.textView.text = eliminarnull().toString()
        }

        binding.Bttrhree.setOnClickListener {
            binding.textView.text = ordenarmap().toString()
        }
    }
    fun ordenarpalabras():List<String>{
        val orden = numberList.filter { x -> x.length >3 }
        return orden
    }

    fun eliminarnull(): List<Any?> {
        val eliminar = listainstanciada.filter {x -> x != null}
        return eliminar
    }

    fun ordenarmap(): List<Int> {
        val multiplicar = mapanumeros.map{it.value * 2}
        return multiplicar
    }

    private val numberList = listOf("uno", "cinco", "dos", "tres", "cuatro")
    private val listainstanciada = listOf(null, 1, "dos", 3.0, "cuatro")
    private val mapanumeros = mapOf("key1" to 1, "key2" to 2, "key 3" to 3, "key11" to 11)
    private val listadesordenada = listOf(7, 8, 5, 3, 2, 4)

}
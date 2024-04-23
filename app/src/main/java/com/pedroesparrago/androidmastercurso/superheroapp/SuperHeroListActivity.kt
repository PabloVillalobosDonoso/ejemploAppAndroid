 package com.pedroesparrago.androidmastercurso.superheroapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.pedroesparrago.androidmastercurso.R
import com.pedroesparrago.androidmastercurso.databinding.ActivityFirstAppBinding
import com.pedroesparrago.androidmastercurso.databinding.ActivitySuperHeroListBinding
import com.pedroesparrago.androidmastercurso.superheroapp.DetailSuperheroActivity.Companion.EXTRA_ID
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.gson.GsonConverterFactory.*

 class SuperHeroListActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySuperHeroListBinding
    private lateinit var retrofit: Retrofit

    private lateinit var adapter: SuperheroAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //poner binding antes del setContentView
        binding = ActivitySuperHeroListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        retrofit = getRetrofit()
        initUI()
    }

     private fun initUI() {
         binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener
         {
             override fun onQueryTextSubmit(query: String?): Boolean {
                 searchByName(query.orEmpty())
                 return false
             }

             override fun onQueryTextChange(newText: String?): Boolean {
                 return false
             }
         })

         adapter = SuperheroAdapter{ superheroId -> navigateToDetail(superheroId)}
         binding.rvSuperhero.setHasFixedSize(true)
         binding.rvSuperhero.layoutManager = LinearLayoutManager(this)
         binding.rvSuperhero.adapter = adapter
     }

     private fun searchByName(query: String) {
         binding.progressBar.isVisible = true
        CoroutineScope(Dispatchers.IO).launch {
            val myResponse: Response<SuperheroDataResponse> = retrofit.create(ApiService::class.java).getSuperheroes(query)
            if (myResponse.isSuccessful){
                Log.i("PedroEsparrago", "funciona")
                val response: SuperheroDataResponse? = myResponse.body()
                if(response != null){
                    Log.i("PedroEsparrago", response.toString())
                    runOnUiThread {
                        adapter.updateList(response.superheroes)
                        binding.progressBar.isVisible = false
                    }
                }
            }else{
                Log.i("PedroEsparrago","No funciona")
            }
        }
     }

     private fun getRetrofit(): Retrofit {
         return Retrofit
                .Builder()
                .baseUrl("https://superheroapi.com/")
                .addConverterFactory(create())
                .build()
     }

     private fun navigateToDetail(id:String){
         val intent = Intent(this,DetailSuperheroActivity::class.java)
         intent.putExtra(EXTRA_ID,id)
         startActivity(intent)
     }
 }
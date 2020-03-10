package com.amartadev.androidpemulanaruto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvNaruto: RecyclerView
    private var list: ArrayList<Naruto> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        actionBar!!.title = "Home"

        rvNaruto = findViewById(R.id.rv_naruto)
        rvNaruto.setHasFixedSize(true)

        list.addAll(NarutoData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvNaruto.layoutManager = LinearLayoutManager(this)
        val listNarutoAdapter = ListNarutoAdapter(list)
        rvNaruto.adapter = listNarutoAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
       menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedItem: Int) {
        when(selectedItem){
            R.id.about ->{
                val about = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(about)
            }
        }
    }
}

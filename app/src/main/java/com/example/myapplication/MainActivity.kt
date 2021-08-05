package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.*

class MainActivity : AppCompatActivity() {
    private lateinit var rvLinux: RecyclerView
    private var list: ArrayList<Linux> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        actionbar!!.title= "Home"

        rvLinux = findViewById(R.id.rv_linux)
        rvLinux.setHasFixedSize(true)

        list.addAll(LinuxData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvLinux.layoutManager = LinearLayoutManager(this)
        val listLinuxAdapter = ListLinuxAdapter(list)
        rvLinux.adapter = listLinuxAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.menu -> {
                val about = Intent(this@MainActivity, AboutMe::class.java)
                startActivity(about)
            }
        }
    }
}

package com.kel10.testkotln

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.optionmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.about -> {
                val i = Intent(this, AboutActivity::class.java)
                this.startActivity(i)
                return true
            }
            R.id.setting -> {
                val i = Intent(this, SettingActivity::class.java)
                this.startActivity(i)
                return true
            }
            R.id.help -> {
                val i = Intent(this, HelpActivity::class.java)
                this.startActivity(i)
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
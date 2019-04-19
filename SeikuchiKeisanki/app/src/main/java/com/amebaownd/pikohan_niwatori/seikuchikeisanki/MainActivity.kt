package com.amebaownd.pikohan_niwatori.seikuchikeisanki

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.support.v7.widget.LinearLayoutCompat
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.footer_layout,FooterMenuFragment().createInstance(),"footer_menu_fragment")
        transaction.commit()
    }


}

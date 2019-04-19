package com.amebaownd.pikohan_niwatori.seikuchikeisanki

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FooterMenuFragment() : Fragment(){

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.footer_menu_fragment,container,false)
    }

    fun createInstance(context:Context):FooterMenuFragment{
        return FooterMenuFragment()
    }
}
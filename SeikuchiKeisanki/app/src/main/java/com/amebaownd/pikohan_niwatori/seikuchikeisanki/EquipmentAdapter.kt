package com.amebaownd.pikohan_niwatori.seikuchikeisanki

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class EquipmentAdapter(context: Context, private val equipment:List<EquipmentData>) : BaseAdapter() {
    val inflater = LayoutInflater.from(context)
    override fun getView(position: Int, view: View?, container: ViewGroup?): View {
        val view =inflater.inflate(R.layout.equipment_list_row,container,false)
        val viewHolder = ViewHolder(view)
        viewHolder.name.text = equipment[position].name
        viewHolder.status.text = equipment[position].status.toString()
        viewHolder.range.text = equipment[position].range
        viewHolder.layout.setBackgroundResource(getColor(equipment[position].type))
        return view
    }

    override fun getItem(position: Int)  = equipment[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getCount(): Int=equipment.size

    private fun getColor(type:Int):Int {
        when(type){
            1->
                return R.color.kansen
            2->
                return R.color.kanbaku
            3->
                return R.color.kankou
        }
        return R.color.other_type
    }
}

private class ViewHolder(view:View){
    val layout = view.findViewById<ConstraintLayout>(R.id.apinner_row_layout)
    val name = view.findViewById<TextView>(R.id.name)
    val status = view.findViewById<TextView>(R.id.status)
    val range = view.findViewById<TextView>(R.id.range)
}

data class EquipmentData(val name:String,val type : Int,val status:List<Int>,val range:String)
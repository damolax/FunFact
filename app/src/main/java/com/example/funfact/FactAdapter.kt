package com.example.funfact

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity

class FactAdapter(context: Context, facts: List<FactModel>) : ArrayAdapter<FactModel>(
    context, 0, facts
) {
    var FACT = "fact"
    var LOGO_RESOURCE = "logo_resource"
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        if (view == null) {
            view = LayoutInflater.from(parent.context).inflate(R.layout.item_fact, parent, false)
        }
        val fact = getItem(position)

        val logo: ImageView? = view?.findViewById(R.id.logo_image)
        val name: TextView? = view?.findViewById(R.id.logo_tv)
        logo?.setImageResource(fact!!.logo)
        name?.text = fact?.name
        view?.setOnClickListener {
            val intent = Intent(parent.context, DetailActivity::class.java)
            intent.putExtra(FACT, fact?.fact)
            intent.putExtra(LOGO_RESOURCE, fact?.logo)
            startActivity(parent.context, intent, Bundle.EMPTY)
        }
        return view!!
    }
}
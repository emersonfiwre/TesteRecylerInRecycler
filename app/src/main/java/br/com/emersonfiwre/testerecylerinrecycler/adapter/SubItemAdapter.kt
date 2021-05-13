package br.com.emersonfiwre.testerecylerinrecycler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.emersonfiwre.testerecylerinrecycler.R

class SubItemAdapter : RecyclerView.Adapter<SubItemViewHolder>() {

    var mList: List<String> = arrayListOf()
        set(value) {
            notifyDataSetChanged()
            field = value
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubItemViewHolder {
        val item =
            LayoutInflater.from(parent.context).inflate(R.layout.row_subitem, parent, false)
        return SubItemViewHolder(item)
    }

    override fun getItemCount(): Int {
        return mList.count()
    }

    override fun onBindViewHolder(holder: SubItemViewHolder, position: Int) {
        holder.bindData(mList[position])
    }

}

class SubItemViewHolder(itemView: View) :
    RecyclerView.ViewHolder(itemView) {

    private var mText: TextView = itemView.findViewById(R.id.title_subitem)

    /**
     * Atribui valores aos elementos de interface e também eventos
     */
    fun bindData(text: String) {
        this.mText.text = text
    }

}
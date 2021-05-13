package br.com.emersonfiwre.testerecylerinrecycler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.emersonfiwre.testerecylerinrecycler.R

class ItemAdapter : RecyclerView.Adapter<ItemViewHolder>() {

    var mList: List<String> = arrayListOf()
        set(value) {
            notifyDataSetChanged()
            field = value
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val item =
            LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false)
        return ItemViewHolder(item)
    }

    override fun getItemCount(): Int {
        return mList.count()
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bindData(mList[position])
    }

}

class ItemViewHolder(itemView: View) :
    RecyclerView.ViewHolder(itemView) {

    private var mText: TextView = itemView.findViewById(R.id.title_item)
    private var mRecycler: RecyclerView = itemView.findViewById(R.id.rv_item)

    /**
     * Atribui valores aos elementos de interface e também eventos
     */
    fun bindData(text: String) {
        this.mText.text = text
        val subItemAdapter = SubItemAdapter()
        subItemAdapter.mList = listOf(
            "Lorem Ipsum ",
            "é simplesmente uma",
            "simulação de texto da",
            "indústria tipográfica e de ",
            "impressos, e vem sendo utilizado ",
            "desde o século XVI, ",
            "quando um impressor desconhecido ",
            "pegou uma bandeja de tipos e os ",
            "embaralhou para fazer um livro de modelos ",
            "de tipos. Lorem Ipsum sobreviveu não ",
            "só a cinco séculos, como também ao ",
            "salto para a editoração eletrônica, ",
            "permanecendo ",
            "essencialmente inalterado. ",
            "Se popularizou na década de 60, ",
            "quando a Letraset lançou decalques ",
            "contendo passagens de Lorem Ipsum, ",
            "e mais recentemente quando",
            "passou a ser integrado a softw",
            "ares de editoração ",
            "eletrônica como ",
            "Aldus ",
            "PageMaker."

        )
        mRecycler.apply { adapter = subItemAdapter }
    }

}
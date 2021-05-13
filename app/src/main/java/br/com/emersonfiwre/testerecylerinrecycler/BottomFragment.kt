package br.com.emersonfiwre.testerecylerinrecycler

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import br.com.emersonfiwre.testerecylerinrecycler.adapter.ItemAdapter
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_bottom_sheet.*


class BottomFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View =
        inflater.inflate(R.layout.fragment_bottom_sheet, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val itemAdapter = ItemAdapter()
        itemAdapter.mList = listOf(
            "Ações",
            "Genoroso, English",
            "Categoria",
            "Computador",
            "Cartões",
            "Contas"
        )
        rv_bottom_sheet.apply {
            adapter = itemAdapter
        }
    }

}
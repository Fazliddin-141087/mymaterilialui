package uz.mobiler.mymaterialdesignui

import android.content.Context
import com.afollestad.materialdialogs.LayoutMode
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.bottomsheets.BottomSheet

object ConnectWifi {
    fun show(context: Context) {
        MaterialDialog(context, BottomSheet(LayoutMode.MATCH_PARENT)).show {

        }
    }
}
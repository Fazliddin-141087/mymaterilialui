package uz.mobiler.mymaterialdesignui

import android.content.Context
import com.google.android.material.dialog.MaterialAlertDialogBuilder

object MaterialAlert {
    fun show(context: Context, title: String, message: String, posBtn: String, negBtn: String) {
        MaterialAlertDialogBuilder(context)
            .setTitle(title)
            .setMessage(message)
            .setNegativeButton(negBtn) { dialog, which ->

            }
            .setPositiveButton(posBtn) { dialog, which ->

            }
            .show()
    }
}
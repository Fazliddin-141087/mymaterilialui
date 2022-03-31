package uz.mobiler.mymaterialdesignui

import androidx.fragment.app.FragmentManager
import com.google.android.material.datepicker.MaterialDatePicker

object CalendarDialog {
    fun show(title: String,fragmentManager: FragmentManager) {
        var datapicker= MaterialDatePicker.Builder.datePicker()
            .setTitleText(title)
            .build()
        datapicker.show(fragmentManager,"tag")
    }
}
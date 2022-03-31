package uz.mobiler.mymaterialdesignui

import com.google.android.material.datepicker.MaterialDatePicker

object CalendarDialog {
    fun show(title: String) {
        MaterialDatePicker.Builder.datePicker()
            .setTitleText(title)
            .build()
    }
}
package org.paradrops.materialdatepickerdialogsample

import android.app.DatePickerDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        defaultSpinnerDialog.setOnClickListener {
            DatePickerDialog(this, null, 2000, 0, 1).apply {
                datePicker.apply {
                    calendarViewShown = false
                    spinnersShown = true
                }
            }.show()
        }

        spinnerDialogButton.setOnClickListener {
            BirthdayPickerDialog().show(supportFragmentManager)
        }
    }
}

package org.paradrops.materialdatepickerdialogsample

import android.app.DatePickerDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.paradrops.materialdatepickerdialog.DatePickerSpinnerDialog

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
            val dialog = BirthdayPickerDialog().apply {
                onPositiveButtonClickListener = object : DatePickerSpinnerDialog.OnPositiveButtonClickListener {
                    override fun onClick(dialog: DatePickerSpinnerDialog, year: Int, monthOfYear: Int, dayOfMonth: Int) {
                        Toast.makeText(this@MainActivity, "$year/$monthOfYear/$dayOfMonth", Toast.LENGTH_LONG).show()
                    }
                }
            }
            dialog.show(supportFragmentManager)
        }
    }
}

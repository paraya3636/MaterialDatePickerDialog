package org.paradrops.materialdatepickerdialogsample

import org.paradrops.materialdatepickerdialog.DatePickerSpinnerDialog

class BirthdayPickerDialog : DatePickerSpinnerDialog() {
    override val title: String = "Your Birthday"
    override val negativeButtonLabel: String = "Cancel"
    override val positiveButtonLabel: String = "OK"
}
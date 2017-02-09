package org.paradrops.materialdatepickerdialogsample

import org.paradrops.materialdatepickerdialog.DatePickerDialogFragment

class DatePickerSpinnerDialog : DatePickerDialogFragment() {
    override val title: String = "Your Birthday"
    override val negativeButtonLabel: String = "Cancel"
    override val positiveButtonLabel: String = "OK"
}
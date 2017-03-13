package org.paradrops.materialdatepickerdialogsample

import org.paradrops.materialdatepickerdialog.DatePickerSpinnerDialog
import org.paradrops.materialdatepickerdialog.Month

class BirthdayPickerDialog : DatePickerSpinnerDialog() {
    override var defaultYear = 2000
    override var defaultMonthOfYear = Month.January
    override var defaultDayOfMonth = 1
    override val title: String = "Your Birthday"
    override val negativeButtonLabel: String = "Cancel"
    override val positiveButtonLabel: String = "OK"
}

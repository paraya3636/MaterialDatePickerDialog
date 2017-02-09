package org.paradrops.materialdatepickerdialog

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v4.app.FragmentManager
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater

abstract class DatePickerDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        builder.apply {
            setTitle(title)

            val picker = LayoutInflater.from(context).inflate(R.layout.picker_date_spinner, null)
            setView(picker)

            setNegativeButton(negativeButtonLabel, {
                dialogInterface: DialogInterface, which: Int ->
                onNegativeButtonClickListener?.onClick(this@DatePickerDialogFragment)
            })

            setPositiveButton(positiveButtonLabel, {
                dialogInterface: DialogInterface, which: Int ->
                onPositiveButtonClickListener?.onClick(this@DatePickerDialogFragment)
            })
        }
        return builder.create()
    }

    override fun onCancel(dialog: DialogInterface?) {
        super.onCancel(dialog)
        onCancelListener?.onCancel(this)
    }

    override fun onDismiss(dialog: DialogInterface?) {
        super.onDismiss(dialog)
        onDismissListener?.onDismiss(this)
    }

    fun show(manager: FragmentManager) {
        show(manager, this.tag)
    }

    abstract protected val title: String?
    abstract protected val negativeButtonLabel: String?
    abstract protected val positiveButtonLabel: String?

    interface OnNegativeButtonClickListener {
        fun onClick(dialog: DatePickerDialogFragment)
    }
    var onNegativeButtonClickListener: OnNegativeButtonClickListener? = null

    interface OnPositiveButtonClickListener {
        fun onClick(dialog: DatePickerDialogFragment)
    }
    var onPositiveButtonClickListener: OnPositiveButtonClickListener? = null

    interface OnCancelListener {
        fun onCancel(dialog: DatePickerDialogFragment)
    }
    var onCancelListener: OnCancelListener? = null

    interface OnDismissListener {
        fun onDismiss(dialog: DatePickerDialogFragment)
    }
    var onDismissListener: OnDismissListener? = null
}
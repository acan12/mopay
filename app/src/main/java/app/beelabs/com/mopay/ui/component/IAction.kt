package app.beelabs.com.mopay.ui.component

import android.content.Context
import android.widget.TextView

interface IAction {
    fun generalAction(context: Context)

    fun showLabelManager(label: String, labelTextView: TextView, context: Context)
}
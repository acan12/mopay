package app.beelabs.com.mopay.ui.component.di.manager

import android.content.Context
import android.widget.TextView
import android.widget.Toast
import app.beelabs.com.mopay.ui.component.di.IAction

class ActionManager : IAction {
    override fun generalAction(context: Context) {
        Toast.makeText(context, "Show Event", Toast.LENGTH_SHORT).show()
    }

    override fun showLabelManager(label: String, labelTextView: TextView, context: Context) {
        labelTextView.text = label
    }
}
package app.beelabs.com.mopay.ui.component.manager

import android.content.Context
import android.widget.Toast
import app.beelabs.com.mopay.ui.component.IListener

class ListenerManager : IListener {
    override fun textChangeListener(context: Context) {
        Toast.makeText(context, "Load Listener", Toast.LENGTH_LONG).show()
    }

}
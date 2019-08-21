import androidx.recyclerview.widget.RecyclerView
import android.view.View
import com.lyho.androidcore.ui.common.BaseOnClickListener

/**
 * Base Holder.
 *
 */
abstract class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

    init {
        itemView.setOnClickListener(this)
    }

    open fun onItemClick(v: View) {
        // Implement lester
    }

    override fun onClick(v: View) {
        if (BaseOnClickListener.isBlockingClick) {
            return
        }
        onItemClick(v)
    }

    abstract fun onBind()
}
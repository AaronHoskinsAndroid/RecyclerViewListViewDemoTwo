package examples.training.recyclerviewlistviewdemo.view.adapters

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import examples.training.recyclerviewlistviewdemo.R
import examples.training.recyclerviewlistviewdemo.model.users.User
import examples.training.recyclerviewlistviewdemo.view.helpers.itemtouchhelper.ItemTouchHelperAdapter
import examples.training.recyclerviewlistviewdemo.view.helpers.itemtouchhelper.ItemTouchViewHolder
import kotlinx.android.synthetic.main.user_item.view.*
import kotlin.collections.ArrayList

class RecyclerViewAdapter(val userList : ArrayList<User>, val itemClickListener : OnItemClickListener)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(),
    ItemTouchHelperAdapter{



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent, false))


    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.populateItemViews(userList[position])


    override fun getItemCount() = userList.size

    override fun onItemMove(fromPosition: Int, toPosition: Int) {
       notifyItemMoved(fromPosition, toPosition)
    }

    override fun onDismissItem(itemToDismissPosition: Int) {
        userList.remove(userList[itemToDismissPosition])
        notifyItemRemoved(itemToDismissPosition)
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView),
        ItemTouchViewHolder, View.OnClickListener{
        init {
            itemView.setOnClickListener(this)
        }

        fun populateItemViews(user : User) {
            itemView.tvUserFullName.text = generateUserName(user)
            itemView.tvEmailAddress.text = user.email
            itemView.imgUserImage.setImageResource(R.drawable.no_image)
        }

        override fun onItemSelected() = itemView.setBackgroundColor(Color.RED)

        override fun onItemCleared() = itemView.setBackgroundColor(0)

        override fun onClick(p0: View?) {
            itemClickListener.onClick(p0, adapterPosition)
        }

        private fun generateUserName(user: User)
                = "${user.firstName} ${user.lastName}"
    }

    interface OnItemClickListener {
        fun onClick(view : View?, position : Int)
    }

}
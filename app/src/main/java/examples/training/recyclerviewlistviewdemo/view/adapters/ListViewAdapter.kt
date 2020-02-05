package examples.training.recyclerviewlistviewdemo.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import examples.training.recyclerviewlistviewdemo.R
import examples.training.recyclerviewlistviewdemo.model.users.User

class ListViewAdapter(private val context: Context, private val userList : ArrayList<User>)
    : BaseAdapter(), View.OnClickListener {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view : View
        val viewHolder : ViewHolder

        if(convertView == null) {
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.user_item, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        viewHolder.populateViewHolder(userList[position])

        return view
    }

    override fun getItem(position: Int) = userList[position]


    override fun getItemId(id: Int) = id.toLong()

    override fun getCount() = userList.size


    override fun onClick(view: View?) {
    }

    private class ViewHolder(itemView : View?) {
        val tvUserFullName by lazy { itemView?.findViewById<TextView>(R.id.tvUserFullName)}
        val tvUserEmailAddress by lazy { itemView?.findViewById<TextView>(R.id.tvEmailAddress) }
        val imgUserImage by lazy {itemView?.findViewById<ImageView>(R.id.imgUserImage)}
        fun populateViewHolder(user : User?) {
            val userFullName = "${user?.firstName} ${user?.lastName}"
            tvUserFullName?.text = userFullName
            tvUserEmailAddress?.text = user?.email
            imgUserImage?.setImageResource(R.drawable.no_image)
        }
    }

}
package examples.training.recyclerviewlistviewdemo.view.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import examples.training.recyclerviewlistviewdemo.R
import examples.training.recyclerviewlistviewdemo.model.datasource.local.database.DummyDatabaseHelper
import examples.training.recyclerviewlistviewdemo.view.adapters.RecyclerViewAdapter
import examples.training.recyclerviewlistviewdemo.view.decoration.RecyclerViewDecoration
import examples.training.recyclerviewlistviewdemo.view.helpers.itemtouchhelper.ItemTouchHelperCallbackManager
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity(), RecyclerViewAdapter.OnItemClickListener {
    private val adapter by lazy {RecyclerViewAdapter(DummyDatabaseHelper().userList, this)}
    private val callback by lazy { ItemTouchHelperCallbackManager(adapter) as ItemTouchHelper.Callback}
    private val  itemTouchHelper by lazy { ItemTouchHelper(callback) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        initializeRecyclerView()
    }

    private fun initializeRecyclerView() {
        rvUserList.layoutManager = LinearLayoutManager(this)
        rvUserList.adapter = adapter
        rvUserList.addItemDecoration(RecyclerViewDecoration(ContextCompat.getDrawable(this, R.drawable.divider)!!))
        itemTouchHelper.attachToRecyclerView(rvUserList)
    }

    override fun onClick(view: View?, position: Int) {
        val user = adapter.userList[position]
        val intent = Intent(this, DetailsActivity::class.java)
        val bundle = Bundle()
        bundle.putParcelable("user", user)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}

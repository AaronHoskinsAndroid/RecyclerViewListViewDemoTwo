package examples.training.recyclerviewlistviewdemo.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import examples.training.recyclerviewlistviewdemo.R
import examples.training.recyclerviewlistviewdemo.model.datasource.local.database.DummyDatabaseHelper
import examples.training.recyclerviewlistviewdemo.view.adapters.ListViewAdapter
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {
    private val userList by lazy { DummyDatabaseHelper().userList }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        initListView()
    }

    private fun initListView() {
        val adapter = ListViewAdapter(this, userList)
        lvUserList.adapter = adapter
    }
}

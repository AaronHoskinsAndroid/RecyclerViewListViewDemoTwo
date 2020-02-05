package examples.training.recyclerviewlistviewdemo.view.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.LiveData
import examples.training.recyclerviewlistviewdemo.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //startActivity(Intent(this, RecyclerViewActivity::class.java))
    }

    fun onClick(view: View) {
        when(view.id) {
            R.id.btnStartListView ->
                {startActivity(Intent(this, ListViewActivity::class.java))}
            R.id.btnStartRecyclerView ->
                {startActivity(Intent(this, RecyclerViewActivity::class.java))}
        }
    }
}

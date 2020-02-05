package examples.training.recyclerviewlistviewdemo.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import examples.training.recyclerviewlistviewdemo.R
import examples.training.recyclerviewlistviewdemo.model.users.User
import kotlinx.android.synthetic.main.activity_details.*
import java.util.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        populateView(intent.extras?.getParcelable("user")?:
            User("",
                "",
                "",
                Calendar.getInstance().time,
                'N',
                false))
    }

    private fun populateView(userDetails : User) {
        tvFirstName.text = userDetails.firstName
        tvLastName.text = userDetails.lastName
        tvDateOfBirth.text = userDetails.dateOfBirth.toString()
        tvEmailAddress.text = userDetails.email
        tvGender.text = userDetails.gender.toString()
        chkIsPremiumUser.isChecked = userDetails.isPremiumUser
    }
}

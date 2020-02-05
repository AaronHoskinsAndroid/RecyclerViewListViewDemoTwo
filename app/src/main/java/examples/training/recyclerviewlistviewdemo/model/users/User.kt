package examples.training.recyclerviewlistviewdemo.model.users

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@SuppressLint("ParcelCreator")
@Parcelize
data class User(
    var firstName : String,
    var lastName : String,
    var email : String,
    var dateOfBirth : Date,
    var gender : Char,
    var isPremiumUser : Boolean) : Parcelable
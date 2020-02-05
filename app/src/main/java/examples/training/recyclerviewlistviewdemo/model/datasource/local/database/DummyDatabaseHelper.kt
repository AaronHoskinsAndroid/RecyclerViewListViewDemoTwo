package examples.training.recyclerviewlistviewdemo.model.datasource.local.database

import examples.training.recyclerviewlistviewdemo.model.users.User
import java.util.*
import kotlin.collections.ArrayList

class DummyDatabaseHelper {
    val userList = initUsersList()

     fun removeUserFromDatabase(position : Int) {
        userList.removeAt(position)
    }



    private fun initUsersList(): ArrayList<User> {
        val returnList = ArrayList<User>()
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(100, 1 - 1, 12).time,
                'M',
                false
            )
        )
        returnList.add(
            User(
                "Luke",
                "Skywalker",
                "notmyfather@jedi.com",
                GregorianCalendar(130, 12 - 1, 11).time,
                'M',
                true
            )
        )
        returnList.add(
            User(
                "Mary",
                "Poppins",
                "supercalifragilisticexpialidocious@sith.com",
                GregorianCalendar(1920, 1 - 1, 8).time,
                'F',
                false
            )
        )
        returnList.add(
            User(
                "James",
                "Kirk",
                "enterprisecapt@starfleet.gov",
                GregorianCalendar(2230, 1 - 1, 11).time,
                'M',
                true
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                false
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                true
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                false
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                false
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                false
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                true
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                false
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                true
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                true
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                false
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                false
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                true
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                false
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                false
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                true
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                false
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                true
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                false
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                false
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                false
            )
        )
        returnList.add(
            User(
                "Darth",
                "Vader",
                "padmeforever@sith.com",
                GregorianCalendar(0, 1 - 1, 12).time,
                'F',
                true
            )
        )
        return returnList
    }
}
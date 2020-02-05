package examples.training.recyclerviewlistviewdemo.view.helpers.itemtouchhelper

interface ItemTouchHelperAdapter {
    fun onItemMove(fromPosition : Int, toPosition : Int)
    fun onDismissItem(itemToDismissPosition : Int)
}
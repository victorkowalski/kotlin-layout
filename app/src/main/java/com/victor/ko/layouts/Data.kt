package com.victor.ko.layouts

object Data {

    fun getObjects(): ArrayList<DataModel> {
        val list = arrayListOf<DataModel>()

        list.add(DataModel("Item 1", R.drawable.battle, "#09A9FF"))
        list.add(DataModel("Item 2", R.drawable.beer, "#3E51B1"))
        list.add(DataModel("Item 3", R.drawable.ferrari, "#673BB7"))
        list.add(DataModel("Item 4", R.drawable.jetpack_joyride, "#4BAA50"))
        list.add(DataModel("Item 5", R.drawable.three_d, "#F94336"))
        list.add(DataModel("Item 6", R.drawable.terraria, "#0A9B88"))
        list.add(DataModel("Item 7", R.drawable.battle, "#09A9FF"))
        list.add(DataModel("Item 8", R.drawable.beer, "#3E51B1"))
        list.add(DataModel("Item 9", R.drawable.ferrari, "#673BB7"))
        list.add(DataModel("Item 10", R.drawable.jetpack_joyride, "#4BAA50"))
        list.add(DataModel("Item 11", R.drawable.three_d, "#F94336"))
        list.add(DataModel("Item 12", R.drawable.terraria, "#0A9B88"))

        return list
    }
}

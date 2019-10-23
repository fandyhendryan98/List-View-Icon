package com.example.listview_icon

object Detail {
    private val foodName = arrayOf(
        "bakso",
        "miegoreng",
        "lontong",
        "mieayam",
        "nasigoreng"
    )

    private val detail = arrayOf(
        "bakso adalah makan asal jawa tengah",
        "mie goreng adalah makanan khas indonesia yang mendunia",
        "lontong adalah makanan khas indonesia yang berkembang di masyarakat jawa",
        "mie ayam adalah makanan  indonesia yang tebuat dari mie kuning dan di kasih ayam",
        "nasi goreng adalah makanan yang tersebar indonesia"
    )

    private val foodPoster = intArrayOf(
        R.drawable.foto1,
        R.drawable.foto2,
        R.drawable.foto3,
        R.drawable.foto4,
        R.drawable.foto5

    )

    val listFood: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodName.indices) {
                val food = Food()
                food.name = foodName[position]
                food.detail = detail[position]
                food.poster = foodPoster[position]
                list.add(food)
            }
            return list
        }
}
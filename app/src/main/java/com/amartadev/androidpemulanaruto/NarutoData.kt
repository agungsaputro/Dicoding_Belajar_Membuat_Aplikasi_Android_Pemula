package com.amartadev.androidpemulanaruto

object NarutoData {
    private val data = arrayOf(
        arrayOf(
            "Naruto Uzumaki",
            "https://upload.wikimedia.org/wikipedia/id/thumb/3/36/Naruto_Uzumaki.png/280px-Naruto_Uzumaki.png",
            "Naruto Uzumaki adalah tokoh fiktif dari serial anime dan manga Naruto. Ia merupakan tokoh utama dalam serial ini. Ia digambarkan sebagai bocah berambut pirang dan bermata biru."
        ),
        arrayOf(
            "Sasuke Uchiha",
            "https://upload.wikimedia.org/wikipedia/id/thumb/c/c6/Sasuke_Uchiha_%28Good%2CShippuden%29.jpg/280px-Sasuke_Uchiha_%28Good%2CShippuden%29.jpg",
            "Sasuke Uchiha adalah seorang karakter fiktif dari komik dan anime Naruto. Nama depan Sasuke, konon berasal dari nama seorang ninja legendaris, Sarutobi Sasuke."
        ),
        arrayOf(
            "Sakura Haruno",
            "https://upload.wikimedia.org/wikipedia/id/thumb/2/2a/Sakura_Haruno.png/280px-Sakura_Haruno.png",
            "Sakura Haruno adalah salah satu tokoh fiksi dari seri manga & anime Naruto. Dia adalah seorang ninja wanita yang tergabung dalam Tim 7 bersama Naruto Uzumaki dan Sasuke Uchiha di bawah bimbingan Kakashi Hatake. Dia juga adalah seorang ninja medis di bawah bimbingan Tsunade."
        ),
        arrayOf(
            "Hinata Hyuuga",
            "https://upload.wikimedia.org/wikipedia/id/thumb/c/c8/Hinata_Hyuga.png/240px-Hinata_Hyuga.png",
            "Hinata Hyuuga adalah tokoh fiksi dari anime dan manga yang berjudul Naruto karya Masashi Kishimoto. Hinata adalah salah keturunan dari klan Hyuga. Ia memiliki seorang adik bernama Hanabi Hyuuga, dan ayah bernama Hiashi Hyuuga. Saudara sepupunya bernama Neji Hyuuga."
        ),
        arrayOf(
            "Neji Hyuuga",
            "https://upload.wikimedia.org/wikipedia/id/1/18/Neji_Hyuga.png",
            "Neji Hyuuga adalah nama seorang tokoh fiktif dalam anime dan manga Naruto. Neji adalah seorang genin yang genius. Ia berasal dari klan Hyuga, dan masih sekerabat dengan Hinata Hyuuga."
        ),
        arrayOf(
            "Shikamaru Nara",
            "https://upload.wikimedia.org/wikipedia/id/thumb/9/9a/Shikamaru_Nara.png/240px-Shikamaru_Nara.png",
            "Shikamaru Nara adalah salah satu tokoh protagonis dalam serial manga dan anime Naruto. \"Shika\" berarti rusa dan \"maru\" bisa berarti \"lingkaran\" atau \"berkembang dengan baik\" tetapi biasa digunakan sebagai nama anak lelaki."
        ),
        arrayOf(
            "Kahashi Hatake",
            "https://upload.wikimedia.org/wikipedia/id/thumb/2/27/Kakashi_Hatake.png/240px-Kakashi_Hatake.png",
            "Kakashi Hatake adalah tokoh fiktif dalam serial manga dan anime Naruto. Ia merupakan Hokage ke-6 dan juga guru dari Naruto, Sasuke, dan Sakura. Dia juga dikenal sebagai \"Kakashi si ninja peniru\", dan konon jumlah jurus yang sudah ia tiru mencapai seribu jurus. Nama Kakashi berarti orang-orangan sawah."
        ),
        arrayOf(
            "Tsunade Senju",
            "https://upload.wikimedia.org/wikipedia/id/9/9c/Tsunade.png",
            "Tsunade Senju yang bergelar Godaime Hokage adalah tokoh fiktif dalam serial manga dan anime Naruto. Ia adalah cucu dari Hashirama Senju, dan kunoichi dari tiga sennin legendaris dan sekarang dikenal sebagai Hokage kelima. Tsunade adalah seorang ninja medis dan juga \"penjinak siput\"."
        ),
        arrayOf(
            "Gaara",
            "https://upload.wikimedia.org/wikipedia/id/thumb/b/bd/Gaara.jpg/240px-Gaara.jpg",
            "Gaara adalah nama seorang tokoh fiksi dalam serial manga dan anime Naruto. Gaara adalah seorang anak dari kazekage keempat yang mempunyai kekuatan untuk mengendalikan dan mengontrol pasir. Ciri khasnya adalah gentong pasir yang selalu dibawa-bawa di punggungnya dan luka bertuliskan \"ai - cinta\" pada dahinya."
        ),
        arrayOf(
            "Rock Lee",
            "https://upload.wikimedia.org/wikipedia/id/thumb/8/81/Rock_Lee.png/280px-Rock_Lee.png",
            "Rock Lee adalah nama seorang tokoh fiktif dalam seri anime dan manga Naruto. Rock Lee adalah salah satu teman sedesa Naruto Uzumaki. Ia sering dipanggil gejimayu atau si alis tebal oleh Naruto Uzumaki. Ia tergabung di Tim 9 bersama guru Guy, Neji Hyuga, dan Tenten."
        )
    )

    val listData: ArrayList<Naruto>
    get() {
        val list = ArrayList<Naruto>()
        for (aData in data){
            val naruto = Naruto()
            naruto.name = aData[0]
            naruto.photo = aData[1]
            naruto.detail = aData[2]

            list.add(naruto)
        }
        return list
    }
}
package ir.jet.instagramexplor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import ir.dunijet.exploreinstagram.NetworkChecker
import ir.jet.instagramexplor.databinding.ActivityMainBinding


class MainActivity  : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val url = listOf(
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Karl_Marx_001.jpg/330px-Karl_Marx_001.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/b/b6/Sadegh_Hedayat_colorized.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Vasily_Perov_-_%D0%9F%D0%BE%D1%80%D1%82%D1%80%D0%B5%D1%82_%D0%A4.%D0%9C.%D0%94%D0%BE%D1%81%D1%82%D0%BE%D0%B5%D0%B2%D1%81%D0%BA%D0%BE%D0%B3%D0%BE_-_Google_Art_Project.jpg/360px-Vasily_Perov_-_%D0%9F%D0%BE%D1%80%D1%82%D1%80%D0%B5%D1%82_%D0%A4.%D0%9C.%D0%94%D0%BE%D1%81%D1%82%D0%BE%D0%B5%D0%B2%D1%81%D0%BA%D0%BE%D0%B3%D0%BE_-_Google_Art_Project.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Dostoyevsky_on_his_Bier%2C_Kramskoy.jpg/255px-Dostoyevsky_on_his_Bier%2C_Kramskoy.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Kafka_statue_Prague.jpg/195px-Kafka_statue_Prague.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/George_Orwell_press_photo.jpg/330px-George_Orwell_press_photo.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Kafka1906_cropped.jpg/255px-Kafka1906_cropped.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/Bookfest2_%28crop%29.jpg/330px-Bookfest2_%28crop%29.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/Franz_Kafka%2C_1923.jpg/330px-Franz_Kafka%2C_1923.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/d/dc/Bulla_Andreyev.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7b/Engels_1856.jpg/255px-Engels_1856.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/%D0%98%D0%BB%D1%8C%D1%8F_%D0%A0%D0%B5%D0%BF%D0%B8%D0%BD_-_%D0%9F%D0%BE%D1%80%D1%82%D1%80%D0%B5%D1%82_%D0%92%D1%81%D0%B5%D0%B2%D0%BE%D0%BB%D0%BE%D0%B4_%D0%9C%D0%B8%D1%85%D0%B0%D0%B9%D0%BB%D0%BE%D0%B2%D0%B8%D1%87_%D0%93%D0%B0%D1%80%D1%88%D0%B8%D0%BD.jpg/338px-%D0%98%D0%BB%D1%8C%D1%8F_%D0%A0%D0%B5%D0%BF%D0%B8%D0%BD_-_%D0%9F%D0%BE%D1%80%D1%82%D1%80%D0%B5%D1%82_%D0%92%D1%81%D0%B5%D0%B2%D0%BE%D0%BB%D0%BE%D0%B4_%D0%9C%D0%B8%D1%85%D0%B0%D0%B9%D0%BB%D0%BE%D0%B2%D0%B8%D1%87_%D0%93%D0%B0%D1%80%D1%88%D0%B8%D0%BD.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7a/George-orwell-BBC.jpg/255px-George-orwell-BBC.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Andreyev_by_Repin.jpg/300px-Andreyev_by_Repin.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Sadegh_hedayat.jpg/330px-Sadegh_hedayat.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/Lyudmila_Ulitskaya_2.jpg/300px-Lyudmila_Ulitskaya_2.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/OrwellBurmaPassport.jpg/255px-OrwellBurmaPassport.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/14/Karl-Marx.jpg/255px-Karl-Marx.jpg",
        )


        if (NetworkChecker(this).isInternetConnected) {
            val glide = Glide.with(this)
            glide
                .load(url[0]).placeholder(R.drawable.img_loading).error(R.drawable.img_error)
                .into(binding.iv1)

            glide
                .load(url[1]).placeholder(R.drawable.img_loading).error(R.drawable.img_error)
                .into(binding.iv2)

            glide
                .load(url[2]).placeholder(R.drawable.img_loading).error(R.drawable.img_error)
                .into(binding.iv3)

            glide
                .load(url[3]).placeholder(R.drawable.img_loading).error(R.drawable.img_error)
                .into(binding.iv4)

            glide
                .load(url[4]).placeholder(R.drawable.img_loading).error(R.drawable.img_error)
                .into(binding.iv5)

            glide
                .load(url[5]).placeholder(R.drawable.img_loading).error(R.drawable.img_error)
                .into(binding.iv6)

            glide
                .load(url[6]).placeholder(R.drawable.img_loading).error(R.drawable.img_error)
                .into(binding.iv7)

            glide
                .load(url[7]).placeholder(R.drawable.img_loading).error(R.drawable.img_error)
                .into(binding.iv8)

            glide
                .load(url[8]).placeholder(R.drawable.img_loading).error(R.drawable.img_error)
                .into(binding.iv9)

            glide
                .load(url[9]).placeholder(R.drawable.img_loading).error(R.drawable.img_error)
                .into(binding.iv10)

            glide
                .load(url[10]).placeholder(R.drawable.img_loading).error(R.drawable.img_error)
                .into(binding.iv11)

            glide
                .load(url[11]).placeholder(R.drawable.img_loading).error(R.drawable.img_error)
                .into(binding.iv12)

            glide
                .load(url[12]).placeholder(R.drawable.img_loading).error(R.drawable.img_error)
                .into(binding.iv13)

            glide
                .load(url[13]).placeholder(R.drawable.img_loading).error(R.drawable.img_error)
                .into(binding.iv14)

            glide
                .load(url[14]).placeholder(R.drawable.img_loading).error(R.drawable.img_error)
                .into(binding.iv15)

            glide
                .load(url[15]).placeholder(R.drawable.img_loading).error(R.drawable.img_error)
                .into(binding.iv16)

            glide
                .load(url[16]).placeholder(R.drawable.img_loading).error(R.drawable.img_error)
                .into(binding.iv17)

            glide
                .load(url[17]).placeholder(R.drawable.img_loading).error(R.drawable.img_error)
                .into(binding.iv18)


        } else {
            Toast.makeText(this, "Please check your Internet connection!",Toast.LENGTH_SHORT).show()
        }









    }
}
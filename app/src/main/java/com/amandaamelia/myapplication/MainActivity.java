package com.amandaamelia.myapplication;

import android.os.Bundle;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.amandaamelia.myapplication.adapter.PopularCakeAdapter;
import com.amandaamelia.myapplication.adapter.RekomenCakeAdapter;
import com.amandaamelia.myapplication.model.PopularCake;
import com.amandaamelia.myapplication.model.RekomenCake;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ScrollView scrollView;
    RecyclerView popularRecycler, rekomenRecycler;
    PopularCakeAdapter popularCakeAdapter;
    RekomenCakeAdapter rekomenCakeAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<PopularCake> popularCakeList = new ArrayList<>();

            popularCakeList.add(new PopularCake("Kue Roti Meses", "Bahan-bahan\n" +
                    "Bahan Roti Meses\n" +
                    "•\t300 gram Tepung protein tinggi (Cakra kembar mas)\n" +
                    "•\t15 gram Susu bubuk putih\n" +
                    "•\t55 gram Gula pasir\n" +
                    "•\t4 gram Fermipan\n" +
                    "•\tKuning telur 1 + susu cair dingin ditimbang sampai mencapai berat total 204 gram\n" +
                    "•\t50 gram Butter\n" +
                    "•\t3 gram Garam\n" +
                    "•\tBahan Topping / Taburan\n" +
                    "•\tMeises coklat secukupnya\n" +
                    "\n" +
                    "Langkah-langkah\n" +
                    "1.\tCara Membuat Roti Meses Coklat\n" +
                    "2.\tCampurkan tepung, susu bubuk, fermipan, gula pasir, lalu mixer adonan dengan kecepatan pelan sambil tuang cairan susunya.\n" +
                    "3.\tSetelah setengah kalis, masukkan butter dan garam.\n" +
                    "4.\tMixer terus sampai kalis elastis (window pane stage).\n" +
                    "5.\tBulatkan dan istirahatkan adonan kurang lebih selama 45 menit sampai adonan mengembang menjadi 2x lipatnya.\n" +
                    "6.\tKempiskan adonan, uleni dengan lembut sebentar. Bagi adonan menjadi 2, bulatkan lagi, dan istirahatkan lagi selama 10 menit.\n" +
                    "7.\tTimbang adonan per @45 gram atau per @50 gram, beri isian meses sebanyak yang diinginkan, lalu balutkan ke dalam meses sambil ditekan biar mesesnya nempel.\n" +
                    "8.\tSelanjutnya taruh adonan ke dalam cup roti dan tata ke atas loyang.\n" +
                    "9.\tIstirahatkan lagi 1 sampai 1,5 jam atau tergantung suhu ruangan.\n" +
                    "10.\tPanaskan oven selama 15 menit, masukkan adonan lalu oven roti di suhu 180 derajat celcius sampai matang.\n" +
                    "11.\tSetelah matang langsung di oles butter biar wangi rotinya.\n",
                R.drawable.pdonat1));
        popularCakeList.add(new PopularCake("Kue Bolen Pisang", "Bahan-bahan\n" +
                "Bahan A Bolen Pisang\n" +
                "•\t100 gram Tepung terigu protein tinggi\n" +
                "•\t75 gram Margarin\n" +
                "•\t1 sdm Minyak Goreng\n" +
                "•\tBahan B Bolen Pisang\n" +
                "•\t200 gram Tepung terigu protein tinggi\n" +
                "•\t50 gram Gula Halus\n" +
                "•\t80 ml Air\n" +
                "•\t75 gram Margarin\n" +
                "•\tBahan Dasar Olesan Bolu Pisang\n" +
                "•\t1 butir Kuning telur\n" +
                "•\t1 sdm Susu cair\n" +
                "•\tBahan Isi Bolen\n" +
                "•\t8 buah Pisang raja\n" +
                "•\tKeju potong kotak panjang\n" +
                "•\tMeses / ceres coklat secukupnya\n" +
                "\n" +
                "Langkah-langkah\n" +
                "Cara Membuat Kulit Bolen\n" +
                "1.\tAduk rata bahan A, lalu bentuk bulat. Diamkan selama 15 menit lalu simpan di kulkas.\n" +
                "2.\tAduk rata bahan B sampai kalis, diamkan 15 menit lalu simpan dikulkas. Jangan lupa ditutup ya adonannya.\n" +
                "3.\tBagi adonan A dan B menjadi 16 bagian, lalu bulatkan.\n" +
                "4.\tGiling adonan B memanjang, letakkan adonan A di atas adonan B, kemudian lipat seperti amplop.\n" +
                "5.\tGiling tipis adonan memanjang, gulung kemudian tipiskan lagi. Ulangi sebanyak 2-3 kali, lakukan hingga adonan habis. Diamkan 15 menit, jangan lupa ditutup dengan serbet atau kain bersih ya.\n" +
                "Cara Membuat Bahan Isian Bolen\n" +
                "1.\tPotong pisang menjadi dua bagian.\n" +
                "2.\tGoreng dengan margarin sampai setengah matang, sisihkan.\n" +
                "Penyelesaian\n" +
                "1.\tAmbil 1 adonan bolen, gilas adonan bolen melebar, letakkan pisang, keju dan meses coklat di tengah, kemudian lipat kulitnya sampai rapih.\n" +
                "2.\tOles dengan bahan olesan lalu tabur keju dan meses di atasnya. Lakukan sampai semua adonan habis.\n" +
                "3.\tLetakkan di loyang yang sudah dioles margarin dan tepung.\n" +
                "4.\tPanggang kurang lebih selama 40 menit dengan suhu 180c menggunakan api atas bawah atau sesuaikan dengan oven masing-masing.\n" +
                " \n",
                R.drawable.ppisang2));
        popularCakeList.add(new PopularCake("Kue Bolu Bolen Gulung", "Bahan-bahan :\n" +
                "•\tTelur ayam 6 butir\n" +
                "•\tGula halus 90 gram\n" +
                "•\tTepung terigu kunci 70 gram\n" +
                "•\tMaizena 10 gram\n" +
                "•\tSusu bubuk full cream 10 gram\n" +
                "•\tVanilla esssence 1 sendok teh\n" +
                "•\tButter 120 gram\n" +
                "•\tFilling: Nutela atau bisa butter cream / selai (sesuai selera)\n" +
                "Cara Membuatnya :\n" +
                "1.\tCairkan mentega/butter setelah cair diamkan hingga dingin.\n" +
                "2.\tKocok telur, gula halus dan SP (usahakan tempat yang dipakai benar-benar kering) mixer dengan kecepatan tinggi sampai mengembang dan berwarna putih pucat.\n" +
                "3.\tMasukan terigu, meizena dan susu bubuk sambil diayak diatasnya diaduk sampai rata (boleh pake mixer dengan kecepatan paling rendah).\n" +
                "4.\tTuangkan mentega/butter cair ke dalam adonan yang tadi sudah dibuat sedikit demi sedikit dengan teknik aduk balik menggunakan spatula karet hingga mentega/better benar-benar tercampur rata dan homogen, ambil 2-3 sendok makan beri pasta coklat, 1-2 tetes untuk menghias adonan.\n" +
                "5.\tMasukan adonan keloyang (24x24x3) yang telah diolesi mentega dan dialasi kertas roti, hias atasnya dengan adonan coklat garis miring lalu tarik kebawah dengan menggunakan sumpit/tusuk sate.\n" +
                "6.\tPanaskan oven 200C, panggang selama kurang lebih 25-30 menit tergantung oven masing-masing (api besar) sampai matang.\n" +
                "7.\tKeluarkan dari oven tunggu beberapa saat lalu keluarkan dari loyang dengan dibalik diatas kertas roti/plastik wrap beri filling nutella/isian sesusai selera lalu digulung sambil dipadatkan.\n" +
                "8.\tTunggu Bolu gulung sampai agak dingin, baru dipotong menjadi 12 slice dan sajikan. semoga bermanfaat.\n",
                R.drawable.pgulung3));
        popularCakeList.add(new PopularCake("Kue Puding ", "Bahan-bahan\n" +
                "•\t1 bungkus Agar-agar swallow\n" +
                "•\t150 gram Gula pasir (jika kurang manis bisa tambahkan sesuai selera)\n" +
                "•\t1 butir Telur\n" +
                "•\t125 ml Santan kental\n" +
                "•\t350 ml Air\n" +
                "•\t350 ml Jus pandan (dari 10 lembar daun pandan dan air, lalu saring)\n" +
                "•\tPasta pandan Pasta pandan secukupnya (bisa di skip, jika tidak suka)\n" +
                "•\tGaram sejumput\n" +
                "•\tAir perasan lemon secukupnya\n" +
                "\n" +
                "Langkah-langkah\n" +
                "Cara Membuat Puding Lumut Hijau Pandan\n" +
                "1.\tPertama kocok telur, setelah itu beri air perasan lemon.\n" +
                "2.\tKemudian campurkan semua bahan tersebut kedalam panci dengan menggunakan api sedang, sambil mengaduk searah dan perlahan sampai masak/berbuih.\n" +
                "3.\tSelanjutnya kecilkan api, lalu tunggu hingga santan pecah dan membentuk lumut dengan sendirinya. Matikan api.\n" +
                "4.\tSetelah itu basahii cetakan puding dengan air. Taruhlah adonan puding lumut kedalam cetakan puding, tunggu hingga uap panasnya hilang. Lalu masukan kedalam kulkas.\n" +
                "5.\tSajikan Puding Lumut dengan kreasi yang anda inginkan.\n", R.drawable.ppuding4));


        setPopularRecycler(popularCakeList);

        List<RekomenCake> rekomenCakeList = new ArrayList<>();
        rekomenCakeList.add(new RekomenCake("Roti Cane", "Bahan-bahan\n" +
                "•\tTepung Terigu 600 gram (saya menggunakan tepung segitiga 200 gram dan tepung cakra 400 gram), boleh pakai cakra saja atau segitiga saja\n" +
                "•\tTelur utuh 1 butir + kuning telur 1 buah\n" +
                "•\tGaram 1/2 sendok the\n" +
                "•\tGula halus 1 sendok makan\n" +
                "•\tMargarin cair 50 gram\n" +
                "•\tMinyak 70 mili liter\n" +
                "•\tSusu cair hangat 280 mili liter\n" +
                "•\tMargarin cair untuk bahan olesan\n" +
                "•\tMinyak untuk merendam adonan\n" +
                "\n" +
                "Langkah-langkah\n" +
                "1.\tCampur rata tepung terigu dengan garam dan gula, sisihkan.\n" +
                "2.\tDalam wadah lain campur rata susu cair, minyak goreng, margarin cair dan telur. Aduk rata dengan garpu atau whisker.\n" +
                "3.\tMasukkan campuran susu ke dalam adonan tepung, aduk rata dan uleni sampai benar-benar kalis. Kalau adonannya masih keras, boleh tambahkan susu cair. Bulatkan, lalu istirahatkan adonan selama 30 menit.Tutup wadah dengan lap bersih.\n" +
                "4.\tBagi adonan menjadi beberapa bulatan kecil (saya timbang sekitar @45-50 gram), lalu rendam dalam minyak selama 1-2 jam.\n" +
                "5.\tSelanjutnya ambil satu buah bulatan adonan, giling setipis mungkin tapi jangan sampai bolong-bolong.\n" +
                "6.\tOles tipis permukaannya dengan margarin atau mentega cair lalu kerat-kerat dengan pisau yang tajam dengan arah memanjang, sisakan pinggirannya jangan sampai putus. Gulung adonan yang telah dikerat-kerat tadi, setelah tergulung lalu tarik pelan-pelan dengan kedua tangan sambil sedikit dipelintir supaya adonan jadi panjang. Gulung melingkar seperti obat nyamuk, lakukan sampai adonan habis, dan diamkan selama 10 menit.\n" +
                "7.\tAmbil satu gulungan adonan, pipihkan pelan-pelan di atas nampan hingga adonan melebar tipis dan bulat. Tapi jangan terlalu tipis, supaya layernya cantik.\n" +
                "8.\tPanggang roti di atas teflon dengan menggunakan api kecil saja sambil sesekali dibalik dan di oles margarin di kedua sisi permukaannya.\n" +
                "9.\tSetelah matang, angkat dari teflon.\n" +
                "10.\tSajikan roti maryam dengan topping sesuai selera. \n",
                R.drawable.rcane1));

        rekomenCakeList.add(new RekomenCake("Kue Lumpur", "Bahan-bahan\n" +
                "Bahan 1\n" +
                "•\tSantan 300 mili liter (saya pakai 150 ml santan kara instan ditambah air 150ml jadi 300ml)\n" +
                "•\tMargarin 50 gram\n" +
                "•\tGula pasir 100 gram\n" +
                "•\tGaram 1/2 sdt\n" +
                "•\tVanili 1/4 sdt\n" +
                "•\tTepung terigu 100 gram\n" +
                "•\tMasak santan, margarin, gula pasir, garam, dan vanili menggunakan api yang kecil hingga gula benar-benar larut.\n" +
                "•\tKemudian masukkan tepung terigu, matikan api, aduk hingga adonan kalis. Lalu biarkan dingin.\n" +
                "Bahan 2\n" +
                "•\tTelur 2 butir\n" +
                "•\tKentang yang sudah dikukus dan dihaluskan sebanyak 125 gram\n" +
                "•\tSusu cair 100 gram\n" +
                "•\tAduk bahan di atas menggunakan whisk hingga tercampur rata.\n" +
                "•\tBahan Topping\n" +
                "•\tKismis secukupnya\n" +
                "\n" +
                "Langkah-langkah\n" +
                "1.\tCampur bahan 1 dan bahan 2, aduk hingga tercampur rata dan tidak ada yang bergerindil. Jika perlu saring adonan, agar menghasilkan adonan yang benar-benar lembut dan tidak ada adonan yang menggumpal.\n" +
                "2.\tSelanjutnya panaskan cetakan kue lumpur.\n" +
                "3.\tOles cetakan dengan margarin tipis-tipis saja.\n" +
                "4.\tTuang adonan sebanyak 3/4 dari cetakan, lalu tutup cetakan dan biarkan hingga setengah matang.\n" +
                "5.\tTambahkan kismis sebagai hiasan.\n" +
                "6.\tLalu masak hingga permukaannya kuning kecoklatan.\n" +
                "7.\tAngkat dan hidangan hangat-hangat.\n",
                R.drawable.rlumpur2));

        rekomenCakeList.add(new RekomenCake("Eclair Cake Dessert Box", "Bahan-bahan\n" +
                "Bahan Cake\n" +
                "•\tBiskuit marie regal atau biskuit tanpa gula dan tanpa cream secukupnya merk apa saja sesuai selera. Boleh diblender dengan menggunakan sedikit butter cair, atau bisa juga ditata dalam bentuk kepingan bikuit tanpa cream.\n" +
                "Bahan Vanilla Puding\n" +
                "•\tGula pasir 90 gram\n" +
                "•\tMaizena 3 sendok makan\n" +
                "•\tSusu full cream cair 475 mili liter\n" +
                "•\tWhipping cream cair 118 mili liter\n" +
                "•\tKuning telur 4 butir\n" +
                "•\tVanilla pasta 1 sendok teh (1 batang vanila bean)\n" +
                "•\tSalted butter 3 sendok makan\n" +
                "•\tWhipping cream cair 100 mili liter (kocok hingga kaku lalu masukkan freezer)\n" +
                "•\tChocolate Ganache\n" +
                "•\tDCC (Dark cooking chocolate) 150 gram\n" +
                "•\tWhipping cream cair 75 mili liter (Boleh tambahkan whipping cream jika ingin agak cair)\n" +
                "•\tPanaskan whipping cream asal hangat aja. Matikan api, masukkan DCC. Lalu aduk hingga meleleh, sisihkan.\n" +
                "\n" +
                "Langkah-langkah\n" +
                "Cara Membuat Puding Vanila\n" +
                "1.\tKocok telur dan gula pair menggunakan whisk hingga gula larut. Tambahkan tepung maizena, aduk hingga rata sisihkan.\n" +
                "2.\tSelanjutnya rebus susu, whipping cream, vanilla pasta dan butter hingga pinggirannya berbuih kemudian tuang sebagian ke dalam adonan kuning telur. Aduk rata hingga tidak bergerindil. Tuang kembali ke dalam panci berisi susu, masak dengan api kecil. Aduk hingga adonan mengental. Matikan api dan biarkan dingin.\n" +
                "3.\tAgar tidak berkulit, tuang vanilla puding ke dalam bowl kemudian tutup dengan cling wrap.\n" +
                "4.\tSetelah vanilla puding dingin, tambahkan whipping cream kocok yang sudah di dinginkan, aduk menggunakan whisk hingga rata.\n" +
                "\n" +
                "Penyelesai Menghias / Menata Eclair Cake\n" +
                "1.\tTata biskuit mari di dasar pinggan, mangkuk atau box untuk dessert. Beri vanilla puding, ratakan. Tata kembali biskuit hingga menutup seluruh permukaan. Tambahan vanila puding lagi, ratakan.\n" +
                "2.\tKemudian tuang coklat ganache di atasnya hingga merata.\n" +
                "3.\tBeri topping sesuai selera, mulai dari chocochips, boba dll.\n" +
                "4.\tMasukkan ke dalam kulkas, kurang lebih selama 6 jam atau semalaman.\n" +
                "5.\tCake dessert box siap disajikan.\n",
                R.drawable.rbitter3));

        rekomenCakeList.add(new RekomenCake("Kue Klepon Ketan", "Bahan-bahan Yang Digunakan Untuk Membuat Kue Klepon Panda :\n" +
                "•\tTepung ketan 250 gram (saya pakai Rosebrand)\n" +
                "•\tTepung beras 50 gram (saya pakai rosebrand)\n" +
                "•\tAir secukupnya kurang lebih sebanyak 220 mili liter untuk membentuk adonan agar bisa dipulung bulat-bulat\n" +
                "•\tPasta pandan secukupnya atau bisa juga pakai air yang diblender dengan daun pandan biar hasilnya enak dan wangi\n" +
                "\n" +
                "Bahan Isian Klepon :\n" +
                "1.\tGula merah sisir sebanyak 2 sendok makan atau secukupnya sesuai selera\n" +
                "2.\tKelapa parut secukupnya\n" +
                "\n" +
                "Cara Membuat Kue Kelepon Gula Jawa :\n" +
                "1.\tPertama-tama kukus parutan kelapa terlebih dahulu, kurang lebih selama 20 menit. Angkat, sisihkan.\n" +
                "2.\tSetelah itu siram tepung ketan dan tepung beras dengan air sedikit demi sedikit lalu aduk rata, tambahkan air pasta pandan sampai adonan kalis dan dapat dibentuk.\n" +
                "3.\tSelanjutnya ambil sedikit adonan, pipihkan lalu isi dengan gula merah secukupnya. Bentuk jadi bulatan, lakukan hal yang sama hingga adonan habis.\n" +
                "4.\tRebus adonnan dalam air mendidih hingga matang dan mengapung, angkat dan tiriskan.\n" +
                "5.\tGulingkan rebusan bola-bola ketan di atas kelapa parut yang sudah dikukus hingga rata.\n" +
                "6.\tKue klepon rumahan tanpa kapur sirih pun siap untuk disajikan.\n" +
                "\n" +
                "Tips Sukses Membuat Resep Kue Klepon Ketan Gula Merah :\n" +
                "1.\tSaat membuat adonan klepon, sebaiknya jangan terlalu lembek karena bisa membuat gembos sang kue. Dan jangan membuat adonan terlalu kering, karena nanti jadi gampang bocor saat di isi gula merah.\n" +
                "2.\tBila menggunakan air suji atau air pandan untuk pewarna, maka kurangi penggunaan air di resep klepon ini agar adonan tidak terlalu encer.\n" +
                "3.\tKelapa parut yang dikukus bisa ditambahkan sedikit garam, agar rasa kelapanya lebih gurih.\n" +
                "4.\tTapi menurut saya gula merah sudah ada rasa asinnya, jadi hati-hati dalam menggunakan garamnya, cukup sedikit saja ya. \n",
                R.drawable.rklepon4));

        setRekomenRecycler(rekomenCakeList);
    }


    private void setPopularRecycler(List<PopularCake> popularCakeList) {

        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularCakeAdapter = new PopularCakeAdapter(this, popularCakeList);
        popularRecycler.setAdapter(popularCakeAdapter);

    }

    private void setRekomenRecycler(List<RekomenCake> rekomenCakeList) {

        rekomenRecycler = findViewById(R.id.rekomen_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rekomenRecycler.setLayoutManager(layoutManager);
        rekomenCakeAdapter = new RekomenCakeAdapter(this, rekomenCakeList);
        rekomenRecycler.setAdapter(rekomenCakeAdapter);

    }


}
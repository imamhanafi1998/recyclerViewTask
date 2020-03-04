package com.akeno.recyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.akeno.recyclerview1.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnCarItemClickListener {

    lateinit var binding: ActivityMainBinding
    lateinit var carList: ArrayList<Cars>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this, R.layout.activity_main)
        carList= ArrayList()
        addCar()
        carRecycler.layoutManager=LinearLayoutManager(this)
        carRecycler.addItemDecoration(DividerItemDecoration(this, 1))
        carRecycler.adapter=CarAdapter(carList, this)
    }

    fun addCar() {
        carList.add(Cars("Alpha","Halo", R.mipmap.ic_launcher_round) )
        carList.add(Cars("Bravo","Halo", R.mipmap.ic_launcher_round) )
        carList.add(Cars("Charlie","Halo", R.mipmap.ic_launcher_round) )
        carList.add(Cars("Delta","Halo", R.mipmap.ic_launcher_round) )
        carList.add(Cars("Echo","Halo", R.mipmap.ic_launcher_round) )
        carList.add(Cars("Foxtrot","Halo", R.mipmap.ic_launcher_round) )
        carList.add(Cars("Golf","Halo", R.mipmap.ic_launcher_round) )
        carList.add(Cars("Hotel","Halo", R.mipmap.ic_launcher_round) )
        carList.add(Cars("India","Halo", R.mipmap.ic_launcher_round) )
        carList.add(Cars("Juliet","Halo", R.mipmap.ic_launcher_round) )
    }

    override fun onItemClick(item: Cars, position: Int) {
        Toast.makeText(this, "Halo ${item.name}", Toast.LENGTH_LONG).show()
    }
}

package com.predator.tugasakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.predator.tugasakhir.R

class MainActivity : AppCompatActivity() {
    private lateinit var rvAssaultr: RecyclerView
    private var list: ArrayList<AssaultRifle> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvAssaultr = findViewById(R.id.rv_assaultr)
        rvAssaultr.setHasFixedSize(true)

        list.addAll(AssaultRifleData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvAssaultr.layoutManager = LinearLayoutManager(this)
        val listAsaultrAdapter = ListAssaultRifleAdapter(list)
        rvAssaultr.adapter = listAsaultrAdapter

        listAsaultrAdapter.setOnItemClickCallback(object :
            ListAssaultRifleAdapter.OnItemClickCallback {
            override fun onItemClicked(data: AssaultRifle) {
                showSelectedAssaultRifle(data)
                moveSelectedAssaultRifle(data)
            }
        })
    }

    private fun showSelectedAssaultRifle (assaultr: AssaultRifle) {
        Toast.makeText(this, "Kamu memilih " + assaultr.name , Toast.LENGTH_SHORT).show()
    }

    private fun moveSelectedAssaultRifle (assaultr: AssaultRifle) {
        val detailIntent = Intent(this@MainActivity, DetailActivity::class.java)
        detailIntent.putExtra(DetailActivity.EXTRA_NAME, "${assaultr.name}")
        detailIntent.putExtra(DetailActivity.EXTRA_DAMAGE, "${assaultr.ddamage}")
        detailIntent.putExtra(DetailActivity.EXTRA_RANGE, "${assaultr.drange}")
        detailIntent.putExtra(DetailActivity.EXTRA_STABIL, "${assaultr.dstabil}")
        detailIntent.putExtra(DetailActivity.EXTRA_FIRATE, "${assaultr.dfiring}")
        detailIntent.putExtra(DetailActivity.EXTRA_JUMLAHA, "${assaultr.djumlaha}")
        detailIntent.putExtra(DetailActivity.EXTRA_JENISA, "${assaultr.djenisa}")
        detailIntent.putExtra(DetailActivity.EXTRA_MODE, "${assaultr.dmode}")
        detailIntent.putExtra(DetailActivity.EXTRA_WAKTU, "${assaultr.dwaktu}")
        detailIntent.putExtra(DetailActivity.EXTRA_MUZZLE, "${assaultr.dmuzzle}")
        detailIntent.putExtra(DetailActivity.EXTRA_GRIP, "${assaultr.dgrip}")
        detailIntent.putExtra(DetailActivity.EXTRA_STOCK, "${assaultr.dstock}")

        detailIntent.putExtra(DetailActivity.EXTRA_IMAGE, assaultr.image)

        startActivity(detailIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.profile -> {
            val profileIntent = Intent(this@MainActivity, ProfileActivity::class.java)
            startActivity(profileIntent)
            true
        }

        else -> {

            super.onOptionsItemSelected(item)
        }
    }

}
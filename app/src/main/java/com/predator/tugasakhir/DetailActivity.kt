package com.predator.tugasakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.predator.tugasakhir.R

class  DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DAMAGE = "extra_damage"
        const val EXTRA_RANGE = "extra_range"
        const val EXTRA_STABIL = "extra_stabil"
        const val EXTRA_FIRATE = "extra_firate"
        const val EXTRA_JUMLAHA = "extra_jumlaha"
        const val EXTRA_JENISA = "extra_jenisa"
        const val EXTRA_MODE = "extra_mode"
        const val EXTRA_WAKTU = "extra_waktu"
        const val EXTRA_MUZZLE = "extra_muzzle"
        const val EXTRA_GRIP = "extra_grip"
        const val EXTRA_STOCK = "extra_stock"


        const val EXTRA_IMAGE = "extra_image"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvNameReceived: TextView = findViewById(R.id.tv_name_received)
        val tvDamageReceived: TextView = findViewById(R.id.tv_damage_received)
        val tvRangeReceived: TextView = findViewById(R.id.tv_range_received)
        val tvStabilReceived: TextView = findViewById(R.id.tv_stabil_received)
        val tvFirateReceived: TextView = findViewById(R.id.tv_firerate_received)
        val tvJumlahaReceived: TextView = findViewById(R.id.tv_jumlaha_received)
        val tvJenisaReceived: TextView = findViewById(R.id.tv_jenisa_received)
        val tvModeReceived: TextView = findViewById(R.id.tv_mode_received)
        val tvWaktuReceived: TextView = findViewById(R.id.tv_waktur_received)
        val tvMuzzleReceived: TextView = findViewById(R.id.tv_muzzle_received)
        val tvGripReceived: TextView = findViewById(R.id.tv_grip_received)
        val tvStockReceived: TextView = findViewById(R.id.tv_stock_received)
        val ivImageReceived: ImageView = findViewById(R.id.iv_image_received)

        val name = intent.getStringExtra(EXTRA_NAME)
        val damage = intent.getStringExtra(EXTRA_DAMAGE)
        val range = intent.getStringExtra(EXTRA_RANGE)
        val stabil = intent.getStringExtra(EXTRA_STABIL)
        val firate = intent.getStringExtra(EXTRA_FIRATE)
        val jumlaha = intent.getStringExtra(EXTRA_JUMLAHA)
        val jenisa = intent.getStringExtra(EXTRA_JENISA)
        val mode = intent.getStringExtra(EXTRA_MODE)
        val waktu = intent.getStringExtra(EXTRA_WAKTU)
        val muzzle = intent.getStringExtra(EXTRA_MUZZLE)
        val grip = intent.getStringExtra(EXTRA_GRIP)
        val stock = intent.getStringExtra(EXTRA_STOCK)
        val img = intent.getIntExtra(EXTRA_IMAGE,0)

        val textname = "$name"
        val textdmg = "$damage"
        val textrange = "$range"
        val textstabil = "$stabil"
        val textfirate = "$firate"
        val textjumlaha = "$jumlaha"
        val textjenisa = "$jenisa"
        val textmode = "$mode"
        val textwaktu = "$waktu"
        val textmuzzle = "$muzzle"
        val textgrip = "$grip"
        val textstock = "$stock"
        val imageimg = img

        tvNameReceived.text = textname
        tvDamageReceived.text = textdmg
        tvRangeReceived.text = textrange
        tvStabilReceived.text = textstabil
        tvFirateReceived.text = textfirate
        tvJumlahaReceived.text = textjumlaha
        tvJenisaReceived.text = textjenisa
        tvModeReceived.text = textmode
        tvWaktuReceived.text = textwaktu
        tvMuzzleReceived.text = textmuzzle
        tvGripReceived.text = textgrip
        tvStockReceived.text = textstock
        ivImageReceived.setImageResource(imageimg)

    }
}
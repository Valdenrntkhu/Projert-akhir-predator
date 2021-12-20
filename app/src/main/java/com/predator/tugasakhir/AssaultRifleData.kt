package com.predator.tugasakhir

import com.predator.tugasakhir.R

object AssaultRifleData {
    private val assaultrNames = arrayOf(
        "AKM",
        "Beryl M762",
        "Mk47 Mutant",
        "G36C",
        "M416",
        "M16A4",
        "SCAR-L",
        "QBZ",
        "AUG",
        "Groza")

    private val assaultrDamages = arrayOf(
        "49",
        "47",
        "47",
        "42",
        "42",
        "42",
        "42",
        "42",
        "42",
        "49")

    private val assaultrRanges = arrayOf(
        "60",
        "60",
        "60",
        "54",
        "56",
        "62",
        "55",
        "56",
        "55",
        "60")

    private val assaultrStabilties = arrayOf(
        "34",
        "34",
        "34",
        "36",
        "37",
        "36",
        "31",
        "36",
        "35",
        "22")

    private val assaultrFirates = arrayOf(
        "59",
        "63",
        "55",
        "60",
        "62",
        "60",
        "60",
        "59",
        "60",
        "65")

    private val assaultrJumlahas = arrayOf(
        "30 (Default)\n40 (Extended)",
        "30 (Default)\n40 (Extended)",
        "20 (Default)\n30 (Extended)",
        "30 (Default)\n40 (Extended)",
        "30 (Default)\n40 (Extended)",
        "30 (Default)\n40 (Extended)",
        "30 (Default)\n40 (Extended)",
        "30 (Default)\n40 (Extended)",
        "30 (Default)\n40 (Extended)",
        "30 (Default)\n40 (Extended)")

    private val assaultrJenisas = arrayOf(
        "7.62mm",
        "7.62mm",
        "7.62mm",
        "5.56mm",
        "5.56mm",
        "5.56mm",
        "5.56mm",
        "5.56mm",
        "5.56mm",
        "7.62mm")

    private val assaultrModes = arrayOf(
        "Single\nAuto",
        "Single\nBrust\nAuto",
        "Single\nBrust",
        "Single\nAuto",
        "Single\nAuto",
        "Single\nBrust\nAuto",
        "Single\nAuto",
        "Single\nAuto",
        "Single\nAuto",
        "Single\nAuto")

    private val assaultrWaktus = arrayOf(
        "3 Detik",
        "3 Detik",
        "3 Detik",
        "2 Detik",
        "2 Detik",
        "2 Detik",
        "2 Detik",
        "3.5 Detik",
        "4 Detik",
        "3 Detik")

    private val assaultrMuzzles = arrayOf(
        "Semua Muzzle AR",
        "Semua Muzzle AR",
        "Semua Muzzle AR",
        "Semua Muzzle AR",
        "Semua Muzzle AR",
        "Semua Muzzle AR",
        "Semua Muzzle AR",
        "Semua Muzzle AR",
        "Semua Muzzle AR",
        "Suppresor AR")

    private val assaultrGrips = arrayOf(
        "-",
        "Semua Grip AR",
        "Semua Grip AR",
        "Semua Grip AR",
        "Semua Grip AR",
        "-",
        "Semua Grip AR",
        "Semua Grip AR",
        "Semua Grip AR",
        "-")

    private val assaultrStocks = arrayOf(
        "-",
        "-",
        "-",
        "-",
        "Stock Tactical",
        "Stock Tactical",
        "-",
        "-",
        "-",
        "-")




    private val assaultrPhotos = intArrayOf(
        R.drawable.akm,
        R.drawable.beryl_m762,
        R.drawable.mk47_mutant,
        R.drawable.g36c,
        R.drawable.m416,
        R.drawable.m16a4,
        R.drawable.scarl,
        R.drawable.qbz,
        R.drawable.aug,
        R.drawable.groza
    )

    private val assaultrImages = intArrayOf(
        R.drawable.detail_akm,
        R.drawable.detail_beryl,
        R.drawable.detail_mutant,
        R.drawable.detail_g36c,
        R.drawable.detail_m416,
        R.drawable.detail_m16a4,
        R.drawable.detail_scarl,
        R.drawable.detail_qbz,
        R.drawable.detail_aug,
        R.drawable.detail_groza
    )

    val listData: ArrayList<AssaultRifle>
    get() {
        val list = arrayListOf<AssaultRifle>()
        for (position in assaultrNames.indices) {
            val assaultr = AssaultRifle()
            assaultr.name = assaultrNames[position]
            assaultr.ddamage = assaultrDamages[position]
            assaultr.drange = assaultrRanges[position]
            assaultr.dstabil = assaultrStabilties[position]
            assaultr.dfiring = assaultrFirates[position]
            assaultr.djumlaha = assaultrJumlahas[position]
            assaultr.djenisa = assaultrJenisas[position]
            assaultr.dmode = assaultrModes[position]
            assaultr.dwaktu = assaultrWaktus[position]
            assaultr.dmuzzle = assaultrMuzzles[position]
            assaultr.dgrip = assaultrGrips[position]
            assaultr.dstock = assaultrStocks[position]

            assaultr.photo = assaultrPhotos[position]
            assaultr.image = assaultrImages[position]

            list.add(assaultr)
        }
        return list
    }
}
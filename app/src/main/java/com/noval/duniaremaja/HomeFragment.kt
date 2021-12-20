package com.noval.duniaremaja

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    lateinit var listItem:ArrayList<Home>

    private fun ListItem() {
        listItem= ArrayList()
        listItem.add(Home("Biru dan Pink", "StrawbreryAlice", R.drawable.gambar1))
        listItem.add(Home("Gustira", "Kata Kokoh", R.drawable.gambar2))
        listItem.add(Home("Kambing dan Hujan", "Mahfud Ikhwan", R.drawable.gambar3))
        listItem.add(Home("Mahasiswa Koplak", "Wisnu Maulana", R.drawable.gambar4))
        listItem.add(Home("Negeri 5 Menara", "A.Fuadi", R.drawable.gambar5))
        listItem.add(Home("Perahu Kertas", "Dee Lestari", R.drawable.gambar6))
        listItem.add(Home("Pergi", "Tere Liye", R.drawable.gambar7))
        listItem.add(Home("Samudra Alaskan dan Aurora", "Anandaeka", R.drawable.gambar8))
        listItem.add(Home("Saat Kita Jatuh Cinta", "AIU AHRA", R.drawable.gambar9))
        listItem.add(Home("Sebatas Mimpi", "Hujan Mimpi", R.drawable.gambar10))

    }

    private fun tampilItem() {
        recycler_view.layoutManager=LinearLayoutManager(activity)
        recycler_view.adapter=HomeAdapter(requireActivity(), listItem)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        ListItem()
        tampilItem()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}

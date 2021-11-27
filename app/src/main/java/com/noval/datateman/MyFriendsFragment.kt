package com.noval.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friend.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman= ArrayList()
        listTeman.add(MyFriend("Samsul Arifin", "Laki-laki",
                "samsul@stimata.ac.id", "08123456789", "Bogor"))
        listTeman.add(MyFriend("Dian Wahyuningsih", "Perempuan",
                "dian@stimata.ac.id", "081987654321", "Sidoarjo"))
        listTeman.add(MyFriend("Muhammad Noval Ramadhani", "Laki-laki",
            "muhammad_20310008@stimata.ac.id", "08976479990", "Malang"))
        listTeman.add(MyFriend("Viara Azkia", "Perempuan",
            "viara22@gmail.com", "08138895570", "Surabaya"))
        listTeman.add(MyFriend("Eliza Hanifah", "Perempuan",
            "eliz4@gmail.com", "0812291758", "Jakarta"))
        listTeman.add(MyFriend("Ahmad Faseh", "laki-laki",
            "faseh87@gmail.com", "08920884490", "Malang"))
        listTeman.add(MyFriend("Deni Sulistyo", "Laki-laki",
                "deni12@gmail.com", "0857909022", "Malang"))
        listTeman.add(MyFriend("Moch Revano Budiansyah", "laki-laki",
            "revanmalang@gmail.com", "0851871110", "Malang"))


    }

    private fun tampilTeman() {
        rv_listMyFriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyFriends.adapter=MyFriendAdapter(requireActivity(), listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friend, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}

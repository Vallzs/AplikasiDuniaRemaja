package com.noval.duniaremaja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    val menuTeks = arrayOf("Beranda","Kategori","Tentang")
    val menuIcon = arrayOf(R.drawable.ic__16242_home_icon, R.drawable.ic__26591_add_circle_icon, R.drawable.info)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val float_button: FloatingActionButton = findViewById(R.id.float_button)
        float_button.setOnClickListener(this)

        val adapter = ViewPagerAdapter(this)
        view_pager.setAdapter(adapter);
        TabLayoutMediator(tab_layout, view_pager,
            TabLayoutMediator.TabConfigurationStrategy{ tab, position ->
                tab.text=menuTeks[position]
                tab.icon=ResourcesCompat.getDrawable(resources, menuIcon[position], null)
            }).attach()
    }

    override fun onClick(v: View?) {
            when(v?.id) {
                R.id.float_button -> run {
                    val intent = Intent(this, InfoActivity2::class.java)
                    startActivity(intent)
                }
            }
    }
}

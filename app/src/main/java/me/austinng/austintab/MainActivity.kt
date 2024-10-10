package me.austinng.austintab

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    private lateinit var austinTabView1: AustinTabView
    private lateinit var austinTabView2: AustinTabView
    private lateinit var austinTabView3: AustinTabView
    private lateinit var austinTabView4: AustinTabView
    private lateinit var austinTabView5: AustinTabView
    private lateinit var austinTabView6: AustinTabView
    private lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        austinTabView1 = findViewById(R.id.austinTabView1)
        austinTabView2 = findViewById(R.id.austinTabView2)
        austinTabView3 = findViewById(R.id.austinTabView3)
        austinTabView4 = findViewById(R.id.austinTabView4)
        austinTabView5 = findViewById(R.id.austinTabView5)
        austinTabView6 = findViewById(R.id.austinTabView6)

        austinTabView1.setData(
            listOf(
                TabData("Home"),
                TabData("Latest Notifications"),
                TabData("Profile"),
            )
        )

        austinTabView2.setData(
            listOf(
                TabData("Home"),
                TabData("Latest Notifications"),
                TabData("Profile"),
            )
        )

        austinTabView3.setData(
            listOf(
                TabData("Home"),
                TabData("Latest Notifications"),
                TabData("Profile"),
            )
        )

        austinTabView4.setData(
            listOf(
                TabData("Home"),
                TabData("Latest Notifications"),
                TabData("Profile"),
            )
        )

        austinTabView5.setData(
            listOf(
                TabData("Home"),
                TabData("Profile"),
                TabData("Dashboard"),
                TabData("Notifications"),
                TabData("Settings"),
                TabData("Messages"),
                TabData("Favorites"),
                TabData("Search"),
                TabData("History"),
                TabData("Statistics"),
            )
        )

        austinTabView6.setData(
            listOf(
                TabData("Home"),
                TabData("Profile"),
                TabData("Dashboard"),
                TabData("Notifications"),
                TabData("Settings"),
                TabData("Messages"),
                TabData("Favorites"),
                TabData("Search"),
                TabData("History"),
                TabData("Statistics"),
            )
        )
    }
}
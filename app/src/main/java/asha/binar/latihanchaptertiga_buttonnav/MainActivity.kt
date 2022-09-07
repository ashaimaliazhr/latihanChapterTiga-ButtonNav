package asha.binar.latihanchaptertiga_buttonnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import asha.binar.latihanchaptertiga_buttonnav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController

        binding.navView.setupWithNavController(navController)
        navController.addOnDestinationChangedListener{_, destination, _ ->
            binding.apply {
                if (destination.id == R.id.homeFragment ||  destination.id == R.id.favoriteFragment || destination.id == R.id.settingFragment){
                    navView.visibility = View.VISIBLE
                } else {
                    navView.visibility =View.GONE
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
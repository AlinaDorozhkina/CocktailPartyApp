package ru.alinadorozhkina.cocktailpartyapplication.ui.activities

import android.os.Bundle
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter
import ru.alinadorozhkina.cocktailpartyapplication.databinding.ActivityMainBinding
import ru.alinadorozhkina.cocktailpartyapplication.mvp.presenter.MainPresenter
import ru.alinadorozhkina.cocktailpartyapplication.mvp.view.MainView

class MainActivity : MvpAppCompatActivity(), MainView {

    private var vb: ActivityMainBinding? = null
    private val presenter by moxyPresenter { MainPresenter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)
    }
}
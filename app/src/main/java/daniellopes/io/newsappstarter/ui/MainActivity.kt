package daniellopes.io.newsappstarter.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import daniellopes.io.newsappstarter.R
import daniellopes.io.newsappstarter.adapter.MainAdapter
import daniellopes.io.newsappstarter.model.Article
import daniellopes.io.newsappstarter.model.data.NewsDataSource
import daniellopes.io.newsappstarter.presenter.ViewHome
import daniellopes.io.newsappstarter.presenter.news.NewsPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AbstractActivity(), ViewHome.View {
    override fun getLayout(): Int = R.layout.activity_main
    // by lazy inicializacao
    // colocar adapter para pegar intes que vem da requisição e configurar recyclerView
    private val mainAdapter by lazy{
        MainAdapter()
    }

    // lateinit inicializacao atrasada
    // Adicionar o Presenter
    private lateinit var presenter: NewsPresenter

    override fun onInject() {
        val dataSource = NewsDataSource()
        // this = View
        presenter = NewsPresenter(this, dataSource)
        //view pede para preseter os dados
        presenter.requestAll()
    }

    // funcao para configurar a reciclerview
    private fun configRecycler(){
        with(rvNews){
            // fazer algumas configurações
        }
    }

    override fun showProgressBar() {

    }

    override fun showFailure(message: String) {

    }

    override fun hideProgressBar() {

    }

    override fun showArticles(article: List<Article>) {

    }

}
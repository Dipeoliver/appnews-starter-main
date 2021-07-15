package daniellopes.io.newsappstarter.presenter

import daniellopes.io.newsappstarter.model.Article

interface ViewHome {

    // sera uma interface que ira ficar ligada direta a view
    interface View{
        fun showProgressBar()
        fun showFailure(message: String)
        fun hideProgressBar()
        fun showArticles(article: List<Article>)
    }
}
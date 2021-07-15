package daniellopes.io.newsappstarter.presenter.favorite

import daniellopes.io.newsappstarter.model.Article

interface FavoriteHome {
    fun showArticles(article: List<Article>)
}
package daniellopes.io.newsappstarter.presenter.news

import daniellopes.io.newsappstarter.model.NewsResponse


interface NewsHome {
    interface Presenter{
        fun requestAll()
        fun onSuccess(newsResponse: NewsResponse)
        fun onError(message: String)
        fun onComplete()
    }
}
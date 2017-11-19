package sample.qiitaclient.client

import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable
import sample.qiitaclient.model.Article
import java.util.*

/**
 * Created by houxianliangyi on 2017/11/19.
 */
interface ArticleClient {

    @GET("/api/v2/items")
    fun search(@Query("query") query: String): Observable<List<Article>>
}
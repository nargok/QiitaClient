package sample.qiitaclient.view

import android.content.Context
import android.graphics.Color
import android.media.Image
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import org.w3c.dom.Text
import sample.qiitaclient.R
import sample.qiitaclient.model.Article
import sample.qiitaclient.bindViews

/**
 * Created by houxianliangyi on 2017/11/19.
 */
class ArticleView : FrameLayout {

    constructor(context: Context?) : super(context)

    constructor(context: Context?,
                attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context?,
                attrs: AttributeSet?,
                defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    constructor(context: Context?,
                attrs: AttributeSet?,
                defStyleAttr: Int,
                defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes)

    val profileImageView: ImageView by bindViews<ImageView>(R.id.profile_image_view)

    val titleTextView: TextView by bindViews<TextView>(R.id.title_text_view)

    val userNameTextView : TextView by bindViews<TextView>(R.id.user_name_text_view)

    init {
        LayoutInflater.from(context).inflate(R.layout.view_article, this)
    }

    fun setArticle(article: Article) {
        titleTextView?.text = article.title
        userNameTextView?.text = article.user.name
        Glide.with(context).load(article.user.profileImageUrl).into(profileImageView)
    }

}
package sample.qiitaclient

import android.support.annotation.IdRes
import android.view.View

/**
 * Created by houxianliangyi on 2017/11/19.
 */

fun <T : View> View.bindViews(@IdRes id: Int): Lazy<T> = lazy {
    findViewById<T>(id)
}
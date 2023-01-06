package com.fuh.newsapp.domain.domain_model

import com.fuh.newsapp.CommonParcelable
import com.fuh.newsapp.CommonParcelize
import com.fuh.newsapp.data.local.dao.HeadlineDAO


@CommonParcelize
data class HeadlineDomainModel(

    var author: String,

    var content: String,

    val description: String,

    val publishedAt: String,

    val source: String,

    val title: String,

    val url: String,

    val urlToImage: String
) : CommonParcelable

fun HeadlineDomainModel.asDao(): HeadlineDAO {
    return HeadlineDAO().also {
        it.content = this.content
        it.description = this.description
        it.publishedAt = this.publishedAt
        it.source = this.source
        it.title = this.title
        it.url = this.url
        it.urlToImage = this.urlToImage

    }
}

fun List<HeadlineDomainModel>.asDao() = map {
    it.asDao()
}

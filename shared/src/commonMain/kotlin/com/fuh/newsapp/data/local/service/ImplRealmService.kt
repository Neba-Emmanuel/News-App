package com.fuh.newsapp.data.local.service

import com.fuh.newsapp.data.local.dao.HeadlineDAO
import io.realm.kotlin.Realm
import io.realm.kotlin.ext.query

class ImplRealmService(private val realm: Realm) : AbstractRealmService() {
    override suspend fun addToReadLater(headlineDAO: HeadlineDAO) {
        realm.query<HeadlineDAO>("title = $0", headlineDAO.title).find().ifEmpty {

            realm.writeBlocking {
                this.copyToRealm(
                    headlineDAO
                )
            }
        }

    }

    override suspend fun getReadLater() =realm.query<HeadlineDAO>().find()

}
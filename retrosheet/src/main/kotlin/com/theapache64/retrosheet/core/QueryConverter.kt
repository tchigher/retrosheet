package com.theapache64.retrosheet.core

/**
 * Created by theapache64 : Jul 21 Tue,2020 @ 22:37
 */
class QueryConverter(
    private val smartQuery: String,
    private val smartQueryMap: Map<String, String>
) {
    fun convert(): String {
        var outputQuery = smartQuery
        for (entry in smartQueryMap) {
            outputQuery = outputQuery.replace(entry.key, entry.value)
        }
        return outputQuery
    }
}
package com.codingblocks.restapiretrofitjson.models

/**
 * Created by Suraj on 6/30/2017.
 */

data class Todo(
        val userId: kotlin.Int,
        val id: kotlin.Int,
        val title: String,
        val completed: kotlin.Boolean
)
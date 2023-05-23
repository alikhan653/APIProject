package kz.iitu.apiproject.data.repository

import kz.iitu.apiproject.data.model.arbeitnow
import retrofit2.http.GET

interface ApiService {

    @GET("job-board-api")
    suspend fun getData(): arbeitnow

}
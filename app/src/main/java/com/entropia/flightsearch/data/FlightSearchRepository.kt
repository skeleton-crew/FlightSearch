package com.entropia.flightsearch.data

import kotlinx.coroutines.flow.Flow

interface FlightSearchRepository {
    fun getAirportByInputStream(input: String): Flow<List<Airport>>
    fun getAllDestinationAirportsStream(currentId: Int): Flow<List<Airport>>
    suspend fun addFavorite(favorite: Favorite)
    suspend fun removeFavorite(favorite: Favorite)
    fun getAllFavorites(): Flow<List<Favorite>>
    fun getFavorite(id: Int): Favorite
}
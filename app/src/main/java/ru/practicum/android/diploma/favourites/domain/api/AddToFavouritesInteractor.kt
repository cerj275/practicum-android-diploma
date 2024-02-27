package ru.practicum.android.diploma.favourites.domain.api

import kotlinx.coroutines.flow.Flow
import ru.practicum.android.diploma.core.domain.model.DetailVacancy

interface AddToFavouritesInteractor {
    suspend fun checkVacancyInFavourites(vacancyId: Long): Boolean

    suspend fun addToFavourites(vacancy: DetailVacancy)

    suspend fun removeFromFavourites(vacancy: DetailVacancy)
}

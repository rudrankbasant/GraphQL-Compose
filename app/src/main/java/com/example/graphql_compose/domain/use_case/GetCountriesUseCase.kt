package com.example.graphql_compose.domain.use_case

import com.example.graphql_compose.domain.CountryClient
import com.example.graphql_compose.domain.SimpleCountry

class GetCountriesUseCase(
    private val countryClient: CountryClient
) {

    suspend fun execute(): List<SimpleCountry> {
        return countryClient
            .getCountries()
            .sortedBy { it.name }
    }
}
package com.example.graphql_compose.domain.use_case

import com.example.graphql_compose.domain.CountryClient
import com.example.graphql_compose.domain.DetailedCountry

class GetCountryUseCase(
    private val countryClient: CountryClient
) {

    suspend fun execute(code: String): DetailedCountry? {
        return countryClient.getCountry(code)
    }
}
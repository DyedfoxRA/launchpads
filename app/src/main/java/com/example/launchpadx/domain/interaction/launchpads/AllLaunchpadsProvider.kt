package com.example.launchpadx.domain.interaction.launchpads

import com.example.launchpadx.data.entity.Launchpad
import com.example.launchpadx.data.response.LaunchpadsResponse
import retrofit2.Response

interface AllLaunchpadsProvider {
    suspend fun execute(): Response<List<Launchpad>>
}
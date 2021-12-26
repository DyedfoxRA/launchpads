package com.example.launchpadx.domain.interaction.launchpads

import com.example.launchpadx.data.entity.LaunchpadsResponse
import retrofit2.Response

interface AllLaunchpadsProvider {
    suspend fun execute(): Response<LaunchpadsResponse>
}
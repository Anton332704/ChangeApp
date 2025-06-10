package com.example.fake.domain

import com.example.fake.data.BigPersonalRepository
import com.example.fake.data.UserData

class GetPersonalInfoUseCase(val repo: BigPersonalRepository) {
    suspend fun execute(id: Int): String {
        val data = repo.getPeronalInfo(id)
        return data.name + " " + data.id
    }
}
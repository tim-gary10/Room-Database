package com.garyjmj.roomdatabase.repository

import androidx.lifecycle.LiveData
import com.garyjmj.roomdatabase.data.UserDao
import com.garyjmj.roomdatabase.model.User

class UserRepository(private val userDao: UserDao) {
    val readAllData : LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user : User){
        userDao.addUser(user)
    }

    suspend fun updateUser(user: User){
        userDao.updateUser(user)
    }

    suspend fun deleteUser(user: User){
        userDao.deleteUser(user)
    }

    suspend fun deleteAllUser(){
        userDao.deleteAllUser()
    }
}
package com.example.p1_ap2_stephany_2018_0654.di

import android.content.Context
import androidx.room.Room
import com.example.p1_ap2_stephany_2018_0654.data.Parcial1Dao
import com.example.p1_ap2_stephany_2018_0654.data.repository.Parcial1Repository
import com.example.p1_ap2_stephany_2018_0654.data.Parcial1Db
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesParcialDb(@ApplicationContext context: Context): Parcial1Db {
        return  Room.databaseBuilder(
            context,
            Parcial1Db::class.java,
            "ParcialDb")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun providesParcial1Dao(parcial1Db: Parcial1Db): Parcial1Dao {
        return  parcial1Db.parcial1Dao    }

    @Provides
    fun providesParcial1Repository(parcial1Dao: Parcial1Dao): Parcial1Repository {
        return  Parcial1Repository(parcial1Dao)
    }


}
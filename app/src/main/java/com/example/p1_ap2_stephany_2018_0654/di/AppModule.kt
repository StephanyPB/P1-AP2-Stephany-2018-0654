package com.example.p1_ap2_stephany_2018_0654.di

import android.content.Context
import androidx.room.Room
import com.example.p1_ap2_stephany_2018_0654.data.PrestamoDao
import com.example.p1_ap2_stephany_2018_0654.data.repository.PrestamosRepository
import com.example.p1_ap2_stephany_2018_0654.data.PrestamosDb
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
    fun providesPrestamosDb(@ApplicationContext context: Context): PrestamosDb {
        return  Room.databaseBuilder(
            context,
            PrestamosDb::class.java,
            "PrestamosDb")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun providesPrestamosDao(prestamosDb: PrestamosDb): PrestamoDao {
        return  prestamosDb.prestamoDao    }

    @Provides
    fun providesPrestamosRepository(prestamoDao: PrestamoDao): PrestamosRepository {
        return  PrestamosRepository(prestamoDao)
    }


}
package br.com.guilhermereisapps.businesscard

import android.app.Application
import br.com.guilhermereisapps.businesscard.data.AppDatabase
import br.com.guilhermereisapps.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}
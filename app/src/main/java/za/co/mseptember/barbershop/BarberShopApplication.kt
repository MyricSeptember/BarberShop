package za.co.mseptember.barbershop

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import za.co.mseptember.barbershop.injection.DaggerBarbershopComponent
import javax.inject.Inject

class BarberShopApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        initializeApplication()
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingAndroidInjector
    }

    open fun initializeApplication() {

        DaggerBarbershopComponent.builder().application(this).build().inject(this)
    }

}
package za.co.mseptember.barbershop.injection

import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import za.co.mseptember.barbershop.BarberShopApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [(AndroidSupportInjectionModule::class),
    (ActivityBuilderModule::class),
    (BarbershopModule::class)])
interface BarbershopComponent {

    fun inject(barberShopApplication: BarberShopApplication)

    @Component.Builder
    interface Builder {

        fun barbershopModule(barbershopModule: BarbershopModule): Builder

        @BindsInstance
        fun application(application: BarberShopApplication): Builder

        fun build(): BarbershopComponent

    }

}
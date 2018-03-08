package za.co.mseptember.barbershop.injection

import dagger.Module
import dagger.android.support.AndroidSupportInjectionModule

@Module(includes = [(AndroidSupportInjectionModule::class)])
class BarbershopModule {
}
package ru.evolinc.core

import kotlin.reflect.KClass

interface CommunicatorsManager {

    fun <T : Any> retrieve(clazz: KClass<*>): T
}
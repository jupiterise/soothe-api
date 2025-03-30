package com.jupiterise.soothe_api

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<SootheApiApplication>().with(TestcontainersConfiguration::class).run(*args)
}

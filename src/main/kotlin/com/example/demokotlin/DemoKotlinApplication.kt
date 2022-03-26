//package com.example.demokotlin
//
//import org.springframework.boot.autoconfigure.SpringBootApplication
//import org.springframework.boot.runApplication
//
//@SpringBootApplication
//class DemoKotlinApplication
//
//fun main(args: Array<String>) {
//	runApplication<DemoKotlinApplication>(*args)
//}


/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package demo.kotlinhelloworld

class App {
	val greeting: String
		get() {
			return "Hello World!, wassup?"
		}
}

fun main() {
	println(App().greeting)
}

package com.github.wreulicke.sandbox

import io.dropwizard.Application
import io.dropwizard.setup.Environment


object MyApplication{
  def main(args: Array[String]) = {
    new MyApplication().run(args: _*)
  }
}

class MyApplication extends Application[ApplicationConfiguration] {

  override def getName: String = "hello-world"

  override def run(conf: ApplicationConfiguration, environment: Environment): Unit = {
    val resource = new Resource(conf.template, conf.defaultName)
    val healthCheck = new SimpleHealthCheck
    environment.healthChecks().register("template", healthCheck)
    environment.jersey().register(resource)
  }
}
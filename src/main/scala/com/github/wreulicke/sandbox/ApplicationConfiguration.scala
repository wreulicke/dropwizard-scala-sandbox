package com.github.wreulicke.sandbox

import io.dropwizard.Configuration

import scala.beans.BeanProperty

class ApplicationConfiguration extends Configuration {

  @BeanProperty
  val template: String = "xxx"
  @BeanProperty
  val defaultName = "Stranger"

}

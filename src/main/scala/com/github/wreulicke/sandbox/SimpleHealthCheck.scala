package com.github.wreulicke.sandbox

import com.codahale.metrics.health.HealthCheck
import com.codahale.metrics.health.HealthCheck.Result

class SimpleHealthCheck extends HealthCheck {
  override def check() = Result.healthy("living")
}

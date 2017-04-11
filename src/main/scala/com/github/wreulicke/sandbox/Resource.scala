package com.github.wreulicke.sandbox

import java.util.Optional
import javax.ws.rs.core.MediaType
import javax.ws.rs.{GET, Path, Produces, QueryParam}

import com.codahale.metrics.annotation.Timed

@Path("/hello-world")
@Produces(Array(MediaType.APPLICATION_JSON))
class Resource(template: String, defaultName: String) {

  @GET
  @Timed
  def sayHello(@QueryParam("name") optional: Optional[String]) =
    Message(String.format(template, optional.orElse(defaultName)))

}

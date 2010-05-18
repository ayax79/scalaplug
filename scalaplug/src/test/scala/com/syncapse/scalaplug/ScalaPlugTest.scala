package com.syncapse.scalaplug

import org.specs.Specification
import org.mockito.Mockito
import com.jivesoftware.base.{User, UserManager}

class ScalaPlugTest extends Specification with Mockito {

  var userManager = mock(UserManager)
  var user = mock(User)

  userManager.getUser(1) returns user
  user.name returns "admin"

  
  
}
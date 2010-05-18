package com.syncapse.scalaplug

import org.specs.{SpecificationWithJUnit}
import org.specs.mock.Mockito
import com.jivesoftware.base.{UserManager, User}

class ScalaPlugTest extends SpecificationWithJUnit with Mockito {
  var userManager = mock[UserManager]
  var user = mock[User]

  userManager.getUser(1) returns user
  user.getName returns "admin"

  var scalaPlugin = new ScalaPlugin()
  scalaPlugin.userManager = userManager

  scalaPlugin.init
  there was one(userManager).getName

  "The init method" should {


    "should get the admin user" in {
      //      userManager.getUser(1) was called
    }

    "should call the user's name method" in {
    }

  }

}
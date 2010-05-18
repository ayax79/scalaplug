package com.syncapse.scalaplug

import com.jivesoftware.base.plugin.Plugin
import reflect.BeanProperty
import org.slf4j.LoggerFactory
import com.jivesoftware.base.UserManager

class ScalaPlugin extends Object with Plugin[ScalaPlugin] {

  var log = LoggerFactory.getLogger(getClass)

  @BeanProperty
  var userManager: UserManager = null

  def destroy = {
    log.info("The plugin is now being destroyed")
  }

  def init = {
    log.info("The plugin is now starting up")
    val admin = userManager.getUser(1)
    log.info("Here is the admin user "+ admin)
  }
  
}
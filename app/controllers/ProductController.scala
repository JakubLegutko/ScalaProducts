package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}

class ProductController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def listProducts = Action {
    Ok("List of products")
  }
}
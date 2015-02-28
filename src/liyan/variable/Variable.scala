package liyan.variable

/**
 * 2.变量
 * Created by liyan on 15-2-28.
 */
object Variable {

  /**
   * 主函数
   * @param args
   */
  def main(args: Array[String]) {
    var helloWorldVar = "Hello World!" //可变变量
    val helloWorldVal = "Hello World!" //不可变变量
    helloWorldVar = "LiYan, Hello World!" //OK
    //helloWorldVal = "LiYan, Hello World!" //Error
    println(helloWorldVar)
    println(helloWorldVal)
  }

}

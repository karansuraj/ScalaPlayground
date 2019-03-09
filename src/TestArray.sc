import scala.collection.mutable.ArrayBuffer

val a = ArrayBuffer.fill(3,3)(0)

a(2)(1) = 4

a(0) = ArrayBuffer(1,2,3,2)



val graph2 = ArrayBuffer(ArrayBuffer(0,2,3,0),
                          ArrayBuffer(0,0,5,4),
                          ArrayBuffer(0,0,0,2),
                          ArrayBuffer(1,0,0,0))

graph2(0) += 2
val tArr = graph2(0)

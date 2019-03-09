import collection.mutable
import scala.collection.mutable.ArrayBuffer

object Graph{
  case class Edge(val dest: Vertex, val weight:Int)

  class Vertex{
    //This approach is adjacency list similar
    val edges = mutable.Buffer[Edge]()
  }

  /* This approach is adjacency list similar */
  //Makes an array of 4 vertices
  //val graph1 = new Array[Vertex](4) //Alternate

  def main(args: Array[String]): Unit = {
    val graph1 = Array.fill(4)(new Vertex)
    //Creates an edge from vertex 0 to vertex 1 of weight 2 and from vertex 0 to vertex 2 of weight 3
    graph1(0).edges += Edge(graph1(1),2) += Edge(graph1(2),3)
    graph1(1).edges += Edge(graph1(2),5) += Edge(graph1(3),4)
    graph1(2).edges += Edge(graph1(3),2)
    graph1(3).edges += Edge(graph1(0),1)

    //This is a directed graph
    val graph2 = ArrayBuffer(
      ArrayBuffer(0,2,3,0),
      ArrayBuffer(0,0,5,4),
      ArrayBuffer(0,0,0,2),
      ArrayBuffer(1,0,0,0))

    graph2(0) += 4
    val a: ArrayBuffer[Int] = graph2(0)
    //a += 4

    //A non-directed graph would be symmetric across the diagonal, but that means weights would be same both ways

    //Downside of adjacency matrix would be if large number of vertices, but small number of edges
    //This might also be a problem when we add new vertices to graph b/c need to create new row & col

    println("Hello World!")
  }
}
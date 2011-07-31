package simple_queues;

trait Queue {
  def dequeue(queue : String) : String
  def dequeueWithTimeout(queue : String, timeout : Int) : String

  def enqueue(queue : String, value : String) : String
}

object SimpleQueues {
  private class Redis(val host : String, val port : Int) extends Queue {
    def dequeue(queue : String) : String = { "" }
    def dequeueWithTimeout(queue : String, timeout : Int) : String = { "" }

    def enqueue(queue : String, value : String) : String = {
      throw new RuntimeException("TODO")
    }
  }

  def redis(host : String = "127.0.0.1", port : Int = 6379) : Queue =
    new Redis(host, port)
}

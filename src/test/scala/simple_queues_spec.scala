package simple_queues;

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers

class SimpleQueuesSpec extends Spec with ShouldMatchers {
  describe("Redis SimpleQueues") {
    val queue = SimpleQueues.redis()

    describe("enqueueing") {
      val queue = SimpleQueues.redis()

      it("should enqueue an empty String") {
        queue.enqueue("queue", "")
      }
    }
  }
}

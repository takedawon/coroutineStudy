package example1

import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking { // CoroutineScope 수신객체
        println(coroutineContext)
        // CoroutineScope 는 CoroutineContext를 가지고 있다.
        // CoroutineContext 는 코루틴을 제대로 처리하기 위한 정보이다.
        // 실행 결과 : [BlockingCoroutine{Active}@370736d9, BlockingEventLoop@5f9d02cb]
        println(Thread.currentThread().name) // 어떤 스레드에서 수행하고 있는지 확인할 수 있음.
        println("Hello")
    }
}
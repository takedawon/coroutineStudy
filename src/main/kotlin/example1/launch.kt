package example1

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    // launch 코루틴 빌더, runBlocking 과 다른 코루틴을 만들 수 있는 빌더이다.
    // 새로운 코루틴을 만들기 때문에 새로운 코루틴 스코프를 만든다.
    // runBlocking 은 코드 블럭의 수행이 끝날때 까지 다른 블록 수행을 막는다.
    // launch 코루틴 빌더는 코루틴을 만들어 코드를 수행하게 하고, 다른 코드를 함께 수행하도록 하는 코드이다.
    // "할 수 있다면, 다른 코루틴 코드를 같이 수행" 시키는 코루틴 빌더이다.

    // runBlocking 으로 코루틴을 만든 다음에야 launch를 수행할 수 있다.
    launch {
        println("launch : ${Thread.currentThread().name}")
        println("World!")
    }
    println("runBlocking : ${Thread.currentThread().name}")
    println("Hello")
}

// 1. runBlocking 이 mainThread 를 수행하고 있기 때문에 launch는 대기한다.(runBlocking 코드 들이 메인 쓰레드를 다 사용할 때까지 대기하는것)
// 2. runBlocking 작업이 끝나고 launch 블록이 실행된다.
// launch는 우리가 만든 코드를 Queue에 넣어두고 다음 순서를 기다린다.


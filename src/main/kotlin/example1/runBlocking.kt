package example1

import kotlinx.coroutines.runBlocking

/**
 * runBlocking 은 코루틴 빌더이다. 말 그대로 코루틴을 만든다.
 * runBlocking 은 코루틴을 만들고 코드 블록의 수행이 끝날 때 까지 다음 코드를 수행하지 못하도록 막는다.
 * 그래서 블로킹(Blocking) 이다.
 * */

fun main() = runBlocking { // expression body 형태
    println(this) // runBlocking 의 수신객체는 코루틴.
    // 수신 객체는 extension lambda 라고 부름. 람다를 확장한 것처럼 쓰일수 있다는 것.
    // 코드 블록이 코루틴을 확장한 것처럼 쓸 수 있는 개념?
    // 실행 결과 : BlockingCoroutine{Active}@527740a2 .// BlockingCoroutine: 사용 코루틴, Active : 활성상태 유무
    // BlockingCoroutine 은 CoroutineScope 의 자식이다.
    // Coroutine은 CoroutineScope와 함께한다. 코루틴의 시작은 코루틴 스코프다.
    println(Thread.currentThread().name) // 어떤 스레드에서 수행하고 있는지 확인할 수 있음.
    println("Hello")
}
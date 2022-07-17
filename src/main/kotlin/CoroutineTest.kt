import kotlinx.coroutines.runBlocking

/**
 * runBlocking 은 코루틴 빌더이다. 말 그대로 코루틴을 만든다.
 * runBlocking 은 코루틴을 만들고 코드 블록의 수행이 끝날 때 까지 다음 코드를 수행하지 못하도록 막는다.
 * 그래서 블로킹(Blocking) 이다.
 * */

fun main() = runBlocking {
    println(Thread.currentThread().name)
    println("Hello")
}
import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    // 배열 선언 및 초기화
    val arr = arrayOf(1, 1, 2, 2, 2, 8)
    // 사이즈가 6인 배열에 인덱스마다 입력받은 수로 저장
    val arr2:Array<Int> = Array(6) {i -> nextInt()}
    // 빈 배열 객체 생성
    val arr3:Array<Int> = Array(6) { i -> 0 }

    for(i:Int in arr.indices) {
        if(arr[i] != arr2[i])
            arr3[i] = arr[i] - arr2[i]
        print("${arr3[i]} ")
    }
}
package cn.clean

def closure = {
    println "running closure"
}

// 1.调用闭包
closure()

// 2.调用闭包
closure.call()

def closure1(Closure closure){
    println "start"
    closure()
}
// 传入闭包
closure1({println "传入的参数闭包"})

// 当传参时闭包在最右边，可以写到括号外面
closure1(){println "传入的参数闭包写到括号外面了"}

// 省去外面的括号就是
closure1 {println "传入的参数闭包的最简单写法"}

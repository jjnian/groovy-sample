package cn.clean

class Test3{
    // groovy的三个权限public protected private
    // 如果没有声明权限就是public
    // 没有显示声明权限的属性，groovy会自动生成get、set方法
    // 声明为final的属性不会生成get、set方法
    def username

    // groovy可以不写返回值、参数类型、return等关键字
    // 默认返回最后一行
    def say(name){
        "my name is ${name}"
    }

    def run(){
        "I am running"
    }
}

def test3 = new Test3()

// 1.对类的属性的读写第一种方法
test3.username=111
println test3.username

// 2.对类的属性的读写第二种方法
test3.setUsername('jiruixin')
println test3.getUsername()

// 3.对类的属性的读写第三种方法
test3['username'] = false
println test3['username']

// 调用类的方法
// println test3.say('groovy')

// 方法调用在没有歧义的时候可以用不加()
// 没有参数的情况下不能省略
def name = test3.say"groovy"
println name




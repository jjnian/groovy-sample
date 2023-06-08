package cn.clean

def name = "groovy"
// 单引号不支持变量应用，不支持换行
def name1 = 'i am ' +
        '${name}'
println name1

// 可以用${}引用变量 不支持换行
def name2 = "i am " +
        "${name}"
println name2

// 不支持引用变量，支持换行
def name3 = '''i am 
                    ${name}'''
println name3




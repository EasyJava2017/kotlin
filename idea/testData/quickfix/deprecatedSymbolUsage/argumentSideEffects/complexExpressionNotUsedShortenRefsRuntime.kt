// "Replace with 'newFun()'" "true"
package ppp

fun bar(): Int = 0

@Deprecated("", ReplaceWith("newFun()"))
fun oldFun(p: Int = ppp.bar()) {
    newFun()
}

fun newFun(){}

fun foo() {
    <caret>oldFun()
}

// "class org.jetbrains.kotlin.idea.quickfix.replacement.replaceWith.DeprecatedSymbolUsageFix" "false"
// ERROR: Too many arguments for @Deprecated public fun oldFun(): Unit defined in root package in file callWithError.kt

@Deprecated("", ReplaceWith("newFun()"))
fun oldFun() {
}

fun newFun(){}

fun foo() {
    <caret>oldFun(123)
}

import kotlinx.browser.document
import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.HTMLHeadingElement

fun main() {
    val greetButton = document.getElementById("greetButton") as HTMLButtonElement
    val greetText = document.getElementById("greetText") as HTMLHeadingElement
    greetButton.addEventListener("click", {
        greetText.textContent = "Hello, Kotlin/JS!"
    })
}

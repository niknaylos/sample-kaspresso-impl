package me.arwazkhan.activitylifecycle
import android.view.View
import com.kaspersky.kaspresso.screens.KScreen
import org.hamcrest.Description
import org.hamcrest.TypeSafeMatcher


abstract class BaseScreen<T : KScreen<T>> : KScreen<T>() {

    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null
}
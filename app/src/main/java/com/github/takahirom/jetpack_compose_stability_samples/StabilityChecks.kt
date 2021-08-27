package com.github.takahirom.jetpack_compose_stability_samples

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

@Composable
fun String(name: String) {
    Text(text = "Hello $name!")
}


data class Article(val title: String)

@Composable
fun DataClass(article: Article) {
    Text(text = "Hello $article")
}

data class MutableArticle(var title: String)

@Composable
fun MutableDataClass(article: MutableArticle) {
    Text(text = "Hello $article")
}


data class HasThrowableDataClass(val error:Throwable)

@Composable
fun HasThrowableDataClass(hasThrowableDataClass: HasThrowableDataClass) {
    Text(text = "Hello $hasThrowableDataClass")
}

@Immutable data class HasThrowableWithImmutableAnnotation(val error:Throwable)

@Composable
fun HasThrowableWithImmutableAnnotation(hasThrowable: HasThrowableWithImmutableAnnotation) {
    Text(text = "Hello $hasThrowable")
}

@Stable data class HasThrowableWithStableAnnotation(val error:Throwable)

@Composable
fun HasThrowableWithStableAnnotation(hasThrowable: HasThrowableWithStableAnnotation) {
    Text(text = "Hello $hasThrowable")
}

data class HasSimpleClass(val simpleClass: SimpleClass)
class SimpleClass(val simpleText:String)

@Composable
fun HasSimpleClass(simpleClass: HasSimpleClass) {
    Text(text = "Hello $simpleClass")
}

data class HasHasThrowableDataClass(val obj: HasThrowableDataClass)

@Composable
fun HasHasThrowableDataClass(obj: HasHasThrowableDataClass) {
    Text(text = "Hello $obj")
}




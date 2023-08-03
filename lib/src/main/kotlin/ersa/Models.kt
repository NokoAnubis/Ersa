package ersa

class Endpoint(val path: String, val queryItems: List<QueryItem<Any>>?=null)

class QueryItem<T>(val key: String, val value: T)

enum class Method {
    GET,
    POST,
    PUT,
    DELETE
}


package ersa

public class Endpoint(path: String, queryItems: QueryItem<Any>) {}

public class QueryItem<T>(key: String, value: T) {}

enum class Method {
    GET,
    POST,
    PUT,
    DELETE
}


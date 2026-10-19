package lessons.lesson13.homeworks

fun main() {
    // 1. Среднее время выполнения теста
    val testDurations = mapOf("loginTest" to 12.5, "searchTest" to 8.0, "checkoutTest" to 20.3)
    println("1. Среднее время выполнения: ${testDurations.values.average()}")

    // 2. Список всех тестовых методов
    val testMetadata = mapOf(
        "testLogin" to "priority=high, owner=qa1",
        "testLogout" to "priority=low, owner=qa2",
        "testRegistration" to "priority=medium, owner=qa1"
    )
    println("2. Тестовые методы: ${testMetadata.keys}")

    // 3. Добавить новый тест и его результат
    val testResults = mutableMapOf("loginTest" to "passed", "searchTest" to "failed")
    testResults["checkoutTest"] = "passed"
    println("3. Результаты после добавления: $testResults")

    // 4. Количество успешных тестов
    val runResults = mapOf(
        "loginTest" to "passed", "searchTest" to "failed",
        "checkoutTest" to "passed", "profileTest" to "skipped"
    )
    println("4. Успешных тестов: ${runResults.count { it.value == "passed" }}")

    // 5. Удалить исправленный баг
    val bugTracker = mutableMapOf("BUG-101" to "open", "BUG-102" to "fixed", "BUG-103" to "in progress")
    bugTracker.remove("BUG-102")
    println("5. Баг-трекер после удаления: $bugTracker")

    // 6. Сообщение о странице и статусе её проверки
    val pagesStatus = mapOf("https://example.com" to 200, "https://example.com/about" to 404, "https://example.com/admin" to 500)
    println("6. Проверка страниц:")
    pagesStatus.forEach { (url, status) -> println("   Страница $url вернула статус $status") }

    // 7. Сервисы, время ответа которых превышает порог
    val responseTimes = mapOf("auth" to 120, "payments" to 450, "catalog" to 80, "orders" to 300)
    val threshold = 200
    println("7. Медленные сервисы (> $threshold мс): ${responseTimes.filterValues { it > threshold }}")

    // 8. Статус ответа endpoint или "не протестирован"
    val apiResults = mapOf("/users" to "200 OK", "/orders" to "500 Internal Server Error")
    val endpoint = "/products"
    println("8. Статус $endpoint: ${apiResults.getOrElse(endpoint) { "не был протестирован" }}")

    // 9. Значение "browserType", не может быть null
    val environmentConfig = mapOf("browserType" to "Chrome", "baseUrl" to "https://test.example.com", "timeout" to "30")
    val browserType: String = environmentConfig.getValue("browserType")
    println("9. browserType: $browserType")

    // 10. Копия словаря с версиями ПО с новой версией
    val versions = mapOf("app" to "1.0.0", "api" to "2.3.1")
    val newVersions = versions.toMutableMap()
    newVersions.put("web", "3.0.0")
    println("10. Исходные версии: $versions, копия: $newVersions")

    // 11. Настройки для модели или настройки по умолчанию
    val deviceSettings = mapOf("iPhone 15" to "iOS 17, 1179x2556", "Pixel 8" to "Android 14, 1080x2400")
    println("11. Настройки Galaxy S24: ${deviceSettings.getOrDefault("Galaxy S24", "Android, 1080x1920")}")

    // 12. Содержит ли словарь определённый код ошибки
    val testErrors = mapOf(404 to "Not Found", 500 to "Internal Server Error", 403 to "Forbidden")
    println("12. Есть ошибка 500: ${testErrors.containsKey(500)}")

    // 13. Сценарии определённой версии
    val scenarios = mapOf(
        "Login_v1" to "Passed", "Login_v2" to "Failed",
        "Search_v1" to "Skipped", "Search_v2" to "Passed", "Cart_v2" to "Passed"
    )
    val version = "v2"
    println("13. Сценарии версии $version: ${scenarios.filterKeys { it.endsWith("_$version") }}")

    // 14. Есть ли модули с неудачным тестированием
    val modulesResults = mapOf("Авторизация" to "passed", "Корзина" to "failed", "Профиль" to "passed")
    println("14. Есть неудачные модули: ${modulesResults.containsValue("failed")}")

    // 15. Добавить настройки из другого словаря
    val environmentSettings = mutableMapOf("os" to "Linux", "browser" to "Firefox")
    val extraSettings = mapOf("resolution" to "1920x1080", "locale" to "ru_RU")
    environmentSettings.putAll(extraSettings)
    println("15. Настройки тестовой среды: $environmentSettings")

    // 16. Объединить два словаря с багами
    val frontendBugs = mapOf("BUG-1" to "Кнопка не нажимается", "BUG-2" to "Съехала вёрстка")
    val backendBugs = mapOf("BUG-3" to "Таймаут запроса", "BUG-4" to "Неверный код ответа")
    println("16. Все баги: ${frontendBugs + backendBugs}")

    // 17. Очистить временные данные о последнем прогоне
    val lastRunData = mutableMapOf("startTime" to "10:00", "endTime" to "10:15", "runner" to "ci-agent-3")
    lastRunData.clear()
    println("17. Данные после очистки: $lastRunData")

    // 18. Исключить пропущенные тесты
    println("18. Отчёт без пропущенных: ${runResults.filterNot { it.value == "skipped" }}")

    // 19. Копия конфигураций без нескольких конфигураций
    val testConfigs = mapOf("smoke" to "5 мин", "regression" to "2 ч", "load" to "1 ч", "security" to "30 мин")
    println("19. Конфигурации без load и security: ${testConfigs - listOf("load", "security")}")

    // 20. Отчёт в виде списка строк
    val report = runResults.map { "${it.key}: ${it.value}" }
    println("20. Отчёт:")
    report.forEach { println("   $it") }

    // 21. Изменяемый словарь в неизменяемый для архивации
    val latestResults = mutableMapOf("loginTest" to "passed", "searchTest" to "passed")
    val archive: Map<String, String> = latestResults.toMap()
    println("21. Архив: $archive")

    // 22. Числовые ID тестов в строковые
    val durationsById = mapOf(1 to 3.5, 2 to 7.2, 3 to 1.8)
    val durationsByStringId: Map<String, Double> = durationsById.mapKeys { it.key.toString() }
    println("22. ID строками: $durationsByStringId")

    // 23. Увеличить оценки производительности на 10%
    val performance = mapOf("1.0" to 250.0, "1.1" to 230.0, "2.0" to 180.0)
    println("23. Оценки +10%: ${performance.mapValues { it.value * 1.1 }}")

    // 24. Пуст ли словарь с ошибками компиляции
    val compilationErrors = mapOf<String, String>()
    println("24. Ошибок компиляции нет: ${compilationErrors.isEmpty()}")

    // 25. Словарь с результатами нагрузочного тестирования не пуст
    val loadResults = mapOf("100 пользователей" to 120, "1000 пользователей" to 480)
    println("25. Есть результаты нагрузочного тестирования: ${loadResults.isNotEmpty()}")

    // 26. Все ли тесты прошли успешно
    println("26. Все тесты успешны: ${runResults.all { it.value == "passed" }}")

    // 27. Есть ли хотя бы один тест с ошибкой
    println("27. Есть тест с ошибкой: ${runResults.any { it.value == "failed" }}")

    // 28. Неуспешные тесты с "optional" в названии
    val servicesResults = mapOf(
        "optionalCacheTest" to "failed", "optionalLogsTest" to "passed",
        "paymentTest" to "failed", "optionalMetricsTest" to "skipped"
    )
    println("28. Неуспешные optional тесты: ${servicesResults.filter { it.value != "passed" && it.key.contains("optional") }}")
}

package lessons.lesson3.homework

// 1. Название мероприятия
val eventName: String = "Hackathon Survival"

// 2. Дата проведения
var eventDate: String = "10 September 2026"

// 3. Место проведения
var eventLocation: String = "Moscow"

// 4. Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы
private val detailBudget: String = ""

// 5. Количество участников
var countParticipant: Int = 0
    set(value) {
        require(value >= 0)
        field = value
    }

// 6. Длительность хакатона
val hackathonDuration: String = "1-3 days"

// 7. Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
private val supplierAgreements: String = ""

// 8. Текущее состояние хакатона
var hackathonStatus: String = ""

// 9. Список спонсоров
var sponsors: String = ""

// 10. Бюджет мероприятия
val eventBudget: String = ""

// 11. Текущий уровень доступа к интернету
var internetAccessLevel: String = ""

// 12. Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки
private var logisticsInformation: String = ""

// 13. Количество команд
var teamCount: Int = 0
    set(value) {
        require(value >= 0)
        field = value
    }

// 14. Перечень задач
var taskList: String = ""

// 15. План эвакуации
val planEvacuation: String = ""

// 16. Список доступного оборудования
var availableEquipment: String = ""

// 17. Список свободного оборудования
var freeEquipment: String = ""

// 18. График питания участников
lateinit var mealSchedule: String

// 19. План мероприятий на случай сбоев
private val responsePlanWhenFailed: String = ""

// 20. Список экспертов и жюри
val expertsAndJury: String = ""

// 21. Политика конфиденциальности
val privacyPolicy: String = ""

// 22. Приватные отзывы участников и зрителей для анализа проблем
private var privateFeedback: String = ""

// 23. Текущая температура в помещении
var roomTemperature: Int = 22
    set(value) {
        require(value in -50..60) { "Bad temperature range" }
        field = value
    }

// 24. Данные мониторинга и анализ производительности сетевого оборудования и интернет-соединения для целей отладки своих приложений командами
var networkPerformanceData: String = ""

// 25. Регулятор скорости интернета (понижающий коэффициент, например 0.5)
private var internetSpeedMultiplier: String = "0.5"

// 26. Уровень освещения
var lightingLevel: String = "Normal"

// 27. Лог событий мероприятия
private var eventLog: String = ""

// 28. Возможность получения медицинской помощи прямо на мероприятии
var medicalAssistanceAvailable: Boolean = true

// 29. Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций
private val securityProcedures: String = ""

// 30. Регистрационный номер мероприятия
private val eventRegistrationNumber: String = ""

// 31. Максимально допустимый уровень шума в помещении хакатона.
val maximumNoiseLevel: Int = 70

// 32. Индикатор превышения уровня шума в помещениях
var noiseLimitExceeded: Boolean = false

// 33. План взаимодействия с прессой
val pressInteractionPlan: String = ""

// 34. Детальная публичная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок
var teamProjectInformation: String = ""

// 35. Статус получения всех необходимых разрешений для проведения мероприятия
private var permitsStatus: String = ""

// 36. Индикатор доступности специализированного оборудования в данный момент
var specializedEquipmentAvailable: Boolean = false

// 37. Список партнеров мероприятия
var eventPartners: String = ""

// 38. Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия
val eventReport: String by lazy {
    ""
}

// 39. Внутренние правила распределения призов
private val prizeDistributionRules: String = ""

// 40. Список разыгрываемых призов
val prizes: String = ""

// 41. Контактная информация экстренных служб, медицинского персонала и других важных служб, для внутреннего пользования
private val emergencyContacts: String = ""

// 42. Особые условия для участников с ограниченными возможностями
var accessibilityConditions: String = ""

// 43. Общее настроение участников (определяется опросами)
var participantMood: String = ""

// 44. Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия, так как зависит от фактического состава команд и взятых в работу задач
lateinit var detailedHackathonPlan: String

// 45. Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия, но в момент инициализации неизвестно
lateinit var specialGuestName: String

// 46. Максимальное количество людей, которое может вместить место проведения
val maximumVenueCapacity: Int = 500

// 47. Количество часов, отведенное каждой команде для работы над проектом
val workingHoursPerTeam: Int = 48
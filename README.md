# ProgrammerDay

## Сборка проекта

```
./gradlew build
```

## Запуск сервера

```
./gradlew startServer
```

## Примеры запросов

```
curl http://localhost:8080?year=2017
{"errorCode":200,"dataMessage":"13/09/17"}
```

```
curl http://localhost:8080?year=2024
{"errorCode":200,"dataMessage":"12/09/24"}
```

```
curl http://localhost:8080?ye2r=2005
{"errorCode":400,"dataMessage":"Bad request"}
```

```
curl http://localhost:8080?year=30
{"errorCode":400,"dataMessage":"Bad request"}
```

```
curl http://localhost:8080?year=1997
{"errorCode":200,"dataMessage":"13/09/97"}
```

```
curl http://localhost:8080?yer=2020
{"errorCode":400,"dataMessage":"Bad request"}
```

```
curl http://localhost:8080?year=198
{"errorCode":400,"dataMessage":"Bad request"}
```

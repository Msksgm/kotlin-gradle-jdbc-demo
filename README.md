# KOTLIN-GRADLE-JDBC-DEMO

本記事は以下の zenn の記事のサンプルアプリになります。

# 実行方法

```bash:DBを起動
docker-compose up sample-pg pg-web
```

```bash:アプリケーションを実行
# ctrl + c で停止
./gradlew bootRun
```

```bash:DBを停止 & 削除
docker-compose down
```

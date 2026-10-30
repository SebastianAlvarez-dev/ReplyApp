# ReplyApp

Práctica de navegación dinámica con Jetpack Compose.

- Compacta: barra inferior.
- Mediana: riel lateral.
- Expandida: panel de navegación permanente.
- ViewModel para conservar la selección al rotar la pantalla.

## Ejecución

Abrir esta carpeta en Android Studio, seleccionar JDK 21 para Gradle y ejecutar `app`.
SDK 34, mínimo Android 7.0 (API 24). Gradle 8.6 y Android Gradle Plugin 8.3.1.

```powershell
.\gradlew.bat assembleDebug
```

## Fuente

Basado en la rama `nav-update` del [proyecto oficial Reply](https://github.com/google-developer-training/basic-android-kotlin-compose-training-reply-app), bajo licencia Apache 2.0.
[Codelab de navegación adaptable](https://developer.android.com/codelabs/basic-android-kotlin-compose-adaptive-navigation-for-large-screens?hl=es-419).
La aplicación utiliza correos de demostración locales.

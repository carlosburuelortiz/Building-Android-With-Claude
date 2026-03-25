# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build & Run

```bash
# Build debug APK
./gradlew assembleDebug

# Build release APK
./gradlew assembleRelease

# Install on connected device
./gradlew installDebug

# Run unit tests (JVM)
./gradlew test

# Run a single unit test class
./gradlew test --tests "mx.buruel.buildingandroidwithclaude.ExampleUnitTest"

# Run instrumented tests (requires connected device/emulator)
./gradlew connectedAndroidTest

# Lint
./gradlew lint
```

## Architecture

This is a single-module Android app (`:app`) using Jetpack Compose with no XML layouts.

- **Entry point**: `MainActivity` — sets up the Compose content tree with `setContent`, enables edge-to-edge display
- **Theme**: `ui/theme/` — `BuildingAndroidWithClaudeTheme` wraps Material3 with dynamic color (Android 12+) and fallback static light/dark schemes
- **Package**: `mx.buruel.buildingandroidwithclaude`

## Key Config

- **minSdk**: 24, **targetSdk**: 36, **compileSdk**: 36 (minor API level 1)
- **AGP**: 9.1.0, **Kotlin**: 2.2.10, **Compose BOM**: 2024.09.00
- All dependency versions are managed via the version catalog at `gradle/libs.versions.toml`
- Java source/target compatibility: 11

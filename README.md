
# Example Mod – Multi-loader Template

**Modules**: Fabric, Forge, NeoForge, Quilt, Paper, Velocity  
**Shared layers**: `core`, `mod-common`, `plugin-common`

## 使い方

1) ルートの `gradle.properties` を開き、`REPLACE_ME` になっている各バージョンを実際の値に置き換えてください。

2) `settings.gradle.kts` の `pluginManagement.plugins` にある Loom のバージョンも必要に応じて更新してください。

3) 最小ビルド例:
   - Fabric: `./gradlew :fabric:build`
   - Forge:  `./gradlew :forge:build`
   - NeoForge:`./gradlew :neoforge:build`
   - Quilt:  `./gradlew :quilt:build`（Quilt Loom使用時）
   - Paper:  `./gradlew :paper:build` → JAR をサーバ `plugins/` へ
   - Velocity:`./gradlew :velocity:build` → JAR をプロキシの `plugins/` へ

4) クライアントで動作確認（Loom ランタイム）:
   - Fabric: `./gradlew :fabric:runClient`
   - Forge:  `./gradlew :forge:runClient`
   - NeoForge:`./gradlew :neoforge:runClient`

## コード構造
- `core/` …… Minecraft/プラグインAPI非依存の純Java
- `mod-common/` …… 全ローダー共有のゲーム内処理
- `plugin-common/` …… Paper/Velocity 共通のメッセージ/設定（Adventure）
- `fabric|quilt|forge|neoforge/` …… 各ローダーのエントリポイント（実処理は mod-common）
- `paper|velocity/` …… サーバ/プロキシのエントリポイント（実処理は plugin-common）

## ヒント
- QuiltはFabric互換で動かす場合、Fabric JAR + QFAPI でも運用可。専用ビルド不要なら `include("quilt")` を外してください。
- Forge と NeoForge は `mods.toml` の `modLoader` が異なります（`javafml` / `neoforge`）。
- Architecturyの `@ExpectPlatform` で差分吸収する場合は `mod-common` にAPIを置き、各ローダーモジュールに実装を追加してください。
- Paper/Velocity は Kyori Adventure を使うとメッセージ表現の共通化が容易です。

# Drill Down Community Edition

This is the open-sourced codebase of the factory building game Drill Down, released in 2019 on Steam and Google Play. 

With Community Is Connected in it for updates and idea with maintainers idea

# Original Binaries for Android and PC are available at [dakror itch.io](https://dakror.itch.io/drill-down).

# Roadmap
- [ ] Add Mod Loader 
- [ ] Support Community Made Mod Loader
- [ ] Add New Compatibility for Android 14+
- [ ] Support IOS (i guess)


## Building from source

The game needs 64-bit Java >= 11 and Android Studio to compile.

1. Create a java keystore for code signing
2. Enter the credentials into `gradle.properties`
3. For Android run `gradlew android:assembleFullRelease`, for PC run `gradlew desktop:dist` to get the runnable binaries

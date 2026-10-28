import 'package:firebase_core/firebase_core.dart' show FirebaseOptions;
import 'package:flutter/foundation.dart' show defaultTargetPlatform, TargetPlatform;

class DefaultFirebaseOptions {
  static FirebaseOptions get currentPlatform {
    switch (defaultTargetPlatform) {
      case TargetPlatform.android:
        return android;
      default:
        throw UnsupportedError('DefaultFirebaseOptions are not configured for this platform.');
    }
  }

  static const FirebaseOptions android = FirebaseOptions(
    apiKey: 'AIzaSyAJ2AH2MhnaNAURJ3FCCDmGeU-jwrQAx-4',
    appId: '1:415422308607:web:de5e44b1423daa053aecca', // Web/Android configuration data
    messagingSenderId: '415422308607',
    projectId: 'apekade-56613',
    storageBucket: 'apekade-56613.firebasestorage.app',
  );
}

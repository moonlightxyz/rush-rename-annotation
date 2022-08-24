# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.something.extension.Toasts {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/something/extension/repack'
-flattenpackagehierarchy
-dontpreverify
